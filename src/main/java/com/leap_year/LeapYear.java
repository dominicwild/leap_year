package com.leap_year;

public class LeapYear {

    // If this wasn't a static class, could make a reusable divisble method

    public static boolean isALeapYear(int year) {
        boolean divisbleBy4 = year % 4 == 0;
        boolean divisibleBy100 = year % 100 == 0;
        boolean divisibleBy400 = year % 400 == 0;
        return divisbleBy4 && !(divisibleBy100 && !divisibleBy400);
    }
    
}
