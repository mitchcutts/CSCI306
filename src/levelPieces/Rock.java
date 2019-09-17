package levelPieces;

import java.util.Random;

import gameEngine.Drawable;


public class Rock implements Drawable{

	Random rand = new Random();
	private int location;
	char symbol = 'R';
	
	public Rock(int loc) {
		
		location =  loc;	
		
		
	}
	
	public int getLocation()
	{
		return location;
	}

	@Override
	public void draw() {
		System.out.print(symbol);
		
	}

}
