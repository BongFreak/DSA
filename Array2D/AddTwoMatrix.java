package Array2D;

import java.util.Scanner;

public class AddTwoMatrix {
	public static void print2Darray(int[][]arr) {
		for(int i =0;i<arr.length;i++) {// for Row
			for(int j =0;j<arr[i].length;j++) {//for Column
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void add(int[][]a,int r1,int c1,int[][]b, int r2,int c2) {
		if (r1!=r2 || c1!=c2) {
			System.out.println("Wrong Input");
			return;
		}
		int[][]sum = new int[r1][c1];
		for(int i = 0;i<r1;i++) {
			for(int j = 0;j<c1;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		print2Darray(sum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix-1");
		System.out.println("Enter Row....");
		int r1 = sc.nextInt();
		System.out.println("Enter Column....");
		int c1 = sc.nextInt();
		System.out.println("Enter " +r1*c1+ " Elements....");
		int[][]arr1 = new int[r1][c1];
		for(int i = 0;i<r1;i++) {
			for(int j =0;j<c1;j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Matrix-2");
		System.out.println("Enter Row....");
		int r2 = sc.nextInt();
		System.out.println("Enter Column....");
		int c2 = sc.nextInt();
		System.out.println("Enter " +r2*c2+ " Elements....");
		int[][]arr2 = new int[r2][c2];
		for(int i = 0;i<r2;i++) {//row
			for(int j =0;j<c2;j++) {//column
				arr2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix-1");
		print2Darray(arr1);
		System.out.println("Matrix-2");
		print2Darray(arr2);
		System.out.println("Sum of Two Matrix");
		add(arr1, r1, c1, arr2, r2, c2);
		
	}

}
