package com.hfut.demo;

public class Demo01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//抽象类是不能实例化的
		//Animal animal=new Animal();//编译出错
		
		Animal animal=new Tiger();//new Monkey();
		animal.sleep();
		
	}
}
//多态