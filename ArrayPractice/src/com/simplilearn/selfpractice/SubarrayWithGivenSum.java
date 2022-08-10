package com.simplilearn.selfpractice;

public class SubarrayWithGivenSum 
{
public static void findSubarrays(int[] arr,int k)
{
for(int start = 0;start<arr.length;start++)
{
int subarray_sum=0;


for(int end=start;end<arr.length;end++)
{
subarray_sum = subarray_sum+arr[end];


if(subarray_sum==k)
{
System.out.println("Subarray found between indices" + start + " and " + end);
return;
}
}
}
System.out.println("No subarray with given sum equal to" + k + "is found in the array");
}

public static void main(String[] args)
{
int arr1[] = {10,20,-45,45,60};
int k1 = 60;
findSubarrays(arr1,k1);

int arr2[] = {1,2,4,15,0};
int k2 = 30;
findSubarrays(arr2,k2);



}
}
