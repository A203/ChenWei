package com.hfut.demo;

public class VarDemo {
	
	static int number;//定义类变量
	int age;
	
	
	public void varDefine()
	{
		//int 1a;//变量名不能以数字开头
		//int a@;包含不合法字符
		int $123;//合法标识符
		int productPrice;
		//int if;//标识符不能是关键字
		int i=5;
		int j;
		j=5;
		int i1,j1=5;
		int k=i+j;
		//定义final变量
		final float PI=3.14159f;
		//PI=3.14f；//final变量值只能被修改一次
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//访问方式：类名，属性名
		//System.out.println(VarDemo.number);
//		VarDemo demo=new VarDemo();
//		System.out.println("age数值"+demo.age);

		
		//访问方式：对象，属性名
//		VarDemo demo1=new VarDemo();
//		demo1.show();
//		
//		VarDemo demo2=new VarDemo();
//		demo2.show();
		
		VarDemo demo=new VarDemo();
		demo.min(5);
	 
	}
	
	
	public void show()
	{
		number++;
		age++;
		System.out.println("类变量number"+number);
		System.out.println("实例变量age"+age);
	}
	
	public void min(int i)
	{
//		System.out.println(i);
		int age=5;
		System.out.println("变量age"+age);
		System.out.println("成员变量age"+this.age);
		int j=0;
		if(i>j)
		{
			int k=j;//k表示两个数的最小值
			System.out.println(k);
		}
	}

}
