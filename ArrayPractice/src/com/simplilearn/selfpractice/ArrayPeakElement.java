package com.simplilearn.selfpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayPeakElement {

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Please enter the size of the array which you want");
n=sc.nextInt();
Integer[] a = new Integer[n];
System.out.println("Please enter the array elements");
for(int i = 0;i<a.length;i++)
{
a[i]=sc.nextInt();	
}
System.out.println("Array :-"+Arrays.toString(a));
Arrays.sort(a);
System.out.println("Sorted array :-"+Arrays.toString(a));
List<Integer>list = new ArrayList<Integer>(Arrays.asList(a));
System.out.println("Peak element is :-"+Collections.max(list));
}
}
