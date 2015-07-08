package com.hfut.ifdemo;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//根据学生的分数，输出学生的成绩等级
       Scanner scanner=new Scanner(System.in);
       int score=scanner.nextInt();//输入整数
		if(score>=90)
		{
			System.out.println("等级为A");
		}
		if(score>=80&&score<90)
		{
			System.out.println("等级为B");
		}
		if(score>=70&&score<80)
		{
			System.out.println("等级为C");
		}
		if(score>=60&&score<70)
		{
			System.out.println("等级为D");
		}
		if(score<60)
		{
			System.out.println("等级为E");
		}
	}

}
