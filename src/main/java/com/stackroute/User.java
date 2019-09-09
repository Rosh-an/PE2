package com.stackroute;

public class User {
  String firstName,lastName;
  int age;
  double salary;
  public void userinit(String fname,String lname,int ag,double sal)
  {
    this.firstName=fname;
    this.lastName=lname;
    this.age=ag;
    this.salary=sal;
  }
  public boolean ensureAge()
  {
    if(age>=0 && age<=100)
      return true;
    else
      return false;
  }
  public boolean isValidAge()
  {
    if(age>=18 && age<=60)
      return true;
    else
      return false;
  }
  public String getFullName()
  {
    return (firstName+" "+lastName);
  }
}
