package com.tampro;

import java.util.Scanner;
// Tạo ngẫu nhiên mảng môt chiều n phần tử . Tính tổng các giá trị lớn hơn trị tuyệt đối của giá trị đứng liền sau nó trong mảng một chièu.
public class Bai8 {
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
		System.out.println("");
		int result = resultSum(mang);
		System.out.println("Result : "+result);
	}
	public static int resultSum(int[] mang) {
		int result = 0;
		for(int i = 0 ; i < mang.length-1 ; i++) { 
			if(mang[i] > Math.abs(mang[i + 1]) ) {
				result+=mang[i];
			}
		}
		return result;
	}
	public static void outPutMang(int[] mang) {
		for(int item : mang) {
			System.out.print(item+" ");
		}
	}
	public static int[] randomMang(int n) {
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = (int) Math.round(X + (Math.random() * (Y-X) + 1));
 		}
		return arr;
	}

}
