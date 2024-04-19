package array;
import java.util.*;

public class ArrangeNumberInArray {
	public static void arrange(int[] arr, int n) {
		int l = 0;
		int r = n-1;
		for (int i = 1; i <=n; i++) {
			if (i%2==0) {
				arr[r]=i;
				r--;
			} else {
				arr[l]=i;
				l++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			int n=sc.nextInt();
			int[] arr = new int[n];
			arrange(arr,n);
			for (int i = 0; i <n; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			t-=1;
		}

	}

}
