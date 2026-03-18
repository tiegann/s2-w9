// See Instructions:
// http://apcsa-book.ausdk12.org/apcsa/r/cur/c4/L23_2D_arrays/exercises0.html?topic=c4%2FL23_2D_arrays.topic
public class GameBoard {
    private String[][] board;
    public GameBoard(int rows, int cols){
        board = new String[rows][cols];


            for(int r = 0; r<board.length; r++){
                for(int co = 0; co<board[0].length; co++){
                    board[r][co] = "x ";
                    
                }
            }
    }

    public void setCell(int player, int row, int col, String c){
        if(player ==0){
            board[row][col] = c;
        }else{
            board[board.length -1- row][board[0].length -1 - col] = c;
        }

        
    }

    public void print(int player){
        
        for(int r = 0; r<board.length; r++){
                for(int c = 0; c<board[0].length; c++){
                    System.out.print(board[r][c]);
                    
                }
                System.out.println("");
            }
    }

    public static void main(String[] args){
        GameBoard g = new GameBoard(3,3);
        g.setCell(0, 2, 2, "t ");
        g.setCell(1, 1, 1, "o ");
        g.setCell(0, 0, 0, "t ");
        g.setCell(1, 0, 2, "o ");
        g.print(0);
    }
}