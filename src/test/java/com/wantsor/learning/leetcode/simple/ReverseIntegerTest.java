package com.wantsor.learning.leetcode.simple;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

    @Test
    public void should_小于10时不用交换() {
        int result = ReverseInteger.reverse(9);
        assertEquals(9, result);
    }
    @Test
    public void should_2位数时交换() {
        int result = ReverseInteger.reverse(91);
        assertEquals(19, result);
    }
    @Test
    public void should_3位数时交换() {
        int result = ReverseInteger.reverse(912);
        assertEquals(219, result);
    }
    @Test
    public void should_交换后超过int最大值时不交换() {
        int result = ReverseInteger.reverse(Integer.MAX_VALUE);
        assertEquals(0, result);
    }
    @Test
    public void should_当为负数时先交换再加上负号() {
        int result = ReverseInteger.reverse(-12345);
        assertEquals(-54321, result);
    }

}