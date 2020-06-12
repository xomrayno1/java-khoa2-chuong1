package com.tampro;

import java.util.Scanner;

public class Bai16 {

	// xuất hiện nhiều nhất , xuất hiện ít nhất
	

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		do {
			System.out.println("Nhập n");
			n = sc.nextInt();
			
		}while(n < 0);
		int[] array = inPutArray(n);
		ouputArray(array);
		System.out.println("");
		xuatMang(array);
		
	}
	public static void xuatMang(int[] array) {
		int[] mangB = new int[array.length];
		for(int i =0 ; i < array.length ; i++) {
			mangB[i] = 0;
			for(int j = 0 ; j < array.length ; j++) {
				if(array[i] == array[j]) {
					if(i > j) {
						break;
					}
					mangB[i]++;
				}
				
			}
			
		}
		int min = mangB[0];
		int vtMin = 0;
		int max  = mangB[0];
		int vtMax = 0;
		for(int i = 1; i < mangB.length ; i++) {
			if(mangB[i] != 0) {
				if(mangB[i] > max) {
					max = mangB[i] ;
					vtMax = i;
				}
				if(mangB[i] < min) {
					min = mangB[i];
					vtMin = i;
				}
				
			}
		}
		System.out.println("Phần tử xuất hiện nhiều nhất :"+array[vtMax] + " [" + max + " lần ]  ");
		System.out.println("Phần tử xuất hiện ít nhất :"+array[vtMin] + " [" + min + " lần ]  ");
	}
	public static int[] inPutArray(int n) {
		int[] array = new int[n];	 
		System.out.println("Nhập array ");
		for(int i = 0 ; i< n; i++) {
			array[i] = sc.nextInt();
			
		}
		return array;
	}

	public static void ouputArray(int[] array) {
		for(int items : array) {
			System.out.print(items+" ");
		}
	}

}
