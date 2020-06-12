package com.tampro;

import java.util.Scanner;
// tinh trung binh cong cac gia tri lon hon x do nguoi dung nhap vao
public class Bai10 {
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
		System.out.println("Nhập x ");
		int x = sc.nextInt();
		float result = tinhTongTBC(mang,x);
		System.out.println("Result : "+result);
		
	}
	public static float tinhTongTBC(int[] array , int x) {
		float result = 0;
		int count = 0 ;
		for(int i = 0 ; i < array.length; i++) {
			if(array[i] > x) {
				result += array[i];
				count++;
			}
		}
		if(count==0) {
			return 0;
		}
		
		return (float)result / count;
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
