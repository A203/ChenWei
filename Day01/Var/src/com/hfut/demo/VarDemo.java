package com.hfut.demo;

public class VarDemo {
	
	static int number;//���������
	int age;
	
	
	public void varDefine()
	{
		//int 1a;//���������������ֿ�ͷ
		//int a@;�������Ϸ��ַ�
		int $123;//�Ϸ���ʶ��
		int productPrice;
		//int if;//��ʶ�������ǹؼ���
		int i=5;
		int j;
		j=5;
		int i1,j1=5;
		int k=i+j;
		//����final����
		final float PI=3.14159f;
		//PI=3.14f��//final����ֵֻ�ܱ��޸�һ��
		
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//���ʷ�ʽ��������������
		//System.out.println(VarDemo.number);
//		VarDemo demo=new VarDemo();
//		System.out.println("age��ֵ"+demo.age);

		
		//���ʷ�ʽ������������
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
		System.out.println("�����number"+number);
		System.out.println("ʵ������age"+age);
	}
	
	public void min(int i)
	{
//		System.out.println(i);
		int age=5;
		System.out.println("����age"+age);
		System.out.println("��Ա����age"+this.age);
		int j=0;
		if(i>j)
		{
			int k=j;//k��ʾ����������Сֵ
			System.out.println(k);
		}
	}

}