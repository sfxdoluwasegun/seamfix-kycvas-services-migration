/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.util;

import org.mindrot.jbcrypt.BCrypt;
import org.apache.log4j.Logger;

/**
 *
 * @author Nippon
 */
public class CryptoUtils {

    private static final transient Logger LOG = Logger.getLogger(CryptoUtils.class);

    public static boolean validatePassword(String userPassword, String dbPassword, boolean encrypted) {
        if (userPassword == null || dbPassword == null) {
            throw new NullPointerException("Invalid Arguments");
        }
        if (encrypted) {
            return isValid(userPassword, dbPassword);
        } else {
            return userPassword.equals(dbPassword);
        }
    }

    public static boolean isValid(String plainPassword, String hashedPlainPassword) {
        if (plainPassword == null || hashedPlainPassword == null) {
            throw new NullPointerException("Invalid Arguments");
        }
        return BCrypt.checkpw(plainPassword, hashedPlainPassword);
    }

    public static String hashPassword(String plainPassword) {
        if (plainPassword == null) {
            throw new NullPointerException("Invalid Arguments");
        }
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }

}
