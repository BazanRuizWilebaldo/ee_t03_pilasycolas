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
public class Pila<T> {

    int tope = -1;
    int vec[];

    Pila(int max) {
        vec = new int[max];
    }

    public boolean llena() {
        if(tope == vec.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean vacia() {
        if(tope == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push( T dato) {
        if (llena() == true) {
            System.out.println("Overflow");
        } else if (tope == -1) {
            tope = 0;
            vec[tope] = T;
        } else {
            tope++;
            vec[tope] = T;
        }
    }

    public int pop() {
        int aux;
        if (vacia() == true) {
            System.out.println("La pila esta vacia");
            return -1;
        } else {
            aux = vec[tope];
            tope--;
        }
        return aux;
    }

    public void Imprime_Datos() {
        if (vacia() == true) {
            System.out.println("La pila esta vacia, ingrese datos primero:");
        } else {
            for (int Contador = 0; Contador < vec.length; Contador++) {
                System.out.println("Los valores de la pila son:" + vec[Contador]);
            }
        }
    }
}
