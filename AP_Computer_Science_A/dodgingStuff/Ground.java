//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Ground 
{
    private ArrayList<Image> tiles;
    private int current;
    public Ground() throws IOException
    {
        
        tiles = new ArrayList<Image>();

        Image grass = ImageIO.read(new File("grass.gif")); tiles.add(grass);
        Image road = ImageIO.read(new File("road.gif")); tiles.add(road);
        Image gtograss = ImageIO.read(new File("rtograss.gif")); tiles.add(gtograss);
        Image gtoroad = ImageIO.read(new File("gtoroad.gif")); tiles.add(gtoroad);
    
    }
    
    public void drawGround(Graphics2D g)
    {
        for (int x = 0; x < 600; x +=  50) {
            for (int y = 0; y < 800; y =+ 50) {
              if  (y >= 0 && y < 50) current =  0;
                  else if(y > 50 && y <= 100) current = 3;
                  else if(y > 100 && y <= 450) current = 1;
                  else if(y > 450 && y <=500) current = 2;
                  else current = 0; 
                    g.drawImage(tiles.get(current), x, y, null);
              }
            }
          }
}   