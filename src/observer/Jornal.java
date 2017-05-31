/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author dione
 */
import java.util.ArrayList;
import java.util.List;

public class Jornal implements Observable {
    
    private List <Observer> observers;
    private String noticia;

    public Jornal() {
        this.observers = new ArrayList<Observer>();
        noticia = "Sem nenhuma noticia";
    }
    
    public void addObserver(Observer obs){
        this.observers.add(obs);
        obs.update("Parabéns!! Assinatura realizada com sucesso.");
        System.out.println("\n");
    }
    
    public void setNoticia(String noticia){
        this.noticia=noticia;
        notifyObservers();
    }

    public void delObserver(Observer obs){
        obs.update("Você deixou de ser assinante\n---------\n");
        this.observers.remove(obs);
    }

    public void notifyObservers(){
        for(Observer obs : this.observers){
            obs.update(noticia);
        }
        System.out.println("---------\n");
    }
    
}
