package com.stackroute;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.stackroute.App;
import com.stackroute.EvenNumTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenNumTestTest {
  private static EvenNumTest even;

  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    even= new EvenNumTest();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    even= null;

  }

  /**
   * Rigorous Test :-)
   */
  @Test
  public void checkeven() {
    assertEquals(false, even.isEven(1));
    assertEquals(true, even.isEven(64));
    assertEquals(false, even.isEven(57));
  }
  @Test
  public void checkevenfailure() {
    assertNotEquals(false, even.isEven(2));

  }
}






