package com.tampro;

import java.util.Scanner;
// liệt kê các cặp giá trị gần nhau nhất
public class Bai2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n ;
		do {
			System.out.println("Nhập n");
		    n = sc.nextInt();
		}while(n <= 2 );
		int[] arr = inPutMang(n);
		outPutMang(arr);	
		System.out.println(" ");
		lietKe(arr);
	}

	public static void lietKe(int[] a) { 
		int i,j , min =  Math.abs(a[0] - a[1]); 
		for( i = 0 ; i < a.length ; i++){
			for( j = i+1  ; j < a.length   ; j++ ) {
				if( Math.abs(a[i] - a[j]) < min ) {
					 min = Math.abs(a[i] - a[j]) ;
				}
			}
			for( i = 0 ; i < a.length ; i++){
				for( j = i+1  ; j < a.length   ; j++ ) {
					if( Math.abs(a[i] - a[j]) == min ) {
						 System.out.println("Cặp  a["+i+"] ,  a["+j+"] " + a[i] + ","+a[j] );
						 
					}
				}
			}
		}

	}
	public static int[] inPutMang(int n) {
		
		int[] mang = new int[n];
		for(int i = 0 ; i< n ; i++) {
	     	System.out.println("Nhập giá trị : "+i);	
	     	mang[i] = sc.nextInt();
		}
		return mang;
	}

	public static void outPutMang(int[] mang) {
		for(int item : mang) {
			System.out.print(item+" ");
		}
	}
}
