package com.simplilearn.selfpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveJavaElement {
	
public static void main(String[] args)
{
Integer[] a = {10,20,30,40,50,60,70,80,90,100};
System.out.println("Original array elements are :"+Arrays.toString(a));
List<Integer>list = new ArrayList<Integer>(Arrays.asList(a));
list.remove(5);
a = list.toArray(a);
System.out.println("Formatted array elements are :"+Arrays.toString(a));
}
}
