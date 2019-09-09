package com.stackroute;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MemberTest {
  private static MemberVariable memb;

  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    memb = new MemberVariable();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    memb = null;

  }

  /**
   * Rigorous Test :-)
   */
  @Test
  public void checkmember() {
    assertEquals("Harry Potter 30 2500.3", memb.memberinit("Harry Potter",30,2500.3));
    assertEquals("Henry 14 1500.0", memb.memberinit("Henry",14,1500));
  }

  @Test
  public void checkmemberfailure() {
    assertNotEquals("Harry Potter 30 2500.3", memb.memberinit("Harry Potter1",20,3500.3));
  }
}
