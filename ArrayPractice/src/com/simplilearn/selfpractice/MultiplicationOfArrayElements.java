package com.simplilearn.selfpractice;

public class MultiplicationOfArrayElements {

public static void main(String[] args)
{
int mult = 1;
int[] a = {10,20,30,40,50,60};
for(int i = 0;i<a.length;i++)
{
mult = mult * a[i];	
}
System.out.println("Multiplication of the array elements is :-"+mult);
}
}
