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
public class Peixe extends Animal{
    private String corEscama;
    public void soltarBolha(){
        System.out.println("Soltou Bolhas °oO°o0O");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de peixe");
    }






}