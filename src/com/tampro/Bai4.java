package com.tampro;

import java.util.Scanner;

public class Bai4 {
	   //Liệt kê các giá trị có toàn chữ số lẻ trong mảng 1 chiều các số nguyên
	
	    static int X = -1000;
	    static int Y = 1000;
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n ;
			do {
				System.out.println("Nhập n");
				n = sc.nextInt();
				
			}while(n < 0);
			int[] array = randomArray(n);
			outputArray(array);
			System.out.println(" ");
			lietKe(array);
			
		}
		public static void lietKe(int[] array ) {
			
			for(int i = 0 ; i < array.length ; i++) {
				boolean flag = true;
				int sodau =  array[i];
				int tach = 0;
				do {
					tach = sodau % 10;
					sodau /= 10;
					if(tach  % 2  == 0 ) {
					 flag = false;
					 sodau = 0;
					}
				}while(sodau != 0);
				if(flag) {
					System.out.println(" "+array[i]);
				}
				
			}
			
		}
		public static int[] randomArray(int n) {
			int[] array = new int[n];	 
			for(int i = 0;  i < array.length ; i++) {
				array[i] = (int) Math.round(X + ( Math.random() * ((Y-X) + 1)));
			}
			return array;
		}


		
		public static void outputArray(int[] array) {
			for(int items : array) {
				System.out.print(items+" ");
			}
		}
}
