package com.interview.practice;

public class MatrixSum {

	public static void main(String[] args) {

		int rows = 0, cols = 0, sumRow, sumCol;

		int[][] arr = {

				{1,2,3},
				{2,3,4},
				{5,6,7}

		};
		
		rows = arr.length;
		cols = arr[0].length;

		for (int i = 0; i < rows; i++) {

			sumRow = 0;

			for (int j = 0; j < cols; j++) {

				sumRow = sumRow + arr[i][j];
			}

			System.out.println("Sum of :" + (i + 1) + " row :" + sumRow);
		}

		for (int i = 0; i < cols; i++) {

			sumCol = 0;

			for (int j = 0; j < rows; j++) {

				sumCol = sumCol + arr[j][i];
			}

			System.out.println("Sum of :" + (i + 1) + " col :" + sumCol);
		}

	}

}
