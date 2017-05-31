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
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Jornal j = new Jornal();
        Assinante u1 = new Assinante("Barbara Carrijo");
        j.addObserver(u1);
        Assinante u2 = new Assinante("Neto Freitas");
        j.addObserver(u2);
        Assinante u3 = new Assinante("Lula");
        j.addObserver(u3);
        j.setNoticia("A casa vai cair. #umrei");
        
        j.delObserver(u2);
        
        j.setNoticia("O Lula vai preso?");
        
    }
}