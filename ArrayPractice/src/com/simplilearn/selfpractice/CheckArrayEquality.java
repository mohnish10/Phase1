package com.simplilearn.selfpractice;

import java.util.Arrays;

public class CheckArrayEquality 
{
public static void main(String[] args)
{
int a[] = {10,20,30};
int b[] = {10,20,30};
Boolean c = Arrays.equals(a, b);
if(c==true)
System.out.println("Arrays are equal");
else
System.out.println("Arrays are not equal");	
}







}
