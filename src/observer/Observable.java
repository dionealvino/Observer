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
public interface Observable {
       /**
     * Adiciona um novo Observer à lista de notificações.
     */
    public void addObserver(Observer obs);
 
    /**
     * Remove um Observer da lista.
     */
    public void delObserver(Observer obs);
 
    /**
     * Notifica todos os Observers registados.
     */
    public void notifyObservers();
}
