package com.simplilearn.selfpractice;

public class ArrayMinValue {
	
public static void main(String[] args)
{
int[] a = {12,2,20,3,4,0};
int min = a[0];
for(int i = 0;i<a.length;i++)
{
if(a[i]<min)
min=a[i];	
}
System.out.println("Minimum value present in the array is :-"+min);	
}
}