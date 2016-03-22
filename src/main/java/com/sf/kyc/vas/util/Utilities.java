/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import lombok.extern.log4j.Log4j;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author UCHECHUKWU
 */
@Log4j
public class Utilities {

    private static AtomicReference<Long> currentTime = new AtomicReference<>(System.currentTimeMillis());

    private static DecimalFormat df = new DecimalFormat("#,###,###,###,###,##0.00");

    public static synchronized String requestId(String serverId) {
        Long prev;
        Long next = System.currentTimeMillis();
        do {
            prev = currentTime.get();
            next = next > prev ? next : prev + 1;
        } while (!currentTime.compareAndSet(prev, next));
        return serverId + next;
    }

    public static synchronized String externalRefNo() {
        Long prev;
        Long next = System.currentTimeMillis();
        do {
            prev = currentTime.get();
            next = next > prev ? next : prev + 1;
        } while (!currentTime.compareAndSet(prev, next));
        return String.valueOf(next);
    }

    public static String requestSignature(String requestId, String sourceCode, String password) {
        return DigestUtils.sha512Hex(requestId + sourceCode + password);
    }

    public static boolean isNullbytes(byte[] data) {
        boolean isNull = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != 0x00) {
                isNull = false;
            }
        }
        return isNull;
    }

    private static String padleft(String s, int len, char c) {
        s = s.trim();
        StringBuffer d = new StringBuffer(len);
        int fill = len - s.length();
        while (fill-- > 0) {
            d.append(c);
        }
        d.append(s);
        return d.toString();
    }

    public static String maskCCNumber(String ccnum) {
        int total = ccnum.length();
        int startlen = 3, endlen = 3;
        int masklen = total - (startlen + endlen);
        StringBuilder maskedbuf = new StringBuilder(ccnum.substring(0, startlen));
        for (int i = 0; i < masklen; i++) {
            maskedbuf.append('*');
        }
        maskedbuf.append(ccnum.substring(startlen + masklen, total));
        String masked = maskedbuf.toString();
        return masked;
    }

    public static String generateOTP(int otpLengthNumber) {
        String otp = new String();
        int otpSample = 0;
        for (int i = 0; i < otpLengthNumber; i++) {
            otp = otp + "9";
        }
        otpSample = Integer.parseInt(otp);
        SecureRandom prng;
        try {
            prng = SecureRandom.getInstance("SHA1PRNG"); //Number Generation Algorithm
            otp = new Integer(prng.nextInt(otpSample)).toString();
            otp = (otp.length() < otpLengthNumber) ? padleft(otp, otpLengthNumber, '0') : otp;
        } catch (NoSuchAlgorithmException e) {
            log.info(e.getMessage());
        }
        return otp;
    }

    public static String formatPhoneNumber(String phoneNumber, String daillingCode) {
        String phone = "";
        phoneNumber = phoneNumber.replace("+", "").trim();
        phoneNumber = phoneNumber.replace("-", "").trim();
        phoneNumber = phoneNumber.replace("(", "").trim();
        phoneNumber = phoneNumber.replace(")", "").trim();
        daillingCode = daillingCode.replace("+", "").trim();
        daillingCode = daillingCode.replace("-", "").trim();
        daillingCode = daillingCode.replace("(", "").trim();
        daillingCode = daillingCode.replace(")", "").trim();
        if (!(phoneNumber != null && phoneNumber.startsWith(daillingCode))) {
            if (phoneNumber.startsWith("0")) {
                phone = phoneNumber.replaceFirst("0", daillingCode);
            } else {
                phone = daillingCode + phoneNumber;
            }

        } else if (phoneNumber.startsWith(daillingCode)) {
            String fph = phoneNumber.substring(daillingCode.length());
            if (fph.startsWith("0")) {
                phone = daillingCode + fph.substring(1);
            } else {
                phone = daillingCode + fph;
            }

        }
        return phone;
    }

    public static String padString(String originalString) {
        String padded = leftPad(originalString);
        padded = RightPad(padded);
        return padded.trim();
    }

    public static String removeNullbytes(byte[] data) {
        String dataOut = "";
        for (int i = 0; i < data.length; i++) {
            if (data[i] != 0x00) {
                dataOut += (char) data[i];
            }
        }
        return dataOut;
    }

    public static String leftPad(String originalString) {
        String paddedString = originalString;
        char padCharacter = 'S';
        int i = 0;
        while (i < 3) {
            paddedString = padCharacter + paddedString;
            i++;
        }
        return paddedString;
    }

    public static int gen() {
        Random r = new Random(System.currentTimeMillis());
        return 10000 + r.nextInt(20000);
    }

    public static String formatTimeSatmp(Timestamp time) {
        String s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(time);
        return s;
    }

    public static XMLGregorianCalendar toXMLGregorianCalendar(Timestamp timestamp) {
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(toDate(timestamp));
        XMLGregorianCalendar xmlCalendar = null;

        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException ex) {
            java.util.logging.Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }

        return xmlCalendar;
    }

    public static java.util.Date toDate(java.sql.Timestamp timestamp) {
        long milliseconds = timestamp.getTime() + (timestamp.getNanos() / 1000000);
        return new java.util.Date(milliseconds);
    }

    public static XMLGregorianCalendar toXMLGregorianCalendar(Date date) {
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(date);
        XMLGregorianCalendar xmlCalendar = null;

        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException ex) {
            java.util.logging.Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }

        return xmlCalendar;
    }

    public static Date addYearsToDate(Date date, int numberOfYears) {
        Date result = null;
        try {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.YEAR, numberOfYears);
            result = cal.getTime();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    public static String formatDate(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String formattedDate = "";
        try {
            formattedDate = sdf.format(date);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }

        return formattedDate;
    }

    public static String RightPad(String originalString) {
        String paddedString = originalString;
        char padCharacter = 'S';
        int i = 0;
        while (i < 3) {
            paddedString = paddedString + padCharacter;
            i++;
        }
        return paddedString;
    }

//    public static void main(String[] args) {
//        // System.out.print(Long.parseLong(externalRefNo()));
//        System.out.print(String.valueOf(new Date().getTime()));
//    }
    public static String getStackTrace(final Throwable throwable) {
        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw, true);
        throwable.printStackTrace(pw);
        return sw.getBuffer().toString();
    }

    public static String format(BigDecimal amount) {
        double amountDbl;
        if (amount == null) {
            amountDbl = 0;
        } else {
            amountDbl = amount.doubleValue();
        }
        return df.format(amountDbl);
    }

    public static String format(String amount) {
        double amountDbl;
        if (amount == null) {
            amountDbl = 0;
        } else {
            amountDbl = Double.parseDouble(amount);
        }
        return df.format(amountDbl);
    }
}
