/** 
 * Board: Creates tiles, pieces, and draws the board
 * Author: Caleb Bartel 
 */

import java.util.ArrayList;

public class Board {
	//static final int booardDimension = 8; This should have been all caps because it was final.
	static final int BOARD_DIMENSION = 8;
	static final int NUM_PIECE_ROWS = 3; // num of rows of pieces each player starts with
	private Tile[][] tiles;
	private ArrayList<Piece> boardPieces;
	
    /** 
     * Default Constructor 
     * Initializes an 8x8 board with alternating tile colors.
     * Places RED and BLACK pieces in their respective starting positions.
     */
	public Board() {
		super();
		tiles = new Tile[BOARD_DIMENSION][BOARD_DIMENSION];
		boardPieces = new ArrayList<Piece>();
		
		Color currentTileColor = Color.RED; // Current Color is red 
		for (int row = 0; row < BOARD_DIMENSION; row++){ 
			for (int col = 0; col < BOARD_DIMENSION; col++){
				// Creates a new Tile with the current color 
				tiles[row][col] = new Tile(row,col, currentTileColor);
				// Places red in the top rows
				if (currentTileColor == Color.BLACK && row < NUM_PIECE_ROWS) {
					Piece piece = new Piece(row, col, Color.RED);
					boardPieces.add(piece);
					tiles[row][col].setPiece(piece);
				}
				// Places black in the top rows
				if (currentTileColor == Color.BLACK && row > BOARD_DIMENSION - NUM_PIECE_ROWS - 1) {
					Piece piece = new Piece(row, col, Color.BLACK);
					boardPieces.add(piece);
					tiles[row][col].setPiece(piece);
				}
				//Switch tile color for next column
				currentTileColor = switchColor(currentTileColor);
			}
			// Switch starting color for next row to maintain checkerboard pattern
			currentTileColor = switchColor(currentTileColor);
		}
	}
	
	
	/**
	 * Alternates the tile color between RED and BLACK.
	 * 
	 * @param currentColor The current color of the tile.
	 * @return The opposite color (RED if BLACK, BLACK if RED).
	 */
	
	private Color switchColor(Color curColor) {
		if (curColor == Color.RED) {
			return Color.BLACK;
		}
		else {
			return Color.RED;
		}
	}

	/**
	 * Draws the board to the console in a grid-like format.
	 * 
	 * The board consists of tiles represented by `Tile.draw()`, with horizontal
	 * and vertical separators for visual clarity.
	 */
	private void drawBoard() {
		for (int i = 0; i < BOARD_DIMENSION; i++){
			System.out.println("");   // Prints a new line before each row
			for (int j = 0; j < BOARD_DIMENSION; j++){
				System.out.print("----"); // Used for making the horizontal barrier
				
			}
			System.out.println("");
			for (int j = 0; j < BOARD_DIMENSION; j++){
				System.out.print("| ");  // Used for making the vertical barrier
				tiles[i][j].draw();     // Used to call the draw method
				System.out.print(" ");  //  makes a space for the right border
			}	
		}
	}

	/** 
	 * main: test main to draw initial board arrangement
	 */
	public static void main(String[] args) {
		Board board = new Board();
		board.drawBoard();
	}

}
