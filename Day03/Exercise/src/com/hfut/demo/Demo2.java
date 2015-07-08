package com.hfut.demo;

public class Demo2 {
	
	int age;
	
	 void hello(){
		System.out.println("hello....");
	}
	
	 static String name="张三";
			 
	//静态方法，也称之为类方法
	static void hi(){
		System.out.println("hi....");
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Demo2 d=new Demo2();
		//当我们调用属性和方法的时候，一定是调用某个实例对象的属性或方法
//		d.age=10;
//		d.hello();
		System.out.println(Demo2.name);
		Demo2.hi();

	}

}
