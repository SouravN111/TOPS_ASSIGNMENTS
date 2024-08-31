package com.assignment;

import java.util.Scanner;

public class array_3 {
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
		
		System.out.println("How do you want to sort it?(A/D) : ");
		char choice = scanner.next().charAt(0);
		
		if(choice == 'a' || choice == 'A') {
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]>arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("Ascending order : ");
			for(int i=0;i<n;i++) {
				System.out.println("arr[" + i + "] = " + arr[i]);
			}
		}
		else {
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]<arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("Descending order : ");
			for(int i=0;i<n;i++) {
				System.out.println("arr[" + i + "] = " + arr[i]);
			}
		}
	}
}
