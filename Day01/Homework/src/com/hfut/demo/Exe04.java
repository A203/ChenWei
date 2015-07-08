package com.hfut.demo;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
  Scanner in = new Scanner(System.in);
  System.out.println("| 1.增加1个学生 |");
  System.out.println("| 2.显示所有学生 |");
  System.out.println("| 3.退出程序 |");
  System.out.println("| 请输入选择（1-3）： ");
  int choice=in.nextInt();
  String numberString="";
  switch(choice)
  {
    case 1:numberString="增加1个学生";break;
    case 2:numberString="显示所有学生";break;
    case 3:numberString="退出程序";break;
    default:numberString="error day";

}

    System.out.println(numberString);
}

}
