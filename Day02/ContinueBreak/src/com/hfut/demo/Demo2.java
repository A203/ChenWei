package com.hfut.demo;

public class Demo2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int num=0;
		for(int i=1;i<=99;i++){
	    	if(i%5==0){
	    		System.out.println(i);
	    		continue;
	    	}
	    	num++;
	    }
		System.out.println("num:"+num);
	}

}