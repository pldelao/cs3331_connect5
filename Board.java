package cs331;

public class Board {
	private int[][] board= new int[15][15]; 
	
	public int[][] getBoard() {
		return board;
	}
	
	public void update(int row, int col, int player) 
	{
		if((row>0 && row<15) && (col>0 && col<15)) {
			board[row-1][col-1]=player;
		}
	}
	
	//method to check winner, uses only two for loops
	public int check()
	{
		    final int HEIGHT = board.length;
		    final int WIDTH = board[0].length;
		    final int EMPTY_SLOT = 0;
		    for (int r = 0; r < HEIGHT; r++) { // iterate rows, bottom to top
		        for (int c = 0; c < WIDTH; c++) { // iterate columns, left to right
		            int player = board[r][c];
		            if (player == EMPTY_SLOT)
		                continue; // don't check empty slots

		            if (c + 4 < WIDTH &&
		                player == board[r][c+1] && // look right
		                player == board[r][c+2] &&
		                player == board[r][c+3]&&
				        player == board[r][c+4])
		                return player;
		            if (r + 3 < HEIGHT) {
		                if (player == board[r+1][c] && // look up
		                    player == board[r+2][c] &&
		                    player == board[r+3][c]&&
				            player == board[r+4][c])
		                    return player;
		                if (c + 3 < WIDTH &&
		                    player == board[r+1][c+1] && // look up & right
		                    player == board[r+2][c+2] &&
		                    player == board[r+3][c+3] &&
				            player == board[r+4][c+4])
		                    return player;
		                if (c - 3 >= 0 &&
		                    player == board[r+1][c-1] && // look up & left
		                    player == board[r+2][c-2] &&
		                    player == board[r+3][c-3]&&
				            player == board[r+4][c-4])
		                    return player;
		            }
		        }
		    }
		    return EMPTY_SLOT; // no winner found
		}

	
	
}
