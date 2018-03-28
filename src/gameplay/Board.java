package gameplay;

import cell.Cell;
import cell.TeamColor;

public class Board {
    private Cell[][] board;

    public Board(int i, int j) {
        board = new Cell[i][j];
        populateBoard();
    }
    public void populateBoard(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = new Cell((int)(Math.random()*2)==1? TeamColor.BLACK: TeamColor.ORANGE,i,j);
            }
        }
    }

    public int getLength(){
        return board.length;
    }

    public int getWidth(){
        return board[0].length;
    }

    public Cell getCell(int i, int j){
        return board[i][j];
    }

    public void setCell(int i, int j, Cell cell){
        board[i][j] = cell;
    }

    public String toString(){
        String out = "";
        for(int i = 0; i < 20; i++){
            out+=i+1+": ";
            for(int j = 0; j < 20; j++){
                out+="|"+board[i][j].toString()+"|";
            }
            out+="\n";
        }
        return out;
    }
}
