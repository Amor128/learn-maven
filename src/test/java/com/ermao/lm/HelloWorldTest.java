package com.ermao.lm;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void testGetHello() {
        assertEquals("Hello, world", new HelloWorld().getHello());
    }
}
