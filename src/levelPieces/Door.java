package levelPieces;
import java.util.Random;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;

public class Door extends GamePiece{

	
	Random rand = new Random();
	int n;
	public Door(int loc) {
		//TODO: randomize location
		super('D', 20);
		n =  rand.nextInt(GameEngine.BOARD_SIZE);	
		super.setLocation(loc);
		
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(playerLocation == this.getLocation()) {
			return InteractionResult.ADVANCE;
			
		}
		else {
			return InteractionResult.NONE;
			
		}
	}
}
