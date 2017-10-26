package eg.edu.alexu.csd.oop.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

public class Ball implements Shape{

    private Color colour = Color.black;
    

    @Override
    public void draw(Graphics2D g,int x,int y, int length, int height) {
        Random rand=new Random();
        int xx=rand.nextInt(600);
        g.drawLine(x, y, length, height);
        

    }

    @Override
    public void setcolor(Color color) {
        this.colour=color;
    }

    @Override
    public void drawdraw(Graphics2D g, int x, int y, int length, int height) {
        Random rand=new Random();
        System.out.print("danmn");
        int xx=rand.nextInt(600);
        g.drawLine(x, y, length, height);
        System.out.print("danmn");
    }
    
    
    
}

