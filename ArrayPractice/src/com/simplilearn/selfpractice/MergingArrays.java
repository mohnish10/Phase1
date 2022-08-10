package com.simplilearn.selfpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergingArrays {
	
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Please enter the size of the array which you want");
n = sc.nextInt();
Integer[] a = new Integer[n];
Integer[] b = {70,80,90,100};
System.out.println("Please enter the array elements");
for(int i = 0;i<a.length;i++)
{
a[i]=sc.nextInt();	
}
System.out.println("Original array :-"+Arrays.toString(a));
List<Integer>list = new ArrayList<Integer>(Arrays.asList(a));
list.addAll(Arrays.asList(b));
Object[]c=list.toArray();
System.out.println("Merged array is :-"+Arrays.toString(c));
}
}
