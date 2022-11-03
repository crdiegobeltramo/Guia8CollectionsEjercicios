/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg8.colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class ArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<Persona> lista = new ArrayList<Persona>();
       lista.add(new Persona(1,"Diego",41));
       lista.add(new Persona(2,"Luisina",30));
       lista.add(new Persona(3,"Luciana",44));
       lista.add(new Persona(4,"Eduardo",28));
       
        
       //recorrer por indice
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("prueba:" + lista.get(i).getNombre());
            //recorrido for each
            
        }
        System.out.println("----------foreach------");
        for (Persona perso : lista) {
            System.out.println("prueba: " + perso.getNombre());
        }
            
        }
        
        
    }
    

