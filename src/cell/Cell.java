package cell;

import cell.TeamColor;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Fireflew
 * @version 1.0
 */
public class Cell
{
    private TeamColor color;
    private int i, j;
    Image image;

    public Cell(TeamColor color, int i, int j){
        if(color == TeamColor.BLACK){
            loadImg("black");
        } else if(color == TeamColor.BLUE){
            loadImg("blue");
        } else if(color == TeamColor.GREEN){
            loadImg("green");
        } else if(color == TeamColor.ORANGE){
            loadImg("orange");
        } else if(color == TeamColor.PINK){
            loadImg("pink");
        } else if(color == TeamColor.PURPLE){
            loadImg("purple");
        } else if(color == TeamColor.RED){
            loadImg("red");
        } else if(color == TeamColor.WHITE){
            loadImg("white");
        } else {
            loadImg("unowned");
        }
        this.color = color;
        this.i = i;
        this.j = j;
    }

    public TeamColor getColor(){
       return color;
    }

    public void setColor(TeamColor color){
        this.color = color;
    }

    public int toInt(){
        if(color == TeamColor.BLACK){
            return 1;
        } else if(color == TeamColor.BLUE){
            return 2;
        } else if(color == TeamColor.GREEN){
            return 3;
        } else if(color == TeamColor.ORANGE){
            return 4;
        } else if(color == TeamColor.PINK){
            return 5;
        } else if(color == TeamColor.PURPLE){
            return 6;
        } else if(color == TeamColor.RED){
            return 7;
        } else if(color == TeamColor.WHITE){
            return 8;
        }
        return 0;
    }

    public void paintColor(Graphics g, int size, int topI, int topJ){
        g.drawImage(image, (j - topJ)*size, (i - topI)*size, size, size, null); //j = x i = y
    }

    private Image loadImg(String name){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream is = classLoader.getResourceAsStream(name + ".png");
        try {
            image = ImageIO.read(is);
        } catch (IOException e) {
            System.out.println("cannot load "+name);
            e.printStackTrace();
        }
        return image;
    }

    public String toString(){
        if(color == TeamColor.BLACK){
            return "BK";
        } else if(color == TeamColor.BLUE){
            return "BL";
        } else if(color == TeamColor.GREEN){
            return "GR";
        } else if(color == TeamColor.ORANGE){
            return "OR";
        } else if(color == TeamColor.PINK){
            return "PK";
        } else if(color == TeamColor.PURPLE){
            return "PL";
        } else if(color == TeamColor.RED){
            return "RD";
        } else if(color == TeamColor.WHITE){
            return "WT";
        }
        return "UNOWNED";
    }
}
