package com.simplilearn.selfpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionOfArrayToArrayList {
	

public static void function(int arr[])
{
ArrayList<Integer> list = new ArrayList<Integer>();
for(int i = 0;i<arr.length;i++)
list.add(new Integer(arr[i]));
System.out.print(list);
}
	
	
	
	
	
public static void main(String[] args)
{
int[] a = {10,20,30,40,50,60};
function(a);
}
}
