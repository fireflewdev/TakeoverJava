import cell.TeamColor;
import gameplay.Game;

/**
 * Write a description of class App here.
 * 
 * @author Fireflew
 * @version 1.0
 */
public class App  
{
    /**
     * Constructor for objects of class App
     */
    public static void main(String[] args) {
        Game game = new Game(60, 60, 5, "Salis", TeamColor.GREEN); //i, j, countries, name, cell.TeamColor
    }
}
