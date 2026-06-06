package com.codegnan.fundamentals;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] a = {{10,20},{30,40,50}};
		for(int i=0;i<a.length;i++) {
			// i stands for rows
			for(int j=0;j<a[i].length;j++) {
				//j stands for columns
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}

}
