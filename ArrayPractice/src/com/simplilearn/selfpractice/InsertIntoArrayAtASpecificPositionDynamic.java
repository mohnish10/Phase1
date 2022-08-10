package com.simplilearn.selfpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertIntoArrayAtASpecificPositionDynamic {

public static void main(String[] args) throws Exception
{
Scanner sc = new Scanner(System.in);
int element,index;
Integer[] a = new Integer[6];
System.out.println("Please enter the array elements");
for(int i = 0;i<a.length;i++)
{
a[i]=sc.nextInt();	
}
System.out.println("Original array is :-"+Arrays.toString(a));
List<Integer>list = new ArrayList<Integer>(Arrays.asList(a));
System.out.println("Please enter the element which you want to insert");
element = sc.nextInt();
System.out.println("Please enter the index where you want the element to be inserted");
index = sc.nextInt();
try
{
if(index>a.length)
System.out.println("Index is out of bounds");	
}
catch(Exception e)
{
e.printStackTrace();
}
if(index<=a.length)
{	
list.set(index, element);
a = list.toArray(a);
System.out.println("Formatted array :-"+Arrays.toString(a));
}
}
}
