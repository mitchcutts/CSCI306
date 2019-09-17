package levelPieces;

import java.util.Random;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;

public class Portal extends GamePiece	{

	Random rand = new Random();
	int n;
	
	public Portal(int loc) {
		super('0', 5);
		n =  rand.nextInt(GameEngine.BOARD_SIZE);	
		super.setLocation(loc);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(playerLocation == this.getLocation()) {
			return InteractionResult.TELEPORT;
		}

		return InteractionResult.NONE;
	}
	
	public String toString() {
		return "Portal";
	}

}