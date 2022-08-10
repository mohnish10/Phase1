package com.simplilearn.selfpractice;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayAlternateApproach 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n;
int temp=0;
System.out.println("Please enter the size of the array");
n = sc.nextInt();
int[]a = new int[n];
System.out.println("Please enter the array elements");
for(int i = 0;i<a.length;i++)
{
a[i]=sc.nextInt();	
}
System.out.println("Original unsorted array :"+Arrays.toString(a));
for(int i = 0;i<a.length;i++)
{
for(int j = i+1;j<a.length;j++)
{	
if(a[i]>a[j])
{
temp = a[i];
a[i]=a[j];
a[j] = temp;
}
}
}
System.out.println("Sorted array :-"+Arrays.toString(a));
}
}
