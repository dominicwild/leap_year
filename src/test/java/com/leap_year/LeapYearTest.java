package com.leap_year;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class LeapYearTest {

    @ParameterizedTest
    @ValueSource(ints = { 1991, 1997})
    void years_not_divisble_by_4_are_not_leap_years(int year) {
        assertFalse(LeapYear.isALeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = { 1996, 2000, 2004, 2008, 2012, 2016, 2020 })
    void leap_years_are_divisble_by_4(int year) {
        assertTrue(LeapYear.isALeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = { 400, 800, 1200, 2400 })
    void leap_years_are_divisible_by_400(int year) {
        assertTrue(LeapYear.isALeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = { 1800, 1900, 2100, 2200, 2300, 2500, 2600, 2700, 2900, 3000 })
    void years_divisible_by_100_but_not_400_are_not_leap_years(int year){
        assertFalse(LeapYear.isALeapYear(year));
    }
}
