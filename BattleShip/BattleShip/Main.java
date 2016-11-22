import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		//Variables
		int n = 0;
		Scanner userInput = new Scanner(System.in);
		
		//User input
		System.out.println("What size grid do you want to use?");
		n = userInput.nextInt();
		
		// initialise grid and show in console
		int[][] board = new int[n][n];
		Grid myGrid = new Grid();
		myGrid.createBoard(board, n);
		myGrid.showBoard(board, n);
		
	}

}
