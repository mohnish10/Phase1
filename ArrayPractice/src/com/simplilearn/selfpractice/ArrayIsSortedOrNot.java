package com.simplilearn.selfpractice;

public class ArrayIsSortedOrNot {
	
public static void main(String[] args)
{
int[]a = {10,20,1,30,40};
boolean check =  true;
for(int i = 0;i<a.length;i++)
{
if(a[i]>a[i+1])
{
check = false;
break;
}
}
if(check)
System.out.println("Array is sorted");
else
System.out.println("Array is not sorted");	
}
}
