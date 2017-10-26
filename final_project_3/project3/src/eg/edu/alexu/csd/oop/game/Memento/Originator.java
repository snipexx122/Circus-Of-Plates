/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.csd.oop.game.Memento;

import eg.edu.alexu.csd.oop.game.View;

/**
 *
 * @author Aliaa Abbas
 */
public class Originator {
    View viewState;
    
    public void setState(View viewState){
        this.viewState=viewState;
    }
    
    public View getState(){
        return this.viewState;
    }
    
    public Memento saveTomemento(){
        return new Memento(this.viewState);
    }
    
    public void getSavedMemento(Memento memento){
        this.viewState = memento.getState();
    }
}
