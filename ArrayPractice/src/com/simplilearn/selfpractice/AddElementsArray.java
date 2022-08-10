package com.simplilearn.selfpractice;

import java.io.*;
import java.lang.*;
import java.util.*;
    

public class AddElementsArray {


public static Integer[] addX(int n,Integer[] arr, int x)
{
int i;
List<Integer>list = new ArrayList<Integer>(Arrays.asList(arr));
list.add(x);
arr = list.toArray(arr);
return arr;
}
	
	
public static void main(String[] args)
{
Integer[] a = {10,20,30,40,50,60,70,80,90,100};
int n = a.length;
System.out.println("Initial array is :"+Arrays.toString(a));
int x = 110;
a = addX(n,a,x);
System.out.println("Formatted array is :"+Arrays.toString(a));
}
	




	
}