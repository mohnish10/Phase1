package com.simplilearn.selfpractice;

import java.util.Scanner;

public class ArrayElementsAverage {
	
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n,average=0,sum=0;;
System.out.println("Please enter the size of the array");
n = sc.nextInt();
int[] a = new int[n];
System.out.println("Please enter the array elements");
for(int i = 0;i<a.length;i++)
{
a[i]=sc.nextInt();	
}
for(int i = 0;i<a.length;i++)
{
sum=sum+a[i];	
average = (sum)/n;	
}
System.out.println("Average of the array elements is :-"+average);
}
}
