package levelPieces;
import java.util.Random;
import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;
import gameEngine.InteractionResult;

public class Treasure extends GamePiece implements Moveable	{

	Random rand = new Random();
	int n;
	
	public Treasure(int loc) {
		super('T', 6);
		n =  rand.nextInt(GameEngine.BOARD_SIZE);	
		super.setLocation(loc);
		super.isMoveable = true;
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		
		
		if(playerLocation == this.getLocation())	{
			
		
			while(Math.abs((playerLocation - this.getLocation())) <= 1)	{
				n = rand.nextInt(GameEngine.BOARD_SIZE);
				this.setLocation(n);
			}
			
			return InteractionResult.GET_POINT;			
		}	else	{
			return InteractionResult.NONE;
		}
		
		
	}
	
	public void move(Drawable[] gameBoard, int playerLocation)	{
		 
		n = rand.nextInt()%2;
		if(n==1) {
			this.setLocation(this.getLocation()+1);
		} else	{
			this.setLocation(this.getLocation()-1);
		}
		
	}
	

			
		

}
