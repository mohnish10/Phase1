package com.simplilearn.selfpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraySearch {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n,element;
System.out.println("Please enter the size of the array");
n=sc.nextInt();
Integer[] a = new Integer[n];
System.out.println("Please enter the array elements");
for(int i = 0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Please enter the element which you are looking for");
element = sc.nextInt();
List<Integer>list = new ArrayList<Integer>(Arrays.asList(a));
if(list.contains(element))
System.out.println("Element" + " " + element + " " + " is present");
else
System.out.println("Element" + " " + element + " " + " is not present");
}
}