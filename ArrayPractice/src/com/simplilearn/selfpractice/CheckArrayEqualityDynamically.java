package com.simplilearn.selfpractice;

import java.util.Arrays;
import java.util.Scanner;

public class CheckArrayEqualityDynamically 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n1,n2;
System.out.println("Please enter the size of the 1st array");
n1 = sc.nextInt();
int[] a = new int[n1];
System.out.println("Please enter the 1st array elements");
for(int i = 0;i<a.length;i++)
{
a[i]=sc.nextInt();	
}
System.out.println("Please enter the size of the 2nd array");
n2 = sc.nextInt();
int[] b = new int[n2];
System.out.println("Please enter the 2nd array elements");	
for(int i = 0;i<b.length;i++)
{
b[i]=sc.nextInt();	
}
boolean c = Arrays.equals(a, b);
if(c==true)
System.out.println("Arrays a and b are equal");
else	
System.out.println("Arrays a and b are not equal");	
}
}