package com.simplilearn.selfpractice;

import java.util.Scanner;

public class Array2DAdditionDynamic {

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int[][]a = new int[2][2];
int[][]b = new int[2][2];
int[][]c = new int[2][2];
System.out.println("Please enter the first array elements");
for(int i = 0;i<a.length;i++)
{
for(int j = 0;j<a[i].length;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("First array is");
for(int i = 0;i<a.length;i++)
{
for(int j = 0;j<a[i].length;j++)
{
System.out.println(a[i][j]);
}
}
System.out.println("Please enter the 2nd array elements");
for(int i = 0;i<b.length;i++)
{
for(int j = 0;j<b[i].length;j++)
{
b[i][j]=sc.nextInt();
}
}
System.out.println("Second array is");
for(int i = 0;i<b.length;i++)
{
for(int j = 0;j<b[i].length;j++)
{
System.out.println(b[i][j]);	
}
}
for(int i = 0;i<a.length;i++)
{
for(int j = 0;j<b.length;j++)
{
c[i][j]=a[i][j]+b[i][j];	
}
}
System.out.println("Addition of the 2 arrays is :-");
for(int i = 0;i<a.length;i++)
{
for(int j = 0;j<b.length;j++)
{
System.out.println(c[i][j]);	
}
}








}
}
