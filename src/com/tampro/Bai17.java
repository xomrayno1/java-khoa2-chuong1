package com.tampro;

import java.util.Scanner;

public class Bai17 {
	//Đảo ngược mảng
	static final int X = -1000;
	static  final int Y = 1000;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		do {
			System.out.println("Nhập n");
			n = sc.nextInt();
			
		}while(n < 0);
		int[] array = randomArray(n);
		ouputArray(array);
		System.out.println("");
		array = reverse(array);
		ouputArray(array);
		
	}
	public static int[] reverse(int[] array) {
		
		for(int i = 0 ; i < array.length / 2   ; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		
		return array;
		
	}

	public static int[] inPutArray(int n) {
		int[] array = new int[n];	 
		System.out.println("Nhập array ");
		for(int i = 0 ; i< n; i++) {
			array[i] = sc.nextInt();
			
		}
		return array;
	}
	public static int[] randomArray(int n) {
		int[] array = new int[n];	
		for(int i = 0 ; i< n; i++) {
			array[i] = (int) (X + Math.random()*((Y-X)+1));
			
		}
		return array;
	}
	public static void ouputArray(int[] array) {
		for(int items : array) {
			System.out.print(items+" ");
		}
	}
}
