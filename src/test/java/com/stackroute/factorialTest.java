package com.stackroute;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class factorialTest {
  private static factorial fact;
  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    fact = new factorial();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    fact = null;

  }

  /**
   * Rigorous Test :-)
   */
  @Test
  public void factTest(){
    assertEquals("factorial",
      new String[]{"1","2",
      "6",
      "24",
      "120",
      "720",
      "5040",
      "40320",
      "362880",
      "3628800",
      "39916800",
      "479001600",
      "6227020800",
      "87178291200",
      "1307674368000",
      "20922789888000",
      "355687428096000",
      "6402373705728000",
      "121645100408832000",
      "2432902008176640000",
      "out-of-bound"},
      fact.longFactorial());
    assertEquals("factorial",
      new String[]{"1",
        "2",
        "6",
        "24",
        "120",
        "720",
        "5040",
        "40320",
        "362880",
        "3628800",
        "39916800",
        "479001600",
        "1932053504",
        "1278945280",
        "2004310016",
        "2004189184",
        "out-of-bound"},
      fact.IntFactorial());

  }

  @Test
  public void factTestfailure(){
    assertNotEquals("factorial",
      new String[]{"2","2",
        "6",
        "24",
        "12",
        "720",
        "5040",
        "40320",
        "362880",
        "3628800",
        "39916800",
        "479001600",
        "6227020800",
        "87178291200",
        "1307674368000",
        "20922779888000",
        "355687428096000",
        "6402373705728000",
        "121645100408832000",
        "2432902008176640000",
        "out-of-bound"},
      fact.longFactorial());
    assertNotEquals("factorial",
      new String[]{"1",
        "2",
        "7",
        "24",
        "120",
        "720",
        "5040",
        "40320",
        "362880",
        "3628800",
        "39916800",
        "479001600",
        "1932053504",
        "1276945280",
        "2004310016",
        "2004189184",
        "out-of-bound"},
      fact.IntFactorial());

  }
}
