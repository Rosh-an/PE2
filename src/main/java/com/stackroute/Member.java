package com.stackroute;

public class Member {
  String name;
  int age;
  double salary;

}

class MemberVariable
{
  Member mem=new Member();
  public String memberinit(String n,int a,double s)
  {
    mem.name=n;
    mem.age=a;
    mem.salary=s;
    System.out.println("Member's Name: "+mem.name);
    System.out.println("Member's Age: "+mem.age);
    System.out.println("Member's Salary: "+mem.salary);
    String res=n+" "+a+" "+s;
    return res;
  }


}
