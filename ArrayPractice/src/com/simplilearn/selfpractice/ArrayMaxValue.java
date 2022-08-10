package com.simplilearn.selfpractice;

public class ArrayMaxValue {

public static void main(String[] args)
{
int[] a = {12,36,48,64,56};
int max = a[0];
for(int i = 0;i<a.length;i++)
{
if(a[i]>max)
max = a[i];
}
System.out.println("The max value of the array is :- "+max);
}
}
	
	
	

