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

    public class ListaSimplementeLigada<T> {
     
    public ListaSimplementeLigada(){
        inicio = null;
    }
     
    /**
     * Este es el inicio de la lista
     */
    private Nodo<T> inicio;
 
    /**
     * Este es el get del inicio
     * @return un dato de tipo Nodo
     */
    public Nodo<T> getInicio() {
        return inicio;
    }
 
    /**
     * Este es el set del inicio
     * @param inicio es el inicio de la lista ligada
     */
    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }
     
    /**
     * Este metodo inserta un elemento al inicio de la lista
     * @param dato es el dato que vamos a insertar al inicio de la lista ligada
     */
     
    public void insertaInicio(T dato){
        Nodo<T> aux = new Nodo<T>(dato);
        aux.setSiguiente(inicio);
        inicio = aux;
         
    }
     
     
     
    /**
     * Este metodo recorre la lista ligada
     */
    public void recorrer(){
        Nodo<T> aux = inicio;
        while(aux != null){
            System.out.print(aux+"-->");
            aux = aux.getSiguiente();
        }
    }
     
     
    public void recorrer_r(Nodo<T> aux){
        if (aux != null){
          System.out.println(aux.getDato());
          recorrer_r(aux.getSiguiente());
        }
 
    }

        public void Insertarultimo(Integer dato) {
        Nodo<T> aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();

            }

            Nodo q = new Nodo();
            aux.setSiguiente(q);

        }
     
     
     
 
}
