package com.simplilearn.selfpractice;

import java.util.Scanner;

public class SumOfArrayElementsDynamic {

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n;
int sum = 0;
System.out.println("Please enter the size of the array");
n = sc.nextInt();
int[] a = new int[n];
System.out.println("Please enter the array elements");
for(int i = 0;i<a.length;i++)
{
a[i] = sc.nextInt();	
}
for(int i = 0;i<a.length;i++)
{
sum = sum + a[i];	
}
System.out.println("Sum of the array elements are :-"+sum);
}
}
