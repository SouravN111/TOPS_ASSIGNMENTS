package com.assignment;

import java.util.Scanner;

public class array_1 {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		n = scanner.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter element " + (i+1) + " : ");
			arr[i] = scanner.nextInt();
		}
		
		int smallest = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("The smallest element in the array is " + smallest);
	}
}
