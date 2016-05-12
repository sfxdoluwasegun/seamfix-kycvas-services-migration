package com.sf.kyc.vas.ws.filter;

import com.sf.kyc.vas.dao.DataBundleDao;
import com.sf.kyc.vas.util.RSAServiceUtil;
import static com.sf.kyc.vas.util.VConstant.REQUEST_TIME;
import static com.sf.kyc.vas.util.VConstant.SIGNATURE;
import static com.sf.kyc.vas.util.VConstant.USERNAME;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;
import lombok.extern.log4j.Log4j;
import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Component;

/**
 *
 * @author UCHECHUKWU
 */
@Component
@Provider
@Log4j
public class AuthFilter implements ContainerRequestFilter {

    @Inject
    public DataBundleDao vtuUserDao;

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        log.debug("ContainerRequestFilter AuthFilter called.....");
        UriInfo uriInfo = requestContext.getUriInfo();
        String path = uriInfo.getPath();
        log.info("UriInfo Path: " + path);
//        if (path.startsWith("services/api/v1/")) {
//            serviceAuthentication(requestContext);
//        }

    }

    public void serviceAuthentication(ContainerRequestContext requestContext) {
        try {
            MultivaluedMap<String, String> headers = requestContext.getHeaders();
            String requestTime = null;
            String username = null;
            String requestSignature = null;
            RSAServiceUtil rsu = new RSAServiceUtil();
            rsu.initiate("vtupuk.key", "vtupvk.key");
            log.info("Authenticating request signature ");
            if (headers == null) {
                log.info("Invalid headers supplied ");
                throw new WebApplicationException(Response.Status.UNAUTHORIZED);
            }
            try {
                for (String header : headers.keySet()) {
                    if (header.equalsIgnoreCase(SIGNATURE)) {
                        requestSignature = new String(Base64.decodeBase64(headers.getFirst(header)));
                    }
                    if (header.equalsIgnoreCase(REQUEST_TIME)) {
                        requestTime = new String(Base64.decodeBase64(headers.getFirst(header)));
                    }
                    if (header.equalsIgnoreCase(USERNAME)) {
                        username = new String(Base64.decodeBase64(headers.getFirst(header)));
                    }
                }
                if (requestTime == null || username == null || requestSignature == null) {
                    throw new WebApplicationException(Response.Status.UNAUTHORIZED);
                }

            } catch (Exception ex) {
                log.info("Authentication header errors ");
                log.info(ex.getMessage());
                throw new WebApplicationException(Response.Status.BAD_REQUEST);
            }

//            TariffPlan vtuUser = vtuUserDao.getVtuUserByEmail(username);
//            if (vtuUser == null) {
//                log.info("Unidentifable user/device request");
//                throw new WebApplicationException(Response.Status.UNAUTHORIZED);
//            }
//            if (vtuUser.getVasClientId() == null) {
//                log.info("No valid client ID found for this client request");
//                throw new WebApplicationException(Response.Status.UNAUTHORIZED);
//            }
//            String calculatedSignature = Utilities.requestSignature(requestTime, vtuUser.getVasClientId(), username);
//            if (!calculatedSignature.equals(requestSignature)) {
//                log.info("Invalid signature");
//                throw new WebApplicationException(Response.Status.UNAUTHORIZED);
//            }
            log.info("Application request signature verified ");
           // requestContext.setProperty("encryptedVasClientId", rsu.encrypt(vtuUser.getVasClientId()));

        } catch (Exception ex) {
            Logger.getLogger(AuthFilter.class.getName()).log(Level.SEVERE, null, ex);
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        }

    }

}
