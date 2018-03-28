package gameplay;

import cell.TeamColor;
import gameplay.Board;
import render.Screen;

public class Game {
    Board board;
    String playerName;
    Screen screen;
    TeamColor yourColor;
    TeamColor[] teams;
    public Game(int i, int j, int countries, String name, TeamColor color){
        playerName = name;

        board = new Board(i, j);
        System.out.println(board.toString());

        screen = new Screen(board);
    }
}
