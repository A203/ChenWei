package com.huft.demo;

public class Demo5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
   int[]arr={21,13,91,23,72,78,88};
   int sum=0;
   int max=arr[0];
   int min=arr[0];
   
   for(int i=0;i<arr.length;i++){
	   sum=sum+arr[i];
	   if(arr[i]>max){
		   max=arr[i];
	   }
	   if(arr[i]<min){
		   min=arr[i];
	   }
     }
   System.out.println("sum:"+sum);
   System.out.println("max:"+max);
   }

}
