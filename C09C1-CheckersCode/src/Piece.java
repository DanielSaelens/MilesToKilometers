/** 
 * Piece: Stores piece information 
 * Author: Caleb Bartel 
 */

public class Piece {
	private int row;
	private int col;
	//public Color color;
	private Color color;
	//public boolean king = false;
	private boolean king = false;
	
	
	/**
	 * Prints the piece's symbol to the console.
	 * "r" for red, "b" for black, and uppercase if the piece is a king.
	 */
	
	public void draw() {
		String symbol;
		if (getColor() == Color.RED) { // If it is red, the symbol will be r
			symbol = "r";
		}
		else {
			symbol = "b";
		}
		if (getKing()) {
			symbol = symbol.toUpperCase(); // if the symbol is a king, it will be upper case
		}
		System.out.print(symbol);
	}
	
	/**
	 * Creates a piece with the specified position and color.
	 * 
	 * @param row   Placement of the piece on the row.
	 * @param col   Placement of the piece on the column.
	 * @param color The color of the piece (RED or BLACK).
	 */

	public Piece(int row, int col, Color color) {
		super();
		this.row = row;
		this.col = col;
		this.setColor(color);
	}

	// Getter
	public boolean getKing() {
		return king;
	}
   // Setter
	public void setKing(boolean king) {
		this.king = king;
	}


	// Getter
	public Color getColor() {
		return color;
	}

	// Setter
	public void setColor(Color color) {
		this.color = color;
	}


}



