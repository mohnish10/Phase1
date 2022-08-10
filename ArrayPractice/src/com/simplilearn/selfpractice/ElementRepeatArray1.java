package com.simplilearn.selfpractice;

public class ElementRepeatArray1 
{
public static void main(String[] args)
{
int[] a = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,7,7};
int[] count = new int[100];
for(int i = 0;i<a.length;i++)
{	
int tmp = a[i];
count[tmp]++;
}
for(int i = 1;i<count.length;i++)
{
if(count[i]>0 && count[i]==1)
System.out.printf("%d occurs %d times \n",i,count[i]);
else if(count[i]>=2)
System.out.printf("%d occurs %d times \n",i,count[i]);	
}





}
}
