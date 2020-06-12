package com.tampro;

import java.util.Scanner;

public class Bai1 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n ;
		do {
			System.out.println("Nhập n");
		    n = sc.nextInt();
		}while(n <= 2 );
		int[] arr = inPutMang(n);
		outPutMang(arr);	
		System.out.println(" ");
		lietKe(arr);
	}
	public static void lietKe(int[] a) { 

		int count = 0 ;
		for(int i  = 0 ; i < a.length ; i++) {
			double result = Math.cbrt(a[i]);
			if(result  % 1 == 0 ) {
				System.out.print("\t"+a[i]);
				count++;
			}
		}
		if(count == 0) {
			System.out.println(count);
		}
	
	}
	public static int[] inPutMang(int n) {
		
		int[] mang = new int[n];
		for(int i = 0 ; i< n ; i++) {
	     	System.out.println("Nhập giá trị : "+i);	
	     	mang[i] = sc.nextInt();
		}
		return mang;
	}

	public static void outPutMang(int[] mang) {
		for(int item : mang) {
			System.out.print(item+" ");
		}
	}
}
