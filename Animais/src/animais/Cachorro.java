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
public class Cachorro extends Lobo{
    
    public void reagir(String frase){
        if("Oi".equals(frase) || "Bora comer".equals(frase)){
            System.out.println("Abanar e Latir");
        }else{
            System.out.println("Rosnar");    
                } 
    
    }
    public void reagir(int hora,int min){
        if(hora < 12)
            System.out.println("Abanar");
        else if(hora >= 18)
            System.out.println("Ignorar");
        else
            System.out.println("Abanar e Latir");
    }
    public void reagir(boolean dono){
        if(dono)
            System.out.println("Abanar");
        else{
            System.out.println("Rosnar e Latir");
            this.emitirSom();}
    }
    public void reagir(int idade,double peso){
        if(idade <5)
            if(peso < 10)
                System.out.println("Abanar");
            else{    
                System.out.println("Latir");
                this.emitirSom();}
        else 
            if(peso < 10)
                System.out.println("Rosnar");
            else
                System.out.println("Ignorar");
    }
    @Override
    public void emitirSom(){
        System.out.println("AUAuauauauuauaauau");
    }
    @Override
    public void locomover(){
        System.out.println("Andando");
    }
}
