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
public class Mamífero extends Animal{
    private String corPelo;

    
    void status(){
        System.out.println("----------------------------------------");
        System.out.println("Status do Mamifero: ");
        System.out.println("Cor do pelo: "+this.getCorPelo());
        System.out.println("Idade: "+this.getIdade()+" anos");
        System.out.println("Menbros: "+this.getMembros());
        System.out.println("Peso: "+ this.getPeso()+" Kg");
        System.out.println("-------------------------------------------");
    
    }
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
    
     
    
    
    
    }
    
    
    

