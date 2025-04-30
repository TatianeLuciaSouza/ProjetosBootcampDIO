package sudoku;

import java.awt.*;
import javax.swing.*;

public class SudokuMain extends JFrame {
   private static final long serialVersionUID = 1L; 
 
   GameBoardPanel board = new GameBoardPanel();
   JButton btnNewGame = new JButton("New Game");

   //Construtor
   public SudokuMain() {
      Container cp = getContentPane();
      cp.setLayout(new BorderLayout());

      cp.add(board, BorderLayout.CENTER);

      board.newGame();

      pack();  
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      setTitle("Sudoku");
      setVisible(true);
   }

   public static void main(String[] args) {
      // [TODO 1] Check "Swing program template" on how to run
      //  the constructor of "SudokuMain"
      // .........
   }
}