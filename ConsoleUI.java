package cs331;
import java.util.Scanner;

public class ConsoleUI {
	
	
	//method that handles user input
	public int UI() 
	{
		Scanner ui =new Scanner(System.in);
		int val;
		val=ui.nextInt();
		return val;
	}
	
	//method that displays the board
	public void display(int [][] b) {
		System.out.println("y/x   1   2   3   4   5   6   7   8   9   10  11  12  13  14  15");
		 for (int i=0;i<15;i++) {
			 System.out.println((i+1)+ "   | "+b[i][0]+" | "+b[i][1]+" | "+b[i][2]+"| "+b[i][3]+" | "+b[i][4]+" | "+b[i][5]+" | "+b[i][6]+" | "+b[i][7]+" | "+b[i][8]+" | "+b[i][9]+" | "+b[i][10]+" | "+b[i][11]+" | "+b[i][12]+" | "+b[i][13]+" | "+b[i][14]+" | ");
			 System.out.println("   +---+---+---+---+---+---+---+---+---+---+---+---+---+---+---+");
		 }
		
	}

	public void play() {
		int count=0;
		int winner=-1;
		Board board= new Board();
		int [][] b=board.getBoard();
		boolean win=false;
		while(win==false) {
			winner=board.check();
			display(board.getBoard());
			System.out.println("Please enter the row");
			int row= UI();
			System.out.println("Please enter the collumn");
			int col=UI();
			if(count%2==0) {
				board.update(row, col, 1);
			}
			else {
				board.update(row, col, 2);
			}
			count++;
			if(winner!=0) {
				System.out.println("Player "+ winner+" is the winner");
				System.out.println("Congratulations!!");
				win=true;
			}
			}
			
		
	}

}
