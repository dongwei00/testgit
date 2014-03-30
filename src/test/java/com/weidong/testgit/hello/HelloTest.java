package com.weidong.testgit.hello;

import org.joda.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Wei Dong on 2014/3/30.
 */
public class HelloTest {
    @Test
    public void testHello() throws Exception {
        String who = new LocalDate("2014-03-31").toString();
        Hello hello = new Hello();
        assertTrue(hello.hello(who).contains("Hello 2014-03-31"));
    }
}
