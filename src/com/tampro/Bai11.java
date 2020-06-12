package com.tampro;

import java.util.Scanner;

public class Bai11 {
// hãy xóa tất cả số lớn nhất trong mảng số thực
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n ;
		do {
			System.out.println("Nhập n");
			n = sc.nextInt();
		}while(n < 1);
		float[] mang = inputMang(n);
		outPutMang(mang);
		System.out.println();
		mang = deleteMang(mang);
		outPutMang(mang);
		
		
	}
	public static float[] deleteMang(float[] mang) {
		int count = 0; 
		float max = timMax(mang);
		for(int i = 0 ; i < mang.length ; i++) {
			if(mang[i] == max) {
				count++;
			}
		}
		float[] b = new float[mang.length - count];
		int k = 0 ;
		for(int i = 0 ; i < mang.length ; i++) {
			if(mang[i] != max ) {
				b[k++] = mang[i];
			}
		}
		
		return b;
	}
	public static float timMax(float[] mang) {
		float max =  mang[0];
		for(int i = 1 ; i <  mang.length ;i++) {
			if(mang[i] > max) {
				max = mang[i];
			}
		}		
		return max ;
	}

	public static float[] inputMang(int n) {
		float[] array = new float[n];	
		for(int  i = 0 ; i < n; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}
	public static void outPutMang(float[] mang) {
		for(float item : mang) {
			System.out.print(item+" ");
		}
	}
}
