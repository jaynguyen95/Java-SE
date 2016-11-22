import java.util.*;

public class Grid {

	public Grid()
	{
	}
	
	public void createBoard(int[][] board, int n)
	{	
		for(int row=0; row<n; row++)
		{
			for(int column=0; column<n; column++)
			{
				board[row][column] = 0;
			}
		}
		
	}
	
	public void showBoard(int[][] board, int n)
	{
		int maxSize = n;
		
		for (int i = 1; i < n + 1; i++)
		{
			System.out.print("\t"+i);
			
		}
		System.out.println();
		
		for (int row = 0; row < n; row++)
		{
			System.out.println((row+1)+"");
			/*
			 *   0 = blank > neutral 0
			 *  -1 = miss > -
			 *   1 = hit > X
			 *   
			 */
			for (int column = 0; column < n; column++)
			{
				if(board[row][column] == 0)
				{
					System.out.print("\t"+"0");
				} else if (board[row][column] == -1)
				{
					System.out.println("\t"+"-");
				} else if (board[row][column] == 1)
				{
					System.out.println("\t"+"X");
				} 
			}
			System.out.println();
		}
	}
	
	

}
