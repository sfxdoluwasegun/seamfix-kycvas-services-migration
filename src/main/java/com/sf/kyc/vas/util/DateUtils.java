/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.kyc.vas.util;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class DateUtils {

    public static Date toStartOfDay(Date date) {
        Calendar cal = Calendar.getInstance();       // get calendar instance
        cal.setTime(date);                           // set cal to date
        cal.set(Calendar.HOUR_OF_DAY, 0);            // set hour to midnight
        cal.set(Calendar.MINUTE, 0);                 // set minute in hour
        cal.set(Calendar.SECOND, 0);                 // set second in minute
        cal.set(Calendar.MILLISECOND, 0);            // set millis in second
        return cal.getTime();
    }

    public static Date toEndOfDay(Date date) {
        Calendar cal = Calendar.getInstance();       // get calendar instance
        cal.setTime(date);                           // set cal to date
        cal.set(Calendar.HOUR_OF_DAY, 23);            // set hour to midnight
        cal.set(Calendar.MINUTE, 59);                 // set minute in hour
        cal.set(Calendar.SECOND, 59);                 // set second in minute
        cal.set(Calendar.MILLISECOND, 999);            // set millis in second
        return cal.getTime();
    }
}
