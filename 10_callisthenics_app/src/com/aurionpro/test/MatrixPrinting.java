package com.aurionpro.test;

import java.util.Scanner;

public class MatrixPrinting {
	static Scanner scanner = new Scanner(System.in);
	
	private static void createMatrix(int matrix [][]) {
		for(int i=0;i<3;i++) {
			readRowElements(matrix, i);
		}
	}
	
	private static void readRowElements(int matrix[][], int row) {
		for(int i=0;i<3;i++) {
			matrix[row][i] = scanner.nextInt();
		}
		
	}
	
	private static void printMatrix(int matrix[][]) {
		for(int i=0;i<3;i++) {
			printRowElements(matrix, i);
		}
	}
	
	private static void printRowElements(int matrix[][], int row) {
		for(int i=0;i<3;i++) {
			System.out.print(matrix[row][i] + "\t");
		}System.out.println("");
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter matrix elements");
		int[][] matrix = new int[3][3];
		createMatrix(matrix);
		printMatrix(matrix);
	}
}
