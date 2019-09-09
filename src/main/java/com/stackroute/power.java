package com.stackroute;

public class power {

  public String power(String s)
  {
    int n=Integer.parseInt(s);
    while(n%4==0)
    {
      n=n/4;
    }
    if(n==1)
      return "true";
    else
      return "false";
  }
}
