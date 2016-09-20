/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t03_pilasycolas;

/**
 *
 * @author WILY
 */
public class cola<T> {

    

    // Declaracion de la clase de Colas
    int max = 10;  // Tamano maximo de la Cola
    int cola[] = new int[max]; // Declaracion del arreglo
    int frente, fin; // Indicadores de inicio y fin de la Cola

    cola() { // Constructor que inicializa el frente y el final de la Cola
        frente = 0;
        fin = 0;
        System.out.println("Cola inicializada !!!");
    }

    private T o;
    
    /**
     *
     * @param t
     */
    public void Insertar(T o) {
        if (fin == max) { // Esta llena la Cola?
            System.out.println("\nCola llena !!!");
            return;
        }
        cola[fin++] =  T ;
        System.out.println("Dato insertado !!!");
    }

    public void Eliminar() {
        System.out.println("\n\n<<< ELIMINAR >>>");
        if (frente == fin) {  // Esta vacia la Cola?
            System.out.println("\nCola vacia !!!");
            return;
        }
        System.out.println("Elemento eliminado: " + cola[frente++]);
    }

    public void Mostrar() {
        int i = 0;
        System.out.println("\n\n<<< MOSTRAR >>>");
        if (frente == fin) {
            System.out.println("\nCola vacia !!!");
        }
        for (i = frente; i < fin; i++) {
            System.out.println("cola[" + i + "]=" + " " + cola[i]);
        }
        System.out.println("\nFrente= " + frente);
        System.out.println("Final = " + fin);
        System.out.println("Max  = " + max);
    }
}
