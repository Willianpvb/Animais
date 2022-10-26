/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author willi
 */
public class Ave extends Animal{
    private String corPena;
    
    public void fazerNinho(){
        System.out.println("Construiu ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        
        System.out.println("som de passaro");
    }













}
