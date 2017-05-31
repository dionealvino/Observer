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
public class Assinante implements Observer{
    private String nome;    

    public Assinante(String nome) {
        this.nome = nome;
    }
    
    
    @Override
    public void update(Object obj) {
        System.out.println("Caro assinante " + this.nome + ", você recebeu seguinte noticia"
                 + " : " + (String)obj);
    }
    
}
