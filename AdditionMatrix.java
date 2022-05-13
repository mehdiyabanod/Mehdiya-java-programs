package com.edu;

import java.util.Scanner;

public class AdditionMatrix {

	public static void main(String[] args) {
		int a[][], b[][], c[][], r1, c1, r2, c2, i, j;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows & cols of First Matrix :");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		System.out.println("Enter the number of Rows & cols of Second Matrix :");
		r2 = sc.nextInt();
		c2 = sc.nextInt();

		if (r1 == r2 && c1 == c2) {
			a = new int[r1][c1];
			b = new int[r2][c2];
			c = new int[r1][c1];

			for (i = 0; i < r2; i++) {
				for (j = 0; j < c2; j++) {
					a[i][j] = sc.nextInt();
				}
			}

			for (i = 0; i < r2; i++) {
				for (j = 0; j < c2; j++) {
					b[i][j] = sc.nextInt();
				}
			}

			for (i = 0; i < r2; i++) {
				for (j = 0; j < c2; j++) {
					c[i][j] = a[i][j] + b[i][j];
				}
			}

			System.out.println("Addition of matrix ");
			for (i = 0; i < r2; i++) {
				for (j = 0; j < c2; j++) {
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
