///(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Font;
import java.awt.Canvas;

public class Tree extends Canvas
{
	public Tree()
	{
		setBackground(Color.WHITE);
	}
	public void paint( Graphics window )
	{
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		window.drawString("Lab14h - Tree Lab", 50, 50);
		
		tree(window);
		star(window);
		stem(window);
		lights(window);
		presents(window);


        }
	public void tree(Graphics window)
	{
		int[] treeXPoints = {400,200,600};
		int[] treeYPoints = {100,500,500};
		Polygon tree = new Polygon(treeXPoints,treeYPoints,treeXPoints.length);
		window.setColor(Color.GREEN);
		window.fillPolygon(tree);
        }
	public void star(Graphics window)
	{
	      int starXPoints[]={400,410,420,415,425,400,375,385,370,390};
              int starYPoints[]={90,105,95,115,115,120,125,115,95,105};
              Polygon star = new Polygon(starXPoints,starYPoints,starXPoints.length);
              window.setColor(Color.yellow);
              window.fillPolygon(star);
	   }
	public void stem (Graphics window)
	{
	    int stemXPoints[]={390,410,410,390};
	    int stemYPoints []={500,500,530,530};
	    Polygon stem = new Polygon(stemXPoints,stemYPoints,stemXPoints.length);
	    window.setColor(Color.black);
	    window.fillPolygon(stem);
	   }
	public void lights (Graphics window)
	{
	    window.setColor(Color.red);
            window.fillOval(300,400,20,20);
            window.fillOval(400,350,20,20);
            window.fillOval(460,400,20,20);
            window.fillOval(400,350,20,20);
            window.fillOval(400,280,20,20);
            window.setColor(Color.yellow);
            window.fillOval(350,400,20,20);
            window.fillOval(320,320,20,20); 
            window.fillOval(400,180,20,20);
            window.fillOval(460,350,20,20);
            window.fillOval(320,440,20,20);
            window.setColor(Color.magenta);
            window.fillOval(420,440,20,20);
            window.fillOval(360,200,20,20);
            window.fillOval(340,260,20,20);
	   }	
	public void presents (Graphics window)
	{
	    window.setColor(Color.blue);  
            window.fillRect(120,450,20,80);
            window.setColor(Color.gray);
            window.fillRect(160,500,20,30);
            window.setColor(Color.pink);
            window.fillRect(660,450,20,80);
            window.setColor(Color.red);
            window.fillRect(620,500,20,30);
	   }
}