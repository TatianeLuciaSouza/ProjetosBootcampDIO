package sudoku;

public class Puzzle {
	int[][] numbers = new int[SudokuConstants.GRID_SIZE][SudokuConstants.GRID_SIZE];
	boolean[][] isGiven = new boolean[SudokuConstants.GRID_SIZE][SudokuConstants.GRID_SIZE];
	
	//Construtor
	public Puzzle() {
		super();
	}
	
	//Atualiza os n�meros dos arrays e isGiven
	public void newPuzzle(int cellsToGuess) {
	      //Quebra Cabe�a
	      int[][] hardcodedNumbers =
	         {{5, 3, 4, 6, 7, 8, 9, 1, 2},
	          {6, 7, 2, 1, 9, 5, 3, 4, 8},
	          {1, 9, 8, 3, 4, 2, 5, 6, 7},
	          {8, 5, 9, 7, 6, 1, 4, 2, 3},
	          {4, 2, 6, 8, 5, 3, 7, 9, 1},
	          {7, 1, 3, 9, 2, 4, 8, 5, 6},
	          {9, 6, 1, 5, 3, 7, 2, 8, 4},
	          {2, 8, 7, 4, 1, 9, 6, 3, 5},
	          {3, 4, 5, 2, 8, 6, 1, 7, 9}};

	      for (int row = 0; row < SudokuConstants.GRID_SIZE; ++row) {
	         for (int col = 0; col < SudokuConstants.GRID_SIZE; ++col) {
	            numbers[row][col] = hardcodedNumbers[row][col];
	         }
	      }

	      boolean[][] hardcodedIsGiven =
	         {{true, true, true, true, true, false, true, true, true},
	          {true, true, true, true, true, true, true, true, false},
	          {true, true, true, true, true, true, true, true, true},
	          {true, true, true, true, true, true, true, true, true},
	          {true, true, true, true, true, true, true, true, true},
	          {true, true, true, true, true, true, true, true, true},
	          {true, true, true, true, true, true, true, true, true},
	          {true, true, true, true, true, true, true, true, true},
	          {true, true, true, true, true, true, true, true, true}};

	      for (int row = 0; row < SudokuConstants.GRID_SIZE; ++row) {
	         for (int col = 0; col < SudokuConstants.GRID_SIZE; ++col) {
	            isGiven[row][col] = hardcodedIsGiven[row][col];
	         }
	      }
	   }
}
