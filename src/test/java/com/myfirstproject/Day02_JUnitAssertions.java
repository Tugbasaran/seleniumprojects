package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Day02_JUnitAssertions {

        @Test
                public void assertions(){

            assertEquals(1, 1);//assertEquals() --> if the first parameter value is equals to second parameter value, test will pass
            assertEquals("Hello", "Hello");
            assertTrue("Hello".contains("llo"));//assertTrue()--> if the value between parenthesis returns true, test will pass
            assertFalse(1 > 9);//assertFalse()--> if the value between parenthesis returns false, test will pass

        }
    }

