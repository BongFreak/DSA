package Array2D;

import java.util.Scanner;

public class Fundamental {
	public static void print2Darray(int[][]arr) {
		for(int i =0;i<arr.length;i++) {// for Row
			for(int j =0;j<arr[i].length;j++) {//for Column
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row....");
		int r = sc.nextInt();
		System.out.println("Enter Column....");
		int c = sc.nextInt();
		System.out.println("Enter 12 Elements....");
		int[][]arr = new int[r][c];
		for(int i = 0;i<r;i++) {
			for(int j =0;j<c;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		print2Darray(arr);
//		arr[0][0]=1;
//		arr[0][2]=2;
//		int[][]arr2 = {{1,2,3},
//					{7,9,11},
//						{8,1,1}};
//		print2Darray(arr);
	}

}
