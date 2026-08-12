package com.arrays;
//Bubble Sort
public class Testarrdemo2 {
	 void bubblesort(int[] arr) {
		 for(int i=0;i<arr.length-1;i++) {
			 for(int j=0;j<arr.length-1-i;j++) {
				 if(arr[j]>arr[j+1]) {
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				 }
			 }
		 }
		 
	 }
	 void main(String[] args) {
			int[] arr = { 10, 50, 26, 2, 18, 9, 1 };
			System.out.println("Before sorting array is:");
			for (int a : arr) {
				System.out.print(a + " ");
			}
		System.out.println();
		bubblesort(arr);
		System.out.println("After  sorting array is:");
		for(int a:arr) {
			System.out.print(a + " ");
		}
		
	}

}
