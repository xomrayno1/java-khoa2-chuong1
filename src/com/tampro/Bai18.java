package com.tampro;

import java.util.Scanner;

public class Bai18 {
	
	// tìm các phần tử có số lần xuất hiện như nhau và nhiều nhất
	static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n ;
		do {
			System.out.println("Nhập n > 0");
			n = sc.nextInt();
			
		}while(n  <=  0);
		int[] a = inputArray(n);
		outputArray(a);
		int[] b = lietKe(a);

		System.out.println();
		soNhieuNhat(a,b);
		
	}
	public static void soNhieuNhat(int[] a,int[] b) {
		int max = b[0];
		int vt = 0 ;
		for(int i = 1 ; i < b.length ; i++) {
			if(b[i] >  max ) {
				max = b[i];
				 vt  = i;
			}
		}
		System.out.println("Xuất hiện nhiều nhất "+a[vt]);
		System.out.println("Phần tử xuất hiện như nhau :");
		for(int i = 0 ; i < b.length ; i++) {
			for(int j = 0; j < b.length ;j++) { 
				if(b[i] == 0) {
					break;
				}else {
					if(i == j ) {
						continue;
					}
					if(b[i] == b[j]) {
						System.out.print("\t"+a[i]);
					}
				}
			}
		}	
	}
	public static int[] lietKe(int[]  a) {
		int[] b = new int[a.length];
		
		for(int i = 0 ; i < a.length ; i++) {
			b[i] = 0 ;
			for(int j = 0 ; j < a.length ; j++) {
				if(a[i] == a[j]) {
					if(i > j ) {
						break;
					}else {
						b[i]++;
					}
				}
			}
		}
		
		return b;
	}
	public static void  outputArray(int[] a) {
		for(int item : a) {
			System.out.print(" "+item);
		}
	}
	public static int[] inputArray(int n) {
		int[] a  = new int[n];
		
		for(int i = 0 ;i < a.length ; i++) {
			a[i] = sc.nextInt();
		}
		
		return a;
	}

}
