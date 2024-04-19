package DP1;

public class LootHouse {
	public static int maxMoneyLooted(int[] house) {
		int n = house.length;
		if (n==0) {
			return 0;
		}
		if (n==1) {
			return house[0];
		}
		int[] maxMoneyCanBeLooted = new int[n];
		maxMoneyCanBeLooted[0] = house[0];
		maxMoneyCanBeLooted[1] = Math.max(house[0], house[1]);
		for(int i=2;i<n;i++) {
			maxMoneyCanBeLooted[i] = Math.max(maxMoneyCanBeLooted[i-1], (maxMoneyCanBeLooted[i-2]+house[i]));
		}
		return maxMoneyCanBeLooted[n-1];
	}

	public static void main(String[] args) {
		int[] house = {5,5,10,100,10,5};
		System.out.println(maxMoneyLooted(house));
	}

}
