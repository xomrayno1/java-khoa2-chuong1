package com.tampro;

import java.util.Scanner;

public class Bai15 {
	//xuất mảng và dịch xoay vòng mảng k lần , 
	
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
			int k ;
			do {
				System.out.println("");
				System.out.println("Nhập k");
				k = sc.nextInt();
				
			}while( k < 1);
			System.out.println();
			int[] array = dichChuyen(mang,k);
			outPutMang(array);
			
		}
		
		public static int[] thayDoiMang(int[] array) {
			
			int value = array[0];
			for(int i = 0; i < array.length - 1 ;i++) {
				array[i] = array[i+1];
			}
			array[array.length - 1 ] = value;
		
			return array;
			
		}
		public static int[] dichChuyen(int[] array, int k) {
			for(int i = 0 ; i <  k; i++) {
				array = thayDoiMang(array);
			}		
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