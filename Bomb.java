
public class Bomb extends Piece {
	
	private boolean deadly;
	
	public Bomb(){
		int chance = (int) Math.random()*11;
		if (chance <= 5)
			deadly = false;
		else 
			deadly = true;
	}
}
