package com.simplilearn.selfpractice;

import java.util.Arrays;

public class ReverseAnArray {
	
public static void main(String[] args)
{
int[] a = {10,20,30,40,50,60};
System.out.println("Original array is :-"+Arrays.toString(a));
System.out.println("Reversed array is :");
for(int i = a.length-1;i>=0;i--)
{
System.out.println(a[i]);	
}
}
}
