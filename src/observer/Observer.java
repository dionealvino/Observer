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
public interface Observer {
        
    /**
     * Metodo que faz a notificação e recebe atualizações;
     * @param obj 
     */
    public void update(Object obj);

}

