package com.hfut.demo;

public class Demo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
    int i=5;
    int j=3;
//    System.out.println("i+j="+(i+j));
//    System.out.println("i/j="+(i/j));
//    System.out.println("i%j="+(i%j));
//	//ǰ׺����
//    System.out.println(++i);
//    //��׺����
//    System.out.println(j++);
    

  //��ϵ�����
  if(i>=j)
  {
	  System.out.println("i���ڵ���j");
  }
  //�߼������
  boolean flag=true;
  int m=0;
  if(flag&&(++m)>0)
  {
	  
  }
  System.out.println("m��ֵ��"+m);
	

	
	//λ����
	int a=3;//00000000 00000000 00000000 00000011
	int b=2;//00000000 00000000 00000000 00000010
//	System.out.println("a&b:"+(a&b));
//	System.out.println("a|b:"+(a|b));
//	System.out.println("a^b:"+(a^b));
//	
//	System.out.println("a>>b:"+(a>>b));
//	System.out.println("a<<b:"+(a<<b));
	
	//��ֵ����
	a+=b;
	System.out.println(a+" "+b);
	
	
	//��Ŀ�����
		int score=80;
		String type=score<60?"������":"����";
		System.out.println(type);
		
		//+
		System.out.println("1"+1+1);
		System.out.println(1+1+"1");
		
		//��������ȼ�
		boolean flag1=i+j<=8&&i-j>=2;
		System.out.println(flag1);
	}
	
	
} 
 