/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.webservice.template;

import com.sf.kyc.vas.util.GenericMarshallerUnmarhsaller;
import javax.net.ssl.*;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.net.MalformedURLException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import lombok.extern.log4j.Log4j;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

/**
 *
 * @author UCHECHUKWU
 */
@Log4j
public class BaseRestTemplate<T> {

    private Class< T> clazz;

//    @Inject
//    SettingsDao settingsDao;
    public static Client client = null;

    public final void setClazz(Class< T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    public BaseRestTemplate() {
//        String connect_time_out = settingsDao.getSettingByName(AppSettings.ESB_CONNECT_TIMEOUT).getSettingsValue();
//        String read_time_out = settingsDao.getSettingByName(AppSettings.ESB_READ_TIMEOUT).getSettingsValue();
//        ClientConfig configuration = new ClientConfig();
//        configuration.property(ClientProperties.CONNECT_TIMEOUT, Integer.parseInt(connect_time_out));
//        configuration.property(ClientProperties.READ_TIMEOUT, Integer.parseInt(read_time_out));
        BaseRestTemplate.client = ClientBuilder.newClient(/*configuration*/);
    }

    public BaseRestTemplate(String username, String password) {
        BaseRestTemplate.client = ClientBuilder.newClient();
        client.register(HttpAuthenticationFeature.basic(username, password));
    }

    public BaseRestTemplate(String username, String password, boolean isSsl) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext ctx = SSLContext.getInstance("SSL");
        ctx.init(null, certs, new SecureRandom());
        BaseRestTemplate.client = ClientBuilder.newBuilder().hostnameVerifier(new TrustAllHostNameVerifier()).sslContext(ctx).build();
        client.register(HttpAuthenticationFeature.basic(username, password));
    }

    public T sendSms(String baseUrl, Object req, MultivaluedMap<String, Object> headers) throws Exception {
        try {
            WebTarget target = client.target(baseUrl);
            return (T) target.request().accept(MediaType.APPLICATION_JSON).headers(headers).post(Entity.entity(req, MediaType.APPLICATION_JSON));
        } finally {
            client.close();
        }
    }

    public T postMethodRapidXml(String baseUrl, String path, Object req, MultivaluedMap<String, Object> headers) throws Exception {
        try {
            WebTarget target = client.target(baseUrl.trim()).path(path);
            log.info(target.getUri().toURL().toString());
            Response rs = target.request().headers(headers).accept(MediaType.APPLICATION_XML).post(Entity.entity(req, MediaType.APPLICATION_XML));
            rs.bufferEntity();
            log.info("status" + rs.getStatus());
            String re = rs.readEntity(String.class);
            log.info("Response  " + re);
            return (T) new GenericMarshallerUnmarhsaller<T>().convertXMLToObject(clazz, re);
            //return (T) rs.readEntity(clazz); //target.request().headers(headers).accept(MediaType.APPLICATION_XML).post(Entity.entity(req, MediaType.APPLICATION_XML), clazz);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
            log.error(ex.getMessage());
            log.error(ex.getStackTrace().toString());
            return null;
        } finally {
            if (client != null) {
                client.close();
            }
        }

    }

    public T postMethodXml(String baseUrl, String path, Object req, MultivaluedMap<String, Object> headers) throws Exception {
        try {
            WebTarget target = client.target(baseUrl.trim()).path(path);
            log.info(target.getUri().toURL().toString());
            return (T) target.request().headers(headers).accept(MediaType.APPLICATION_XML).post(Entity.entity(req, MediaType.APPLICATION_XML), clazz);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
            log.error(ex.getMessage());
            log.error(ex.getStackTrace().toString());
            return null;
        } finally {
            if (client != null) {
                client.close();
            }
        }

    }

    public T postMethodJson(String baseUrl, Object req, MultivaluedMap<String, Object> headers) throws Exception {
        try {
            WebTarget target = client.target(baseUrl);
            return (T) target.request().headers(headers).accept(MediaType.APPLICATION_JSON).post(Entity.entity(req, MediaType.APPLICATION_JSON), clazz);
        } finally {
            client.close();
        }
    }

    public T postMethodXml(String baseUrl, Object req, MultivaluedMap<String, Object> headers) throws Exception {
        try {
            WebTarget target = client.target(baseUrl);
            return (T) target.request().headers(headers).accept(MediaType.APPLICATION_XML).post(Entity.entity(req, MediaType.APPLICATION_XML), clazz);
        } finally {
            client.close();
        }
    }
    TrustManager[] certs = new TrustManager[]{
        new X509TrustManager() {
            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            @Override
            public void checkServerTrusted(X509Certificate[] chain, String authType)
                    throws CertificateException {
            }

            @Override
            public void checkClientTrusted(X509Certificate[] chain, String authType)
                    throws CertificateException {
            }
        }
    };

    public static class TrustAllHostNameVerifier implements HostnameVerifier {

        public boolean verify(String hostname, SSLSession session) {
            return true;
        }

    }
}
