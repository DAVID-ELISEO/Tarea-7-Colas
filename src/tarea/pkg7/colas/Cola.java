/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg7.colas;

/**
 *
 * @author hector
 */
public class Cola {
    NodoCola inicio,fin;
    int tama;
    public Cola(){
        inicio=fin=null;
        tama=0;
    }
    public boolean estaVacia(){
        return inicio==null;
    }
    public void insertar(int ele){
        NodoCola nuevo = new NodoCola(ele);
        if(estaVacia()){
            inicio=nuevo;
        }else{
                 fin.siguiente=nuevo;
        }
        fin=nuevo;
        tama++;
    }
    public int quitar(){
        int aux=inicio.dato;
        inicio=inicio.siguiente;
        tama --;
        return aux;
    }
    public int inicioCola(){
        return inicio.dato;
    }
    public int tamanioCola(){
        return tama;
    }
}
