package BackTracking;

public class ratInADeadMaze2D {
	public static void printPath(int startingRow, int startingColumn, int endingRow, int endingColumn, String s,int[][]maze) {
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
		//go Right
		printPath(startingRow, startingColumn+1, endingRow, endingColumn, s+"R",maze);
		//go Down
		printPath(startingRow+1, startingColumn, endingRow, endingColumn, s+"D",maze);
	}

	public static void main(String[] args) {
		int row =4;
		int colm = 6;
		int[][] maze = {{1,0,1,1,1,1},
				        {1,1,1,1,0,1},
				        {0,1,1,1,1,1},
				        {0,0,1,0,1,1}};
	printPath(0,0,row-1,colm-1,"",maze);
	}

}
