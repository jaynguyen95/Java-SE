/* BATTLESHIPS
 *
 *	PHASE 1 - PLAYERS PLACE SHIPS ON BOARD
 *		- SHIPS:
 *			- PATROL BOATS X2 (1X2)
 *			- BATTLESHIPS X2 (1X3)
 *			- SUBMARINE X1 (1X3)
 *			- DESTROYER X1 (1X4)
 *			- CARRIER X1 (1X5)
 *		- 2 SHIPS CANNOT OCCUPY SAME SPACE ON BOARD
 *
 *	PHASE 2 - PLAYERS TAKE TURNS TO SELECT GRID SQUARES TO ATTACK
 *		- ATTEMPT TO FIND OPPONENTS SHIPS
 *		- IF FOUND 
 *			- DESTROY SHIP
 *			- PLAYER GETS SECOND SHOT
 */ 

import java.util.*;
 
public class Battleship {

	public int selectShip(int i)
	{
		// number of lives = size of ship
		int PatrolBoat = 2;
		int BattleShip = 3;
		int Submarine = 3;
		int Destroyer = 4;
		int Carrier = 5;
		
		int numOfLives = 0;
		
		switch(i)
		{
			case 1: numOfLives = PatrolBoat;
			case 2: numOfLives = BattleShip;
			case 3: numOfLives = Submarine;
			case 4: numOfLives = Destroyer;
			case 5: numOfLives = Carrier;
		}
		
		return numOfLives;
	}
	
	// Location to place ship
	// size of ship
	// horizontal or vertical orientation
	public void placeShip()
	{
		
	}
	

}
