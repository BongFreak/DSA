package DP1;
import java.util.*;
public class ByteLandian {
	public static long bytelandian(long n,HashMap<Long, Long>memo) {
		if (n<=1) {
			return n;
		}
		if (memo.get(n)!=null) {
			return memo.get(n);
		}
		long breakdown = bytelandian(n/2, memo)+bytelandian(n/3, memo)+bytelandian(n/4, memo);
		memo.put(n, Math.max(breakdown, n));
		return memo.get(n);
	}

	public static void main(String[] args) {
		HashMap<Long, Long> memoHashMap = new HashMap<>();
		int n = 12;
		System.out.println(bytelandian(n, memoHashMap));
	}

}
