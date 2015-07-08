package com.hfut.demo;

public class Exe1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int num=0;
		for(int i=2;i<100;i++){
			boolean flag=true;
			int j=(int) Math.sqrt(i)+1;
			for(int k=2;k<j;k++){
				if(i%k==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.print(i+"\t");
				num++;
			}
		}
		System.out.println();
		System.out.println("num="+num);
	}
}
