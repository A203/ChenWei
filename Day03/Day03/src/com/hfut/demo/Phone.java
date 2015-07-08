package com.hfut.demo;

public class Phone {
	  //属性（特征）
	   String name;
	   String brand;
	   int price;
	   
	   //行为（方法）
	   //void 方法的返回类型
	   //call 方法名
	   void newcall(){
		   System.out.println("打电话....");
	   }
	   void sendMsg(){
		   System.out.println("发短信....");
	   }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	    //实例化一个手机
		Phone p=new Phone();
		
		p.name="note";
		p.brand="爆米花";
		p.price=99;
		
		System.out.println(p.name);
		p.sendMsg();
		 
	}

}
