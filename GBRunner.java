public class GBRunner {
	public static void main(String[] args) {
		Piece [][] grid = new Piece[4][4];
		place( grid, new Player( "Tim" ) );
		place( grid, new Bomb());
		place( grid, new Bomb());
		for(int i=0; i<13; i++){
			place( grid, new Gold());
		}
		for(int r = 0; r< grid.length; r++)
		{for (int c = 0; c< grid[0].length;c++)
			System.out.print(grid[r][c] + "\t");
		System.out.println();
		}

		// use the place method to put two bombs in the grid (two lines of code)
		// put 13 Gold objects in the remaining locations in the grid (one loop)
		// print out grid (nested loops)
		//Player p = findPlayer( grid );
		//int num = getGold( grid, p );
		//System.out.println("The player is next to " + num + " bars of gold." );
		//Bomb[] bombs = findBombs( grid, 2 );
		//int nextToBombs = 0;
		//int nextToDeadly = 0;
		// count the bombs (deadly or not) near the player
		// you’ll need a loop and the nextToBombs and nextToDeadly variables
		//System.out.println("The player is next to " + nextToBombs + " bombs." );
		//if ( nextToBombs>0 )
		//System.out.println( nextToDeadly + " of them is/are deadly.\n" );
	} //End of main
	public static void place( Piece [][] arr, Piece p ){
		int row =(int)(Math.random()*4);
		int col =(int)(Math.random()*4);

		while(arr[row][col] != null){
			row =(int)(Math.random()*4);
			col =(int)(Math.random()*4);

		}
		arr[row][col] = p;
		p.setLocation(row, col);}


	// generate a random row and column to assign a piece of a location. // if the location is full create a location until a non-empty location is found
	// place that piece in the location
}/*
	public static Player findPlayer( Piece [][] arr ){
		// searches the array for the first piece that is an instance of the Player class
		// return this value
		// return null if a Player is not found (though you will find one)
	}
	public static int getGold( Piece [][] arr, Player p ){
		// Given a player, return the number of adjacent bars of gold.
	}
	public static Bomb[] findBombs( Piece [][] arr, int num ){
		// Returns an array of Bombs that are in arr, num is the number of bombs
	}*/
//End of GB Runner