package animais;

import java.util.HashMap;

public class Animais {

    public static void main(String[] args) {
        Mamífero cachorro = new Mamífero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Cachorro c1 = new Cachorro();
        Cobra c3 = new Cobra();
        Canguru c4 = new Canguru();
       
        c1.reagir("Oi");
        c1.reagir("Bora comer");
        c1.reagir("Vai Apanhar");
        c1.reagir(11, 45);
        c1.reagir(19, 00);
        c1.reagir(2, 12.5);
        c1.reagir(17, 4.5);
        c1.reagir(true);
        c1.reagir(false);
        c1.emitirSom();
        
        HashMap map = new HashMap();
        map.put(c1.idade, c1.peso);
        System.out.println(map.toString());
        map.put(c1.membros,c1.peso);
        map.put(c1.peso,c1.peso);
        System.out.println(map);
        
        
        
}}
