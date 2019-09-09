package com.stackroute;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class palinTest {

  private static palin pal;


  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    pal = new palin();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    pal = null;

  }

  /**
   * Rigorous Test :-)
   */
  @Test
  public void checkpalindrome() {
    assertEquals("Palindrome", pal.palindrome("anna"));
    assertEquals("Palindrome", pal.palindrome("12321"));
    assertEquals("Not Palindrome", pal.palindrome("stackroute"));
  }

  @Test
  public void checkpalindromefailure() {
    assertNotEquals("Not Palindrome", pal.palindrome("anna"));
    assertNotEquals("Not Palindrome", pal.palindrome("12321"));
    assertNotEquals("Palindrome", pal.palindrome("stackroute"));

  }


}
