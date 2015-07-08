package com.hfut.demo;

public class Demo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
   int a[];
   int []a1;
   //分配内存空间
   a=new int[3];
   
   int size=5;
   a1=new int[size];
   
	//数组初始化
   a[0]=1;
   a[1]=2;
   a[2]=3;

   //方式2
   int b[]={1,2,3,4,5};
   int b1[]=new int[]{1,2,3,4,5};
	
  //输出a数组内容
   System.out.println("数组长度："+a.length);
   for(int i=0;i<a.length;i++)
   {
	   System.out.println(a[i]);
   }
   
   
   //冒泡排序
   int c[]={8,5,7,4};
   int temp=0;
   for(int i=c.length-1;i>0;i--)
   {
	   for(int j=0;j<i;j++)
	   {
		   if(c[i]<c[j])
		   {
			   temp=c[i];
			   c[i]=c[j];
			   c[j]=temp;
		   }
	   }
   }
   for(int i=0;i<c.length;i++)
   {
	 System.out.println(c[i]);  
   }
   
	}

}
