package com.simplilearn.selfpractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortDescending {
	
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);	
int n;
System.out.println("Please enter the size of the array");
n=sc.nextInt();
int[]a=new int[n];
System.out.println("Please enter the array elements");
for(int i = 0;i<a.length;i++)
{
a[i]=sc.nextInt();	
}
System.out.println("Array :-"+Arrays.toString(a));
Arrays.sort(a);
System.out.println("Array sorted in ascending order"+Arrays.toString(a));
System.out.println("Array sorted in descending order");
for(int i = a.length-1;i>=0;i--)
{
System.out.print(a[i]);	
}
}
}
