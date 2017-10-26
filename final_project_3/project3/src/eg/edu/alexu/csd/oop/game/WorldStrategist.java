/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.csd.oop.game;

import java.util.ArrayList;

/**
 *
 * @author Aliaa Abbas
 */
public class WorldStrategist {
    private ArrayList<World> worlds;
    private static WorldStrategist worldStrategist;
    private View v;
    
    private WorldStrategist(){
        v=View.getInstance();
        this.worlds=new ArrayList<>();
        this.worlds.add(Circuslevel1.getinstance(700,486,v.getshapename()));
        this.worlds.add(Circuslevel2.getinstance(700,486,v.getshapename()));
        this.worlds.add(Circuslevel3.getinstance(700,486,v.getshapename()));
        worldStrategist=this;
    }
    
    public static WorldStrategist getInstance(){
        if(worldStrategist==null){
            return new WorldStrategist();
        }
        return worldStrategist;
    }
    
    public void addWorld(World world){
        this.worlds.add(world);
    }
    
    public World getWorld(int index){
        return this.worlds.get(index);
    }
    
    public ArrayList getWorlds(){
        return this.worlds;
    }
}
