package com.huft.demo;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 Scanner input =new Scanner(System.in);
		   System.out.print("�������кţ�");
		   int num=input.nextInt();
		   
		   for(int i=1;i<=num;i++){
			   //��ӡ�ո�
			   for(int j=1;j<=num-1;j++){
				   System.out.println(" ");
			   }
			   
			   //��ӡ�Ǻ�
			   for(int j=1;j<=i*2-1;j++){
				   System.out.println("*");
			   }
			   System.out.println();
		   }
		   
	}

}