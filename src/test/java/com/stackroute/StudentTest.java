package com.stackroute;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentTest {
  private static Student std;

  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    std = new Student();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    std = null;

  }

  /**
   * Rigorous Test :-)
   */
  @Test
  public void checkavg() {
    int arr[]={1,2,3,4,5};
    assertEquals(3.0, std.avg(5,arr),1e-15);

  }

  @Test
  public void checkavgfailure() {
    int arr[]={1,2,3,6,5};
    assertNotEquals(3.0, std.avg(5,arr));

  }

  @Test
  public void checkmin() {
    int arr[]={1,2,3,4,5};
    assertEquals(1, std.min(5,arr),1e-15);

  }

  @Test
  public void checkmax() {
    int arr[]={1,2,3,4,5};
    assertEquals(5, std.max(5,arr),1e-15);

  }
}
