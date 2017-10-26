/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.csd.oop.game.Memento;

import java.util.ArrayList;

/**
 *
 * @author Aliaa Abbas
 */
public class CareTaker {
    private ArrayList<Memento> mementoList;
    
    public CareTaker(){
        this.mementoList = new ArrayList<>();
    }
    
    public void addMemento(Memento memento){
        this.mementoList.add(memento);
    }
    
    public Memento get(int index){
        return this.mementoList.get(index);
    }
}
