package com.stackroute;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class powerTest {

    private static power pow;

    @BeforeClass
    public static void setup() {
      // This methods runs, before running any one of the test case
      // This method is used to initialize the required variables
      pow = new power();

    }

    @AfterClass
    public static void teardown() {
      // This method runs, after running all the test cases
      // This method is used to clear the initialized variables
      pow = null;

    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkpower() {
      assertEquals("false", pow.power("24"));
      assertEquals("true", pow.power("64"));
      assertEquals("true", pow.power("16"));
    }

  @Test
  public void checkpowerfailure() {
    assertNotEquals("false", pow.power("256"));


  }
}
