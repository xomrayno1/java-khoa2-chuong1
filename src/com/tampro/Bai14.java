package com.tampro;

import java.util.Scanner;

public class Bai14 {
 //xóa tất cả các số chính phương trong mảng
	
	static int X = -1000;
	static int Y = 1000;
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n ;
		do {
			System.out.println("Nhập n");
			n = sc.nextInt();
		}while(n < 1);
		int[] mang = randomMang(n);
		outPutMang(mang);
		mang = deleteChinhPhuong(mang);
		System.out.println(" ");
		outPutMang(mang);
		
		
	}
	
	public static int[] deleteChinhPhuong(int[] array) {
		
		int[] mang  = array;
		for(int i  = 0 ; i < mang.length ; i++) {
			if(  Math.sqrt(mang[i]) % 1 ==  0) {
				mang = deleteArray(mang,i);
				i = -1;
			}
		}
		
		array = mang;
		return array;
	}

	public static int[] deleteArray(int[] array,int k) {   
		int[] mangB = new int[array.length - 1];
		
		for(int i = 0 ; i < array.length - 1 ; i++) {
			if(i < k) {
				mangB[i] = array[i];
			}else {
				mangB[i] = array[i+1];
			}
		}
		array = mangB;
		return array;
	}

	public static int[] randomMang(int n) {
		int[] array = new int[n];	
		for(int  i = 0 ; i < n; i++) {
			array[i] = (int) Math.round(X  + ( Math.random()*((Y-X)+1)));
		}
		return array;
	}
	public static void outPutMang(int[] mang) {
		for(int item : mang) {
			System.out.print(item+" ");
		}
	}
}
