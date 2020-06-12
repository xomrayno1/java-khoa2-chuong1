package com.tampro;

import java.util.Scanner;

public class Bai9 {
 //Tính trung bình cộng các số nguyên tố trong mảng 1 chiều
	static int X = -1000;
	static int Y = 1000;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n ;
		do {
			System.out.println("Nhập n");
			n = sc.nextInt();
		}while(n < 1);
		//int[] mang = randomMang(n);
		int[] mang = inPutMang(n);
		outPutMang(mang);
		System.out.println("");
		float result = tinhTongTBC(mang);
		System.out.println("Result : "+result);
	}
	public static float tinhTongTBC(int[] mang) {
		int result = 0;
		int count = 0 ;
		for(int i = 0 ; i < mang.length ; i++) { 
			if(checkSoNguyenTo(mang[i])) {
				result += mang[i];
				count++;
			}
		}
		if(count == 0 ) {
			return 0;
		}
	
		
		return (float) result / count;
	}
	
	public static boolean checkSoNguyenTo(int value) {
		
		if(value <  2 ) {
			return false;
		}
		if(value == 2 ) {
			return true;
		}
		for(int i = 2 ; i < value ; i++) {
			if(value % i == 0 ) {
				return false;
			}
		}
		return true;
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
	public static int[] randomMang(int n) {
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = (int) Math.round(X + (Math.random() * (Y-X) + 1));
 		}
		return arr;
	}


}
