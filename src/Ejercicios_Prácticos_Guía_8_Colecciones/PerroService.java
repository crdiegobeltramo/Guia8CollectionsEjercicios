/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Prácticos_Guía_8_Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de
 * tipo String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList.
 *
 *
 * 2. Continuando el ejercicio anterior, después de mostrar los perros, al
 * usuario se le pedirá un perro y se recorrerá la lista con un Iterator, se
 * buscará el perro en la lista. Si el perro está en la lista, se eliminará el
 * perro que ingresó el usuario y se mostrará la lista ordenada. Si el perro no
 * se encuentra en la lista, se le informará al usuario y se mostrará la lista
 * ordenada
 */
public class PerroService {

    Scanner leer = new Scanner(System.in);
    ArrayList<String> razaPerro;

    public PerroService() {
        this.razaPerro = new ArrayList();
    }

    public String crearMascota() {
        String razaP = "";
        System.out.println("Si desea salir del programa oprima la letra s, o de lo contrario oprima cualquier letra");

        while (!razaP.equalsIgnoreCase("s")) {
            System.out.println("Ingrese la raza de la mascota");
            razaP = leer.next();
            if (!razaP.equalsIgnoreCase("s")) {
                agregarMascota(razaP);
            }
        }
        return razaP;
    }

    public void agregarMascota(String razaP) {
        razaPerro.add(razaP);

    }

    public void mostrarMascota() {
        System.out.println("Las mascotas que ingresaste son: ");
        for (String aux : razaPerro) {
            System.out.println(aux);
        }
        System.out.println("La cantidad de mascostas ingresadas es igual a: " + razaPerro.size());
        }
    public void eliminarMascota(){
        System.out.println("Ingrese la raza de perro que quiere eliminar");
        String razaEliminar = leer.next();
        Iterator it = razaPerro.iterator();
        boolean bandera = false;
        while (it.hasNext()){
            if (it.next().equals(razaEliminar)) {
                it.remove();
                bandera = true;
                ordenarLista();        
            }
        }
        if (bandera == false) {
            System.out.println("No se encontro la raza a eliminar");
            ordenarLista();
            
        }
 
    }
    
    public void ordenarLista(){
        Collections.sort(razaPerro);
        System.out.println(razaPerro);
    }
}
