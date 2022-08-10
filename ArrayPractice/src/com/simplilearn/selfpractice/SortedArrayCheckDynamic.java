package com.simplilearn.selfpractice;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArrayCheckDynamic {
	
public static void main(String[] args)
{
Scanner sc  = new Scanner(System.in);
int n;
boolean check = true;
System.out.println("Please enter the size of the array");
n = sc.nextInt();
int[]a=new int[n];
System.out.println("Please enter the array elements");
for(int i = 0;i<a.length;i++)
{
a[i]=sc.nextInt();	
}
System.out.println("Array is" + " " +Arrays.toString(a));
for(int i = 0;i<a.length-1;i++)
{
if(a[i]>a[i+1])
{
check=false;
break;
}
}
if(check)
System.out.println("Array is sorted");
else
System.out.println("Array is not sorted");
}
}
