
package guia.pkg8.colecciones;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.HashSet;

/**
 *
 * @author diego
 */
public class Guia8Colecciones {

    
    public static void main(String[] args) {
        ArrayList<Integer> numerosA = new ArrayList();
        HashSet<Integer> numerosB = new HashSet();
        HashMap<Integer, String>alumnos = new HashMap();
for (int i = 0; i < 5; i++) {
            numerosA.add((int) Math.round(Math.random()*10));
System.out.println("numerosA= " + numerosA);
        System.out.println("numerosB " + numerosB);
        System.out.println("alumnos = " + alumnos);
       
        numerosA.remove(Integer.valueOf(5));
        System.out.println("Removimos el 5 y numerosA queda así: "+numerosA);
        numerosA.remove(1);
        System.out.println("numerosA luego de borrar posición 1 queda: "+numerosA);
       
        numerosB.remove(20);
       
        System.out.println("REmovimos el 20 en numerosB y quedó: "+numerosB);
       
        alumnos.remove(25300621);
       
        System.out.println("De alumnos eliminamos a Héctor y quedó así: "+alumnos);
    }
    }
}
