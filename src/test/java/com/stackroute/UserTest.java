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

public class UserTest {
  private static User user;
  @BeforeClass
  public static void setup() {
    // This methods runs, before running any one of the test case
    // This method is used to initialize the required variables
    user = new User();

  }

  @AfterClass
  public static void teardown() {
    // This method runs, after running all the test cases
    // This method is used to clear the initialized variables
    user = null;

  }

  /**
   * Rigorous Test :-)
   */
  @Test
  public void UserTest(){

    user.userinit("A","B",21,13000);
    assertEquals("Ensure Age",true,user.ensureAge());
    assertEquals("Valid Age check",true,user.isValidAge());
    assertEquals("Full Name","A B",user.getFullName());

    user.userinit("A","B",70,13000);
    assertEquals("Ensure Age",true,user.ensureAge());
    assertEquals("Valid Age check",false,user.isValidAge());
    assertEquals("Full Name","A B",user.getFullName());

    user.userinit("A","B",110,13000);
    assertEquals("Ensure Age",false,user.ensureAge());
    assertEquals("Valid Age check",false,user.isValidAge());
    assertEquals("Full Name","A B",user.getFullName());
  }

  @Test
  public void UserTestfailure()
  {
    user.userinit("A","C",150,13000.0);
    assertNotEquals("Ensure Age",true,user.ensureAge());
    assertNotEquals("Valid Age check",true,user.isValidAge());
    assertNotEquals("Full Name","A B",user.getFullName());
  }
}
