/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author Carlos
 */
public class Nodo {
    String Numero;
    String tipo;
    String Nombre;
    Nodo Siguiente;
    Nodo Anterior;
    
    public Nodo(String tipo, String Nombre, String Numero) {
        this.tipo = tipo;
        this.Nombre = Nombre;
        this.Numero = Numero;
        this.Siguiente = null;
        this.Anterior = null;
    }
    public Nodo(String tipo, String Nombre, String Numero, Nodo siguiente) {
        this.tipo = tipo;
        this.Nombre = Nombre;
        this.Numero = Numero;
        this.Siguiente = siguiente;
        this.Anterior = null;
    }
    public Nodo(Nodo Anterior, String tipo, String Nombre, String Numero) {
        this.tipo = tipo;
        this.Nombre = Nombre;
        this.Numero = Numero;
        this.Siguiente = null;
        this.Anterior = Anterior;
    }
    public Nodo(Nodo Anterior, String tipo, String Nombre, String Numero, Nodo siguiente) {
        this.tipo = tipo;
        this.Nombre = Nombre;
        this.Numero = Numero;
        this.Siguiente = siguiente;
        this.Anterior = Anterior;
    }
    
}
