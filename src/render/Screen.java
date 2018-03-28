package render;

import cell.Cell;
import cell.TeamColor;
import gameplay.Board;

import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {
    private int firstI = -1, firstJ = -1, secondI = -1, secondJ = -1; //firstI,J: selected square. secondI,J: destination square.
    private Board board; //le board
    private JFrame frame = new JFrame(); //frame to put all the GUI on
    private final String path = "res/";
    private final int cellSize = 20;
    private int frameHeight, frameWidth;
    private int topI, topJ;
    public Screen(Board board){
        this.board = board;
        topI = 0;
        topJ = 0;
        frameHeight = frame.getHeight();
        frameWidth = frame.getWidth();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.setResizable(true);
        frame.setVisible(true);
        repaint();
    }
    public void render(){
        repaint();
    }
    public void paint(Graphics g){
        System.out.println(frameHeight + " , " + frameWidth + "\n");
        paintColors(g);
        //g.drawLine(5,5,313,313);
    }
    public void paintColors(Graphics g){
        frameHeight = frame.getHeight();
        frameWidth = frame.getWidth();
        if(frameHeight/cellSize < board.getLength()) {
            System.out.print("f");
            for (int i = 0; i < frameHeight / cellSize; i++) {
                if(frameWidth/cellSize < board.getWidth()) {
                    for (int j = 0; j < frameWidth / cellSize; j++) {
                        Cell cell = board.getCell(topI + i, topJ + j);
                        cell.paintColor(g, cellSize, topI, topJ);
                    }
                } else {
                    for (int j = 0; j < board.getWidth(); j++) {
                        Cell cell = board.getCell(topI + i, topJ + j);
                        cell.paintColor(g, cellSize, topI, topJ);
                    }
                }
            }
        } else {
            System.out.print("b");
            for (int i = 0; i < board.getLength(); i++) {
                if(frameWidth/cellSize < board.getWidth()) {
                    for (int j = 0; j < frameWidth / cellSize; j++) {
                        Cell cell = board.getCell(topI + i, topJ + j);
                        cell.paintColor(g, cellSize, topI, topJ);
                    }
                } else {
                    for (int j = 0; j < board.getWidth(); j++) {
                        Cell cell = board.getCell(topI + i, topJ + j);
                        cell.paintColor(g, cellSize, topI, topJ);
                    }
                }
            }
        }
    }
    /*public static void main(String[] args){
        Screen screen = new Screen(new Board(10,10));
    }*/
}
