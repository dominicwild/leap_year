package com.leap_year;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class LeapYearTest {

    @ParameterizedTest
    @ValueSource(ints = { 1996, 2000, 2004, 2008, 2012, 2016, 2020 })
    void is_a_leap_year_if_divisible_by_4(int year) {
        assertTrue(LeapYear.isALeapYear(year));
    }

}
