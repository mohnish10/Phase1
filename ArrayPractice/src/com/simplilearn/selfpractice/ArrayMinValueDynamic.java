package com.simplilearn.selfpractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinValueDynamic {

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Please enter the size of the array");
n=sc.nextInt();
int[] a = new int[n];
System.out.println("Please enter the array elements");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();	
}
System.out.println("Array :"+Arrays.toString(a));
int min = a[0];
for(int i  = 0;i<a.length;i++)
{
if(a[i]<min)
min=a[i];	
}
System.out.println("Minimum value present in the array is :-"+min);
}
}
