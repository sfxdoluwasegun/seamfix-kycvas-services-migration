/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.Security;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.logging.Level;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Nippon
 */
public class RSAServiceUtil {

    private static final transient Logger LOG = Logger.getLogger(RSAServiceUtil.class);
    private Cipher ecipher;
    private Cipher dcipher;

    public RSAServiceUtil() {
        try {
            Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
            ecipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA1AndMGF1Padding", "BC");
            dcipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA1AndMGF1Padding", "BC");
        } catch (Exception ex) {
            LOG.error(ex.getMessage());
        }
    }

    public void initiate(String publicKeyFile, String privateKeyFile) throws Exception {
        Resource publicKeyResource = null;
        Resource privateKeyResource = null;
        try {
            publicKeyResource = new ClassPathResource("/keys/" + publicKeyFile);
            privateKeyResource = new ClassPathResource("/keys/" + privateKeyFile);
            PKCS8EncodedKeySpec pvSpec = new PKCS8EncodedKeySpec(IOUtils.toByteArray(privateKeyResource.getInputStream()));
            KeyFactory factory = KeyFactory.getInstance("RSA", "BC");
            KeyFactory factory2 = KeyFactory.getInstance("RSA", "BC");
            RSAPrivateKey privateKey = (RSAPrivateKey) factory.generatePrivate(pvSpec);
            X509EncodedKeySpec puSpec = new X509EncodedKeySpec(IOUtils.toByteArray(publicKeyResource.getInputStream()));
            RSAPublicKey publicKey = (RSAPublicKey) factory2.generatePublic(puSpec);
            if (privateKey != null) {
                ecipher.init(Cipher.ENCRYPT_MODE, publicKey);
                dcipher.init(Cipher.DECRYPT_MODE, privateKey);
            } else {
                LOG.error("RSA Key is null");
                throw new Exception("RSA Key is NULL");
            }

        } catch (Exception ex) {
            System.out.println(ex);
            LOG.error("Unable to create keys: " + ex.getMessage());
            throw ex;
        }
    }

    public String encrypt(String plainText) {
        String encrypted = null;
        try {
            byte[] bytes = plainText.getBytes(Charset.forName("UTF-8"));
            byte[] scrambled = ecipher.doFinal(plainText.getBytes(Charset.forName("UTF-8")));

            encrypted = Base64.encodeBase64String(scrambled);
        } catch (IllegalBlockSizeException | BadPaddingException ex) {
            java.util.logging.Logger.getLogger(RSAServiceUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return encrypted;
    }

    public String decrypt(String encryptedText) throws IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
        byte[] bytes = Base64.decodeBase64(encryptedText);
        byte[] scrambled = dcipher.doFinal(bytes);
        return Utilities.removeNullbytes(new String(scrambled, Charset.forName("UTF-8")).getBytes("UTF-8"));
    }

//    public static void main(String[] args) throws Exception {
//        RSAServiceUtil rsa = new RSAServiceUtil();
//        rsa.initiate("vtupuk.key", "vtupvk.key");
//        String u = "Uchehdhfhfhhfhh";
//        String ue = rsa.encrypt(u);
//        System.out.println(ue);
//        System.out.println(rsa.decrypt(ue));
//
//    }
}
