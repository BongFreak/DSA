package BackTracking;

public class RatInADeadMazeOptimized {
	public static void printPath(int startingRow, int startingColumn, int endingRow, int endingColumn, String s,int[][]maze) {
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
		if (maze[startingRow][startingColumn]==-1) {
			return;
		}
		maze[startingRow][startingColumn]= -1;
		//go Right
		printPath(startingRow, startingColumn+1, endingRow, endingColumn, s+"R",maze);
		//go Down
		printPath(startingRow+1, startingColumn, endingRow, endingColumn, s+"D",maze);
		//go Left
		printPath(startingRow, startingColumn-1, endingRow, endingColumn, s+"L",maze);
		//go Up
		printPath(startingRow-1, startingColumn, endingRow, endingColumn, s+"U",maze);
		//back tracking
		maze[startingRow][startingColumn]= 1;
	}

	public static void main(String[] args) {
		int row =3;
		int colm = 4;
		int[][] maze = {{1,0,1,1},
				        {1,1,1,1},
				        {1,1,0,1},
				        };
	
		printPath(0, 0, row-1, colm-1, "",maze);
	}

}
