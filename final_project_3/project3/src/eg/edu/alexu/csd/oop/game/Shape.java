
package eg.edu.alexu.csd.oop.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public interface Shape {
    //draw shape
    public void draw(Graphics2D g, int X, int Y, int length, int height);
     public void setcolor(Color color);
     public void drawdraw(Graphics2D g, int X, int Y, int length, int height);
}
