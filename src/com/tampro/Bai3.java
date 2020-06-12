package com.tampro;

import java.util.Scanner;

public class Bai3 {
	// Tạo ngẫu nhiên mảng một chiều n phần tử nguyên (chẵn) có giá trị trong đoan -100 100 . 
	//liệt kê các số chẵn trong mảng 1 chiều các số nguyên thuộc đoạn [x.y] cho trước (x,y số nguyên) 
	// sinh số ngẫu nhiên trong đọa a - b : a + Math.random * (b- a) + 1
	
	static final int  DAU = -100;
	static final int  CUOI =  100;
	static final int X = -50;
	static final int Y = 50;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n ;
		do {
			System.out.println("Nhập n chẵn");
		    n = sc.nextInt();
			
		}while( n <= 0 || n % 2 != 0);
		
		int[] array = randomArray(n);
		outPutArray(array);
		System.out.println(" ");
		lietKe(array);
		System.out.println();
		System.out.println("Nhập a ");
		int a = sc.nextInt();
		System.out.println("Nhập b ");
		int b = sc.nextInt();
		System.out.println("Sinh số ngẫu nhiên đoạn a - b");
		array  = randomAB(n, a, b);
		outPutArray(array);
		
		
	}
	public static int[] randomAB(int n, int a , int b) {
		int[] array = new int[n];
		for(int i = 0 ; i < n ; i++) {
			array[i] = (int) Math.round(a + (Math.random() * (b - a ) + 1 ));
		}
		return array;
	}
	public static void lietKe(int[] a) {
		
		for(int i = 0 ; i < a.length ; i++) {
			if((a[i] <  Y && a[i] > X)  && a[i] % 2 == 0 )  {
				System.out.print("\t"+a[i]);
			}
		}
		
	}
	public static int[] randomArray(int n) {
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = (int) Math.round(DAU + (Math.random() * (CUOI - DAU ) +1 ));
		}
		return a;
	}
	public static void outPutArray(int[] a) {
		for(int item : a) {
			System.out.print( "\t"+item);
		}
	}
	
	
	
	
	
	
	

}
