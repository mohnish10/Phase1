package com.simplilearn.selfpractice;

import java.util.Scanner;

public class ArrayEquals 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);	
int n1;
int n2;
boolean result = true;
System.out.println("Please enter the size of the 1st array");
n1 = sc.nextInt();
System.out.println("Please enter the size of the 2nd array");
n2 = sc.nextInt();
int[]a = new int[n1];
int[]b = new int[n2];
System.out.println("Please enter the 1st array elements");
for(int i = 0;i<a.length;i++)
{
a[i]=sc.nextInt();	
}
System.out.println("Please enter the 2nd array elements");
for(int i = 0;i<b.length;i++)
{
b[i]=sc.nextInt();	
}




if(a.length==b.length)
{
for(int i = 0;i<a.length;i++)
{
if(a[i]!=b[i])
{
result = false;	
}
}
}
else
result=false;	


if(result==true)
System.out.println("Arrays are equal");
else
System.out.println("Arrays are not equal");
}
}



