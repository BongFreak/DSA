package BackTracking;

public class RatInMaze4D {
	
	public static void printPath(int startingRow, int startingColumn, int endingRow, int endingColumn, String s,boolean[][]isVisible) {
		if (startingColumn<0 || startingRow<0) {
			return ;
		}
		if (startingColumn>endingColumn || startingRow>endingRow) {
			return ;
		}
		if (isVisible[startingRow][startingColumn]==true) {
			return;
		}
		if (startingColumn==endingColumn && startingRow==endingRow) {
			System.out.println(s);
			return ;
		}
		isVisible[startingRow][startingColumn]= true;
		//go Right
		printPath(startingRow, startingColumn+1, endingRow, endingColumn, s+"R",isVisible);
		//go Down
		printPath(startingRow+1, startingColumn, endingRow, endingColumn, s+"D",isVisible);
		//go Left
		printPath(startingRow, startingColumn-1, endingRow, endingColumn, s+"L",isVisible);
		//go Up
		printPath(startingRow-1, startingColumn, endingRow, endingColumn, s+"U",isVisible);
		//back tracking
		isVisible[startingRow][startingColumn]= false;
		
	}

	public static void main(String[] args) {
		int row = 3;
		int column = 3;
		boolean[][]isVisible = new boolean[row][column];
		printPath(0, 0, row-1, column-1, "",isVisible);
	}

}
