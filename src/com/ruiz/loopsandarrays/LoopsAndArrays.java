package com.ruiz.loopsandarrays;

import java.util.Scanner;

public class LoopsAndArrays {
	public static void main(String[] args) {
		createTimesTable();
		findGCD();
		predictTuition();
	}
	public static void createTimesTable() {
		/**
		 * first for loop traverses through row
		 * second for loop traverses through the column
		 */
		for(int x = 1;x<=12;x++) {
			for(int y =1; y<=12;y++) {
				System.out.printf("%3d",x*y);
			}
			System.out.println(" ");
		}
	}
	public static void findGCD() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int n1 = scan.nextInt();
		System.out.println("Enter a positive integer");
		int n2 = scan.nextInt();
		int smallest = 0;
		int h1 =0;
		int h2 =0;
		int gcd = 0;
		
		if(n1<=n2) {
			smallest = n1;
		}else {
			smallest = n2;
		}
		
		for(int i = 1; i<=smallest;i++) {
			h1=n1%i;
			h2=n2%i;
			if(h1==0 & h2==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
	public static void predictTuition() {
		double currentTuition = 10000;
		double years = 0;
		while(currentTuition<=20000) {
			currentTuition = 1.07 *currentTuition;
			years+=1;
		}
//		for(int i = 0; i<=?;i++) {
//			currentTuition = 1.07*currentTuition;
//			if(currentTuition>=20000) {
//				years = i;
//			}
//		}
		System.out.println(years);
	}
}
