package com.simplilearn.selfpractice;

import java.util.Arrays;

public class SortingArray 
{
public static void main(String[] args)
{
Integer[] a = {10,2,8,1,6,15};
System.out.println("Unsorted array is :"+Arrays.asList(a));
Arrays.sort(a);
System.out.println("Sorted array is "+Arrays.toString(a));
for(int a1:a)
{
System.out.println(a1);	
}
}
}
