package com.simplilearn.selfpractice;

public class SumOfArrayElements {
	
public static void main(String[] args)
{
int sum = 0;	
int[] a = {10,20,30,40,50,60};
for(int i = 0;i<a.length;i++)
{
sum = sum + a[i];	
}
System.out.println("Sum of the array elements are :"+sum);
}
}
