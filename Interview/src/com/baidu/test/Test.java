package com.baidu.test;

public class Test {
	public static void test() {
		for(int i=0; i<10; i++) {
			int j = new Double(Math.pow(10, i)).intValue();
			System.out.println(j);
			long sum = 0;
			long startTime = System.currentTimeMillis();
			for(int k=0; k<j; k++) {
				sum += k;
			}
			long endTime = System.currentTimeMillis();
			System.out.println("sum:" + sum + "  total time:" + (endTime-startTime));
		}
	}
	public static void main(String[] args) {
		Test.test();
	}
}
