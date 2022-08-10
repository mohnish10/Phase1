package com.simplilearn.selfpractice;

import java.util.Scanner;

public class MultiplicationOfArrayElementsDynamic {
	
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n;
int mult = 1;
System.out.println("Please enter the size of the array :");
n=sc.nextInt();
int[] a = new int[n];
System.out.println("Please enter the array elements");
for(int i = 0;i<a.length;i++)
{
a[i]=sc.nextInt();	
}
for(int i = 0;i<a.length;i++)
{
mult = mult * a[i];	
}
System.out.println("Multiplication of the array elements is :-"+mult);
}
}
