package com.tampro;

import java.util.Scanner;
//Tổng các số  có chữ số hàng chục là 5 trong mảng 1 chiều
public class Bai7 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println("Nhập mảng n");
	 int n = sc.nextInt();
	 int[] arr = inPutMang(n);
	 outPutMang(arr);
	 int value = tinhTong(arr);
	 System.out.println("value :"+value);
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
	public static int tinhTong(int[] mang) {
		int result = 0;
		for(int i = 0 ; i < mang.length ; i++) {
			if(mang[i] >=  50) {
				int value = mang[i];
				do {
					value /=  10 ;
					value %= 10;
					if(value == 5) {
						result +=mang[i];
					}
				}while(value!=0);
			}
		}
		return result ;
	}
}
