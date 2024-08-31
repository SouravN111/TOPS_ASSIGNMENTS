package com.assignment;

import java.util.Scanner;

public class array_4 {
	public static void main(String[] args) {
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("Enter matrix1[" + i + "][" + j + "] : ");
				matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("Enter matrix1[" + i + "][" + j + "] : ");
				matrix2[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nMatrix 1 : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix1[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nMatrix 2 : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix2[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nAddition : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print((matrix1[i][j] + matrix2[i][j]) + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nSubtraction : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print((matrix1[i][j] - matrix2[i][j]) + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nMultiplication : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print((matrix1[i][j] * matrix2[i][j]) + "\t");
			}
			System.out.println();
		}
	}
}
