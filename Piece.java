
public abstract class Piece {
	private int row, col;
	
	public Piece(){
		row = -1;
		col = -1;
	}
	public void setLocation(int r,int c ){
		row = r;
		col = c;
	}

}
