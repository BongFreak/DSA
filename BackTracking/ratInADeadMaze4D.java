package BackTracking;

public class ratInADeadMaze4D {
	public static void printPath(int startingRow, int startingColumn, int endingRow, int endingColumn, String s,int[][]maze,boolean[][]isVisible) {
		if (startingColumn<0 || startingRow<0) {
			return ;
		}
		if (startingColumn>endingColumn || startingRow>endingRow) {
			return ;
		}
		if (startingColumn==endingColumn && startingRow==endingRow) {
			System.out.println(s);
			return ;
		}
		if (maze[startingRow][startingColumn]==0) {
			return;
		}
		if (isVisible[startingRow][startingColumn]==true) {
			return;
		}
		isVisible[startingRow][startingColumn]= true;
		//go Right
		printPath(startingRow, startingColumn+1, endingRow, endingColumn, s+"R",maze,isVisible);
		//go Down
		printPath(startingRow+1, startingColumn, endingRow, endingColumn, s+"D",maze,isVisible);
		//go Left
		printPath(startingRow, startingColumn-1, endingRow, endingColumn, s+"L",maze,isVisible);
		//go Up
		printPath(startingRow-1, startingColumn, endingRow, endingColumn, s+"U",maze,isVisible);
		//back tracking
		isVisible[startingRow][startingColumn]= false;
	}

	public static void main(String[] args) {
		int row =3;
		int colm = 4;
		int[][] maze = {{1,0,1,1},
				        {1,1,1,1},
				        {1,1,0,1},
				        };
		boolean[][]isVisible = new boolean[row][colm];
		printPath(0, 0, row-1, colm-1, "",maze,isVisible);
	}

}
