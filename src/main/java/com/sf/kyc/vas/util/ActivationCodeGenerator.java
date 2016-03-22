package com.sf.kyc.vas.util;

/**
 *
 * @author Seamfix
 */
public class ActivationCodeGenerator {
    private final static int WIDTH = 5;
    private final static char PASSWORD_CHARACTERS[] = "0123456789".toCharArray();

    public static String generateCode() {
        return generateCode(WIDTH);
    }
    public static String generateCode(int width) {
        int lb = 0;
        int hb = PASSWORD_CHARACTERS.length - 1;
        StringBuilder voucher = new StringBuilder();
        for (int i = 0; i < width; i++) {
            int index = lb + (int) (Math.random() * (hb - lb + 1));
            voucher.append(PASSWORD_CHARACTERS[index]);
        }
        return voucher.toString();
    }
}
