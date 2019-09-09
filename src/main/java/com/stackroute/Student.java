package com.stackroute;

public class Student {
  public double avg(int n,int g[])
  {
    double sum=0;
    for(int i=0;i<n;i++)
      sum+=g[i];

    return sum/n;
  }
  public double min(int n,int g[])
  {
    int min=g[0];
    for(int i=1;i<n;i++)
    {if(g[i]<min)
      min=g[i];}
    return min;
  }
  public double max(int n,int g[])
  {
    int max=g[0];
    for(int i=1;i<n;i++)
    {if(g[i]>max)
      max=g[i];}
    return max;
  }
}
