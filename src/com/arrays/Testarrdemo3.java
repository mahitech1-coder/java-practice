package com.arrays;

public class Testarrdemo3 {
	
	  public static void main(String[] args) {
		int[] arr = { 50, 10, 25, 5, 3, 36, 12 };
		int minIndex=50;
		
		System.out.println("Before sorting the array is:");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]<arr[j]) {
					minIndex=arr[j];
					
				}
			}
			
		}
		int temp=arr[minIndex];
		arr[minIndex]=arr[j];
		arr[j]=temp;
		System.out.println("After sorting the array is:");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
