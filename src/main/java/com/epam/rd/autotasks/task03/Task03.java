package com.epam.rd.autotasks.task03;

import java.util.Arrays;
import java.util.Objects;

public class Task03 {
	private static boolean isMatrix (int[][] matrix) {
		for (int[]a: matrix) {
			if(a.length != matrix.length) {
				return false;
			}
		}
		return true;
	}

	public static void transformMatrix(int[][] matrix) {
		if (Objects.isNull(matrix) || matrix.length==0 || !isMatrix(matrix)) {
			return;
		}
		else {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = i + 1; j < matrix[i].length; j++) {
					matrix[i][j] = 1;
					matrix[j][i] = 0;
				}
			}
		}



	}

	public static void main(String[] args) {
		{
			int[][] matrix = null;
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = {};
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { {} };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { {}, {} };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { { 2, 3 }, { 4, 5, 6 } };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { { 2, 3 }, { 4, 5 }, {} };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { { 2, 3 }, { 4, 5 } };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { { 2, 4, 3, 3 }, { 5, 7, 8, 5 }, { 2, 4, 3, 3 }, { 5, 7, 8, 5 } };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{

			int[][] matrix = { { 2, 3 }, { 4, 5 }, { 6, 7 } };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}
		{
			int[][] matrix = { { 2, 4, 3, 3 }, { 5, 7, 8, 5 }, { 2, 4, 3, 3 } };
			transformMatrix(matrix);
			System.out.println(Arrays.deepToString(matrix));
		}

	}

}
