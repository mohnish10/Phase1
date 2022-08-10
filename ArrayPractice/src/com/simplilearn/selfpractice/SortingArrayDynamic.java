package com.simplilearn.selfpractice;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayDynamic 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Please enter the size of the required array");
n = sc.nextInt();
int a[] = new int[n];
System.out.println("Please enter the array elements");
for(int i = 0;i<a.length;i++)
{
a[i] = sc.nextInt();
}
System.out.println("Original array :"+Arrays.toString(a));
Arrays.sort(a);
System.out.println("Sorted array :"+Arrays.toString(a));
}
}
