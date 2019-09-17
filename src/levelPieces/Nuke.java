package levelPieces;

import java.util.Random;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;

public class Nuke extends GamePiece	{

	Random rand = new Random();
	int n;
	
	public Nuke(int loc) {
		super('N', 5);
		n =  rand.nextInt(GameEngine.BOARD_SIZE);	
		super.setLocation(loc);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(playerLocation == this.getLocation()) {
			return InteractionResult.NUKED;
		}
		else {
			
			if(Math.abs(playerLocation-this.getLocation())<=2)	{
				return InteractionResult.RADIATE;
				
			}
			
		}
		return InteractionResult.NONE;
	}

}
