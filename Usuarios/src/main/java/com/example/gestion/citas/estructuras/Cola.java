/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gestion.citas.estructuras;

/**
 *
 * @author david
 */
import java.util.NoSuchElementException;

public class Cola<T> {
    private Nodo<T> frente;
    private Nodo<T> final_;
    private int tamaño;
    
    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        
        Nodo(T dato) {
            this.dato = dato;
        }
    }
    
    public void encolar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (isEmpty()) {
            frente = nuevo;
        } else {
            final_.siguiente = nuevo;
        }
        final_ = nuevo;
        tamaño++;
    }
    
    public T desencolar() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            final_ = null;
        }
        tamaño--;
        return dato;
    }
    
    public boolean isEmpty() {
        return frente == null;
    }
    
    public int tamaño() {
        return tamaño;
    }
}