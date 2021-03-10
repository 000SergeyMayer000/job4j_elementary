package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class MaxTest {

    @Test
    public void when1max2() {
        int res = 100;
        int expect = Max.max(10, 100);
        Assert.assertEquals(res, expect);
    }

    @Test
    public void when2Max3() {
        int first = 10;
        int second = 100;
        int third = 90;
        Assert.assertEquals(second, Max.max(first, second, third));
    }
}