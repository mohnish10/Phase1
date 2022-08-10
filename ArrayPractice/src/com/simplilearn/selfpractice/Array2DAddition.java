package com.simplilearn.selfpractice;



public class Array2DAddition 
{
public static void main(String[] args)
{
int[][]a = {{2,4},{3,5}};
int[][]b = {{2,4},{3,5}};
int[][]c= {{0,0},{0,0}};
for(int i = 0;i<a.length;i++)
{
for(int j = 0;j<b.length;j++)
{
c[i][j]=a[i][j]+b[i][j];	
}
}
for(int i = 0;i<a.length;i++)
{
for(int j = 0;j<b.length;j++)
{
System.out.println(" "+c[i][j]);
}
}
	
	
	
	
	
	
	
}	
}