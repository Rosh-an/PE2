package com.stackroute;

public class factorial {
  public String[] longFactorial(){

    String s="";
    int i=1;
    long f=1;
    while (f>0)
    {
      System.out.println(f);
      s=s+f+" ";
      i++;
      f=fact(i);
    }
    s=s+"out-of-bound";
    System.out.println("out-of-bound");
    s=s.trim();

    String res[]=s.split(" ");

//    for(String b:res)
//      System.out.println(b);
    return res;

  }

  public long fact(int n)
  {
    long p=1;
    for(int i=1;i<=n;i++)
    {
      p=p*i;
      if(p<0)
        return p;
    }
    return p;
  }

  public String[] IntFactorial(){

    String s="";
    int i=1;
    int f=1;
    while (f>0)
    {
      System.out.println("f");
      s=s+f+" ";
      i++;
      f=fact1(i);
    }
    s=s+"out-of-bound";
    System.out.println("out-of-bound");
    s=s.trim();

    String res[]=s.split(" ");


    return res;

  }

  public int fact1(int n)
  {
    int p=1;
    for(int i=1;i<=n;i++)
    {
      p=p*i;
      if(p<0)
        return p;
    }
    return p;
  }
}
