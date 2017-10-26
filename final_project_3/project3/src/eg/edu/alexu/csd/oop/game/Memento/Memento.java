package eg.edu.alexu.csd.oop.game.Memento;

import eg.edu.alexu.csd.oop.game.View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Aliaa Abbas
 */
public class Memento {
     private View viewState;
     
     public Memento(View viewState){
         this.viewState=viewState;
     }
     
     public View getState(){
         return this.viewState;
     }
}
