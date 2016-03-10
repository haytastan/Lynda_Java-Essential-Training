package com.example.java;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);
        
        // displaying a specific time
        GregorianCalendar gc = new GregorianCalendar(2009, 1, 28); // february is 1
        gc.add(GregorianCalendar.DATE, 1); // add 1 to the date
        Date d2 = gc.getTime(); // returns a date object
        System.out.println(d2);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));
        
        
        /////////////////Java 8/////////////////////
        
        // localdatetime, localtime and localdate classes might be used
        LocalDateTime ldt = LocalDateTime.now();
        // we are instantiating the LocalDateTime object by calling the now method
        // it is equivalent of constructing a date object with no parameters
        System.out.println(ldt);
        
        // we are displaying a specific time
        LocalDate ld = LocalDate.of(2009, 1, 28);
        // month numbering goes from 1 to 12
        System.out.println(ld);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dtf.format(ld));
        
        DateTimeFormatter dtf1 = DateTimeFormatter.ISO_DATE; // ISO_DATE is constant
        System.out.println(dtf1.format(ld));

    }

}
/*
 Wed Mar 09 19:35:31 EET 2016
Sun Mar 01 00:00:00 EET 2009
01 Mart 2009 Pazar
2016-03-09T19:35:31.436
2009-01-28
1/28/2009
2009-01-28
 */
