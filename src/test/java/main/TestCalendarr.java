package main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalendarr {


    @ParameterizedTest
    @ValueSource(ints = {1904, 2003, 1924, 1930, 2000})
    public void Should_check_if_year_is_leap_also_in_gregorian(int year) {
        Calendarr c = new Calendarr(year);
        GregorianCalendar g = new GregorianCalendar();
        boolean expectedResult = g.isLeapYear(year);
        boolean actualResult = c.isLeapYear();
        assertEquals(expectedResult, actualResult);


    }

    @ParameterizedTest
    @ValueSource(ints = {1903, 2001, 1999, 3921, 2222})
    public void Should_return_false(int year) {
        Calendarr c = new Calendarr(year);
        assertFalse(c.isLeapYear());
    }

    @ParameterizedTest
    @ValueSource(ints = {1904, 1940, 1952, 1980, 1996})
    public void Should_return_true(int year) {
        Calendarr c = new Calendarr(year);
        assertTrue(c.isLeapYear());
    }

// Implement test cases for the equivalent partitions

}
