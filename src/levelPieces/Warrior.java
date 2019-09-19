package levelPieces;
import java.util.Random;
import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import java.lang.Math;

public class Warrior extends GamePiece implements Moveable {
	Random rand = new Random();
	int n;
	
	
	
	public Warrior(int loc)  {
		super('W', 0);
		n =  rand.nextInt(GameEngine.BOARD_SIZE);		
		super.setLocation(loc);
		super.isMoveable = true;
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		System.out.println(Math.abs((playerLocation - this.getLocation())));
		if(Math.abs((playerLocation - this.getLocation())) <= 1) {
			
			
			while(Math.abs((playerLocation - this.getLocation())) <= 1)	{
				n = rand.nextInt(GameEngine.BOARD_SIZE);
				this.setLocation(n);
			}
			return InteractionResult.HIT;
		}
		else {
			return InteractionResult.NONE;
		}
		
	}
	
	public void move(Drawable[] gameBoard, int playerLocation)	{
		if(playerLocation>this.getLocation()) {
			this.setLocation(this.getLocation()+1);
		}	else	
		
			if (playerLocation<this.getLocation())	{
			this.setLocation(this.getLocation()-1);
		}
			
		
	}	
	

}
