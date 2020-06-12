package com.tampro;

import java.util.Scanner;
//tổng các giá trị dương trong mảng một chiều các số thực
public class Bai6 {
	static int X = -1000;
	static int Y = 1000;
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n ;
		do {
			System.out.println("Nhập n");
			n = sc.nextInt();
		}while(n < 1);
		float[] mang = randomMang(n);
		outPutMang(mang);
		int result = tinhTongDuong(mang);
		System.out.println("Result : "+ result);
		
		
	}
	public static int tinhTongDuong(float[] mang) {
		int result = 0 ;
		for(int  i = 0 ; i < mang.length; i++) {
			if(mang[i] > 0) {
				result +=mang[i];
			}
		}
		return result;
	}

	public static float[] randomMang(int n) {
		float[] array = new float[n];	
		for(int  i = 0 ; i < n; i++) {
			array[i] =  (float) (X  + ( Math.random()*((Y-X)+1)));
		}
		return array;
	}
	public static void outPutMang(float[] mang) {
		for(float item : mang) {
			System.out.print(item+" ");
		}
	}
}
