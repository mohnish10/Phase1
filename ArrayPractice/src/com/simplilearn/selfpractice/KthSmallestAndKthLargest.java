package com.simplilearn.selfpractice;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;






public class KthSmallestAndKthLargest 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the size of the array which you want");
int n = sc.nextInt();
Integer[] a = new Integer[n];
System.out.println("Please enter the array elements");
for(int i = 0;i<a.length;i++)
{
a[i]=sc.nextInt();	
}
System.out.println("Array is :-"+Arrays.toString(a));
Arrays.sort(a);
System.out.println("Please enter the index for which you want the smallest element");
int index = sc.nextInt();
try
{
if(index>a.length)
System.out.println("Index entered is out of bounds. \n Please try again later");
}
catch(Exception e)
{
e.printStackTrace();	
}
if(index<=a.length)
{
System.out.println("Kth largest element is");
System.out.println(a[index-1]+" ");
Arrays.sort(a,Collections.reverseOrder());
System.out.println("Kth smallest element is");
System.out.println(a[index-1]+" ");
}
}
}
