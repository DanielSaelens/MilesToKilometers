
// Class Tile, this class is used to build the tiles
public class Tile {
	private int row;
	private int col;
	private Color color;
	
	/**
	 * Parameterized Constructor: Initializes a tile with its row, column, and color.
	 * 
	 * @param row   The row where the tile is located.
	 * @param col   The column where the tile is located.
	 * @param color The color of the tile (RED or BLACK).
	 */
	public Tile(int row, int col, Color color) {
		this.row = row;
		this.col = col;
		this.color = color;
	}
	
	
	// Getter for row
	public  int getRow() {
		return row;
	}
	
	// Getter for column
	public int getCol() {
		return col;
	}
	
	// Getter for color
	public Color getColor() {
		return color;
	}
	
	// Setter for private piece 
	private Piece piece;
	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	/**
	 * Draws the tile and the pieces on to the console.
	 * - If a piece is present, it draws the piece's symbol:
	 *   - "r" for red piece, "b" for black piece.
	 *   -  king symbol is uppercase.
	 * - If no piece is present, it draws the tile's color:
	 *   - "X" for a red tile.
	 *   - "O" for a black tile.
	 */
	public void draw() {
		if (piece != null) {
			String symbol;
			if (piece.getColor() == Color.RED) {
				symbol = "r";
			}
			else {
				symbol = "b";
			}
			if (piece.getKing()) {
				symbol = symbol.toUpperCase();
			}
			System.out.print(symbol);
			return;
		}
		if (color == Color.RED) {
			System.out.print("X");
		}
		else {
			System.out.print("O");
		}
	}
	
}
