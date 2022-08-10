package com.simplilearn.selfpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayElementsRemovalDynamic 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n,element;
System.out.println("Please enter the size of the array");
n = sc.nextInt();
Integer[] a = new Integer[n];
System.out.println("Please enter the array elements");
for(int i = 0;i<a.length;i++)
{
a[i]=sc.nextInt();	
}
System.out.println("Original array elements are :-"+Arrays.toString(a));
List<Integer>list = new ArrayList<Integer>(Arrays.asList(a));
System.out.println("Please enter the index of the element to be removed");
element = sc.nextInt();
list.remove(element);
a = list.toArray(a);
System.out.println("Formatted array is :-"+Arrays.toString(a));
}
}
