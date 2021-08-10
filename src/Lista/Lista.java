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
public class Lista {
    Nodo Inicio;
    
    public Lista()
    {
        Inicio= null;
    }
    
    public Boolean ListaVacia()
    {
        return Inicio==null;
    }
    
    public void Insertar(String Numero, String tipo, String Nombre)
    { 
        Nodo recorrer;
        Boolean existe=false; 
        
        if(ListaVacia())
            Inicio = new Nodo(tipo, Nombre, Numero);
        else
        {
            recorrer = Inicio;
            while(recorrer!=null)
            {
                if(recorrer.Nombre.equals(Nombre))
                {
                    existe=true;
                }
                recorrer=recorrer.Siguiente;
            }
            
            if(existe.equals(false))
            {
                recorrer = Inicio;
                while(recorrer.Siguiente!=null)
                    recorrer=recorrer.Siguiente;
                if(Integer.parseInt(Numero)<Integer.parseInt(Inicio.Numero))
                {
                    Inicio=new Nodo(tipo, Nombre, Numero, Inicio);
                    Inicio.Siguiente.Anterior=Inicio;
                }else
                {
                    recorrer=Inicio;
                    while(recorrer.Siguiente!=null && Integer.parseInt(recorrer.Numero)<Integer.parseInt(Numero))
                        recorrer=recorrer.Siguiente;
                    if(Integer.parseInt(recorrer.Numero)<Integer.parseInt(Numero))
                        recorrer.Siguiente=new Nodo(recorrer, tipo, Nombre, Numero);
                    else
                        if(Integer.parseInt(recorrer.Numero)>Integer.parseInt(Numero))
                        {
                            recorrer.Anterior.Siguiente=new Nodo(recorrer.Anterior, tipo, Nombre, Numero, recorrer);
                            recorrer.Anterior=recorrer.Anterior.Siguiente;
                        }
                }
            }
            System.out.println(Numero+"       "+tipo+"       "+Nombre);
        }
    }
    public void InsertarN(String Numero, String tipo, String Nombre)
    {
        Nodo recorrer;
        Boolean existe=false; 
        
        if(ListaVacia())
            Inicio = new Nodo(tipo, Nombre, Numero);
        else
        {
            recorrer = Inicio;
            while(recorrer!=null)
            {
                if(recorrer.Nombre.equals(Nombre))
                {
                    existe=true;
                }
                recorrer=recorrer.Siguiente;
            }
            
            if(existe.equals(false))
            {
                recorrer=Inicio;
                while(recorrer.Siguiente!=null)
                    recorrer=recorrer.Siguiente;
                recorrer.Siguiente=new Nodo(tipo, Nombre, Numero);
            }
            System.out.println(Numero+"       "+tipo+"       "+Nombre);
        }
    }
    public String recuperar()
    {
        Nodo recorrer=Inicio;
        String texto="";
        if(!ListaVacia())
        {
            while(recorrer!=null)
            {
                texto=texto+recorrer.Numero+"       "+recorrer.tipo+"      "+recorrer.Nombre+"\n";
                recorrer= recorrer.Siguiente;
            }
                
            
        }
        return texto;
    }
}
