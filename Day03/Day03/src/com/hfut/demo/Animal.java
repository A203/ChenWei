package com.hfut.demo;

//一个类中如果有抽象方法，则这个类是抽象类
public abstract class Animal {
	public abstract void sleep();
}

//自雷继承抽象父类，必须要实现父类中的所有抽象方法，否则子类也是抽象的
//abstract class Tiger extends Animal{
class Tiger extends Animal{
	
	public void sleep() {
		// TODO 自动生成的方法存根
	System.out.println("趴着睡。。。");
	}
}
 
class Monkey extends Animal{
	public void sleep(){
		System.out.println("仰着睡。。。");
	}	
}
//某个类是抽象类，但是其中可以没有抽象方法