package no.hvl.dat102.klient;

/***************************************************************/
/****************************************************************/
/*
 * Representerer en posisjon i en labyrint
 */

public class Posisjon {
	/** x koordinat */
	private int x;
	/** y koordinat */
	private int y;

	/*
	 * Konstruktør
	 */
	Posisjon() {
		x = 0;
		y = 0;
	}

	/**
	 * @return x, x-koordinat
	 */
	public int getX() {
		return x;
	}
	
	
	/**
	 * @param x , x-koordinat	 
	 */
	 	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return y, y-koordinat
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y, y-koordinat
	 */
	public void setY(int y) {
		this.y = y;
	}

}// class
