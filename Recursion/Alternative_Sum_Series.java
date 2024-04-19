//1-2+3-4+5-6 = -3
package Recursion;

public class Alternative_Sum_Series {
	public static int series(int n) {
		if (n==0)return 0;
		if(n%2==0) {
			return series(n-1)-n;
		}
		else {
			return series(n-1)+n;
		}
	}
	public static void main(String[] args) {
		System.out.println(series(6));

	}

}
