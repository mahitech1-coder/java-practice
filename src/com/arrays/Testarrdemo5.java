package com.arrays;

public class Testarrdemo5 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 3, 1, 25, 33 };
		int sum = 0;
		int avg = 0;
		int min = 0;
		int max = 0;
		int evencount = 0;
		int oddcount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evencount++;
			} else {

				oddcount++;
			}

		}
		System.out.println("count of even is:" + evencount);

		System.out.println("count of odd is:" + oddcount);

//		for (int a : arr) {
//			if(min>a) {
//				min=a;
//			}
//				if(min<a) {
//					max=a;
//				}
		//// System.out.print(a +" ");
//			sum = sum + a;
//		}
//		avg=sum/arr.length;
//		System.out.println("Sum is: "+sum);
//		System.out.println("avg is:"+avg);
//		System.out.println("minimum value is:"+min);
//		System.out.println("maximum value is:"+max);

	}

}
