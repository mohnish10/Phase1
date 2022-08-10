package com.simplilearn.selfpractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;




public class ArrayMaxValueDynamic 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n,max;
System.out.println("Please enter the size of the array");
n = sc.nextInt();
Integer[] a = new Integer[n];
System.out.println("Please enter the array elements");
for(int i = 0;i<a.length;i++)
{
a[i]=sc.nextInt();	
}
System.out.println("Array is :-"+Arrays.toString(a));
List<Integer>list = new ArrayList<Integer>(Arrays.asList(a));
System.out.println("The maximum value present in the array is :-"+Collections.max(list));
}
}