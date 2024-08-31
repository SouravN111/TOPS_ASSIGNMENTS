package com.assignment;

import java.util.Scanner;

public class array_2 {
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
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int smallest=n-1;
		int secondSmallest = smallest - 1;
		while(true) {
			if(arr[smallest] != arr[secondSmallest]) {
				System.out.println("The second smallest element in the array is " + arr[secondSmallest]);
				break;
			}
			else {
				smallest--;
				secondSmallest--;
			}
		}
	}
}
