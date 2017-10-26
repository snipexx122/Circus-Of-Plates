
package eg.edu.alexu.csd.oop.game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
public class ShapeObject implements GameObject{
    public static final int SPRITE_WIDTH = 35;
    private boolean visible;
    private int x;
    private int y;
    private int length;
    private int height;
    private static final int MAX_MSTATE = 1;
    //Color RandColor;
    Shape sh;
    private BufferedImage[] spriteImages = new BufferedImage[MAX_MSTATE];
    @Override
    public int getX() {
        return x;
    }
    
    public ShapeObject(int x, int y,String name,int length,int height,Color RandColor){
        this.visible=true;
        Random rand=new Random();
        for (int i = 0; i < spriteImages.length&&name.equals("Dish"); i++) {
            this.x=x;
            this.y=y;
            this.length=length;
            this.height=height;
            spriteImages[i] = new BufferedImage(length,height,BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = spriteImages[i].createGraphics();
            g2.setStroke(new BasicStroke(20));
            g2.setColor(RandColor);
            g2.setBackground(RandColor);
	    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       	    //g2.setStroke(new BasicStroke(20));
            sh=shapeFactory.getShape(RandColor, name);
            sh.draw(g2, x, y, length, height);
            int clr=  spriteImages[i].getRGB(x,y); 
	    g2.dispose();
        }
        for (int i = 0; i < spriteImages.length&&name.equals("Ball"); i++) {
                this.x = x;
		this.y = y;
                this.length=length;
                this.height=height;
		// create a bunch of buffered images and place into an array, to be displayed sequentially
		spriteImages[0] = new BufferedImage(SPRITE_WIDTH, SPRITE_WIDTH,	BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = spriteImages[0].createGraphics();
		g2.setColor(RandColor);
                g2.setBackground(RandColor);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		sh=shapeFactory.getShape(RandColor, name);
                sh.draw(g2, x, y, length, height);
                g2.setStroke(new BasicStroke(10));
                g2.drawLine(x, y, SPRITE_WIDTH, SPRITE_WIDTH);
                //g2.drawArc(x, y, SPRITE_WIDTH, SPRITE_WIDTH,0,360);
                
		g2.dispose();
        }
    }
    
    
    /*private static Color getRandColor(){
        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt(4);
        return shapeColor[randInt];

    }*/


    @Override
    public void setX(int x) {
        this.x=x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y=y;
    }

    @Override
    public int getWidth() {
        return length;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public boolean isVisible() {
        return visible;
    }

    @Override
    public BufferedImage[] getSpriteImages() {
        return spriteImages;
    }

}
