package com.simplilearn.selfpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertIntoArrayAtASpecificPosition {
public static void main(String[] args)
{
Integer[] a = {10,20,30,40,50,60};
System.out.println("Original array is - "+Arrays.toString(a));
List<Integer>list = new ArrayList<Integer>(Arrays.asList(a));
list.set(2, 70);
a = list.toArray(a);
System.out.println("Formatted array is :- "+Arrays.toString(a));
}
}
