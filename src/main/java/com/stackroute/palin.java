package com.stackroute;

public class palin {

  public String palindrome(String s) {
    if (s==""){ return null;}

    else {
      String rev = reverse(s);
      if (s.equals(rev)) {
        System.out.println("Palindrome");
        return("Palindrome");
      } else
        System.out.println("Not Palindrome");
      return("Not Palindrome");

    }

  }

  public String reverse(String s)
  {

    String temp="";
    for(int i=s.length()-1;i>=0;i--)
    {
      temp=temp+s.charAt(i);
    }
    return temp;}

}
