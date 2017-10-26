
package eg.edu.alexu.csd.oop.game;

import java.awt.Color;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;


public class shapeFactory {
    private static final HashMap<Color, Shape> rectsByColor = new HashMap<Color, Shape>();
    private static Color color;
    private static shapeFactory factory;
    private static ArrayList shapes;
    
    private shapeFactory(){
        
    }
    public static shapeFactory getinstance(){
        if(factory==null)
            factory=new shapeFactory();
        return factory;
    }
    public static Shape getShape(Color color, String name) {
        
        Shape sh = (Shape)rectsByColor.get(color);
        if(sh == null&&name.equals("Dish")) {
            sh = new Dish(color);
            rectsByColor.put(color, sh);
        }
        if(sh==null&&name.equals("Ball")){
            Class plugin=(Class)shapes.get(0);
            try {
                Constructor constructor=plugin.getConstructor();
                Object ob=constructor.newInstance();
                sh=(Shape)ob;
//                sh.setcolor(color);

                rectsByColor.put(color, sh);
            }
                 catch (InstantiationException ex) {
                    Logger.getLogger(shapeFactory.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(shapeFactory.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(shapeFactory.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvocationTargetException ex) {
                    Logger.getLogger(shapeFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
             catch (NoSuchMethodException ex) {
                Logger.getLogger(shapeFactory.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SecurityException ex) {
                Logger.getLogger(shapeFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return sh;
    }
    
    public void setColor(Color color){
        this.color=color;
    }
    public void addShapes(ArrayList shapes){
        this.shapes=shapes;
    }

}
