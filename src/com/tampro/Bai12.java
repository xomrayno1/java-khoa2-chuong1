package com.tampro;

import java.util.Scanner;
//xoa tat ca cac so am trong mang
public class Bai12 {
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
		mang = deleteAm(mang);
		System.out.println(" ");
		outPutMang(mang);
		
		
	}
	
	public static int[] deleteAm(int[] array) {
		
		int[] mang  = array;
		for(int i  = 0 ; i < mang.length ; i++) {
			if(mang[i]  < 0) {
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
