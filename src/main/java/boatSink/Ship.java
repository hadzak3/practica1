package boatSink;

abstract class Ship {
	
	protected int nCells;
	protected boolean down[][];
	protected int health;
	protected String name;
	Ship(String name, int health){
		if(health <= 0) {
			throw new IllegalArgumentException();
		}
		this.nCells = health;
		this.name = name;
		this.health = health; 
		this.down = new boolean[Constants.N_BOARD_ROWS_CELLS][Constants.N_BOARD_ROWS_CELLS];
		setAllShipsDownFalse();
	}
	public boolean isCorrectCoordinates(int x, int y) {
		return !(x < 0 || x > Constants.N_BOARD_ROWS_CELLS -1 || y < 0 || y > Constants.N_BOARD_ROWS_CELLS -1);
	}
	public int getNCells() {
		return nCells;
	}
	
	public int getHealth() {
		return this.health;
	}
	public void setDown(int x, int y) {
		if(isCorrectCoordinates(x,y)) {
			down[x][y] = true;
		}
	}
	
	public boolean[][] setAllShipsDownFalse() {
		for(int i = 0; i < Constants.N_BOARD_ROWS_CELLS; i++) {
			for(int j = 0; j < Constants.N_BOARD_ROWS_CELLS - 1; j++) {
				this.down[i][j] = false;
			}
		}
		return this.down;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	public boolean isDown(int x, int y) {
		boolean result = false;
		if(isCorrectCoordinates(x,y)){
			result =  this.down[x][y];
		}
		return result;
		
	}
	
	public boolean isSunk() {
		return (this.health == 0);
	}
	
	public void shoot(int x, int y) {
		if(isCorrectCoordinates(x,y)){
			this.down[x][y] = true;
			this.health--;
			if (this.health == 0) {
				System.out.println("Barco de " + this.nCells + " casilla(s) hundido.");
			} else {
				System.out.println("Barco de " + this.nCells + " casilla(s) tocado.");
			}
		}
	}
}
