package BackTracking;

public class RatInMaze2D {
	public static int maze(int startingRow, int startingColumn, int endingRow, int endingColumn) {
		if (startingColumn>endingColumn || startingRow>endingRow) {
			return 0;
		}
		if (startingColumn==endingColumn && startingRow==endingRow) {
			return 1;
		}
		int rightways= maze(startingRow, startingColumn+1, endingRow, endingColumn);
		
		int downways = maze(startingRow+1, startingColumn, endingRow, endingColumn);
		int totalways = downways  + rightways;
		return totalways;
	}
	public static void printPath(int startingRow, int startingColumn, int endingRow, int endingColumn, String s) {
		if (startingColumn>endingColumn || startingRow>endingRow) {
			return ;
		}
		if (startingColumn==endingColumn && startingRow==endingRow) {
			System.out.println(s);
			return ;
		}
		//go Right
		printPath(startingRow, startingColumn+1, endingRow, endingColumn, s+"R");
		//go Down
		printPath(startingRow+1, startingColumn, endingRow, endingColumn, s+"D");
	}

	public static void main(String[] args) {
		int row = 2;
		int column = 2;
		int count = maze(1, 1, row, column);
		System.out.println(count);
		printPath(1, 1, row, column, "");
	}

}
