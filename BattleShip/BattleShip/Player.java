/*  
 *
 */

public class Player {

	public void chooseShip()
	{
		Battleship bS = new Battleship();
		// Select & place patrol boats
		//retrieve number of lives of patrol boats to know the size
		for (int i = 0; i < 2; i++)
		{			
			bS.selectShip(1);
			bS.placeShip();
		}
		
		// Select & place battleships
		for (int i = 0; i < 2; i++)
		{
			bS.selectShip(2);
			bS.placeShip();
		}
		
		// Select & place submarine
		bS.selectShip(3);
		bS.placeShip();
		
		// Select & place destroyer
		bS.selectShip(4);
		bS.placeShip();
		
		// Select & place carrier
		bS.selectShip(5);
		bS.placeShip();
	}

}
