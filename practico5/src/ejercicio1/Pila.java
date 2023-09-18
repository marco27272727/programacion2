package ejercicio1;

import java.util.ArrayList;

public class Pila {
    private ArrayList<Object> elementos;

    public Pila(){
        elementos = new ArrayList<>();
    }

    //agrega un elemento nuevo en el tope de la pila 
    public void push(Object nuevoElemento){
        this.elementos.add(nuevoElemento);
    }

    // elimina el elemento del tope de la pila 
    public void pop(){
        this.elementos.remove(this.elementos.size()-1);
    }

    // de vuelve el elemento que esta en el tope de la pila 
    public Object top(){
        return this.elementos.get(this.elementos.size()-1);
    }

    //de vuelve el tamaño del arreglo 
    public int size(){
        return this.elementos.size();
    }

    //retorna una copia del arreglo de elementos
    public ArrayList<Object> copy(){
        return new ArrayList<Object>(this.elementos);
    }

    //retorna un pila que esta al reves de la pila original
    public ArrayList<Object> reverse(){
         ArrayList<Object> invertido = new ArrayList<>();
         for (int posActual = this.elementos.size()-1; posActual >= 0; posActual--){
            invertido.add(elementos.get(posActual));
         }

         return invertido;
    }

}
