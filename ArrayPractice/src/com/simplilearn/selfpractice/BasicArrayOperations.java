package com.simplilearn.selfpractice;

import java.util.Scanner;

public class BasicArrayOperations{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the size of the array");
int n = sc.nextInt();	
int[] b = new int[n];
System.out.println("Please enter the elements");
for(int i = 0;i<b.length;i++)
{
b[i]=sc.nextInt();	
}
System.out.println("Array elements are");
for(int i = 0;i<b.length;i++)
{
System.out.print(b[i] +" ");	
}
int[] a = {10,20,30};
System.out.println("Original array elements of array a are");	
for(int i = 0;i<a.length;i++)
{
System.out.println(a[i]);	
}
System.out.println("Length of the array a is" + " " +a.length);
}
}
