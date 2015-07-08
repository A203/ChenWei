package com.hfut.whiledemo;

public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//    System.out.println(1);
//    System.out.println(2);
    //初始条件
//    int i=1;
    /*
     * 使用while输出1-100
     */  
//    while(i<=100){
//    	 System.out.println(i);	
//    	 i++;//增量
//    }
//    
//    System.out.println("跳出循环后i的值："+i);
//   
//	}
    
    /*
     * 使用do-while输出1-100
     */    
//	do{
//		System.out.println(i);
//		i++;
//	}while(i<=100);
	
    /*
     * 使用for输出1-100
     */ 
//	for(int i=1;i<=100;i++)
//	{
//		System.out.println(i);
//	}
    
	
	
    int [] integers={1,2,3,4};//定义整型数组
//	for(int i=0;i<integers.length;i++)
//	{
//		System.out.println(integers[i]);
//	}
//	
    /*
     * 使用for-each输出1-100
     */
	for(int i:integers)
		System.out.println(i);
	
	}
}