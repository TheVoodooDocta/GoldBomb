
public class Gold extends Piece {
	private int bars;
	
	public Gold(){
		bars =(int)( Math.random()*10) + 1;
	}
	
	public String toString()
	{
		return ""+bars;
	}

}
