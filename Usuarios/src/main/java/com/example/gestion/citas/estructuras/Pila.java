/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gestion.citas.estructuras;

/**
 *
 * @author david
 */
import java.util.EmptyStackException;

public class Pila<T> {
    private Nodo<T> tope;
    private int tamaño;
    
    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        
        Nodo(T dato) {
            this.dato = dato;
        }
    }
    
    public void push(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
        tamaño++;
    }
    
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T dato = tope.dato;
        tope = tope.siguiente;
        tamaño--;
        return dato;
    }
    
    public boolean isEmpty() {
        return tope == null;
    }
    
    public int tamaño() {
        return tamaño;
    }
}