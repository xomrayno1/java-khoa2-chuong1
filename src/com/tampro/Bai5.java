package com.tampro;

import java.util.Scanner;

public class Bai5 {
    //liệt kê chữ số đầu tiên là chẵn và là số nguyên
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		do {
			System.out.println("Nhập n");
			n = sc.nextInt();
			
		}while(n < 0);
		int[] array = inPutArray(n);
		outputArray(array);
		System.out.println("");
		System.out.println("Liệt kê :");
		lietKe(array);
		
	}
	public static void lietKe(int[] array) {

		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] % 1 == 0) {
				int value = array[i];
				int rs = 0;
				do {
					rs = value; 
					value /=  10;
					
				}while(value != 0);
				if(rs % 2 == 0) {
					System.out.print("  "+array[i]);
				}
			}
		}

	}
	public static int[] inPutArray(int n) {
		int[] array = new int[n];	 
		System.out.println("Nhập array ");
		for(int i = 0 ; i< n; i++) {
			array[i] = sc.nextInt();
			
		}
		return array;
	}
	
	public static void outputArray(int[] array) {
		for(int items : array) {
			System.out.print(items+" ");
		}
	}
}
