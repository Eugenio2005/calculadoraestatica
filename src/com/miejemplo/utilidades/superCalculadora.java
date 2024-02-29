/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miejemplo.utilidades;

/**
 *
 * @author Vespertino
 */
public class superCalculadora {
    
    public int multiplicar(int operador1, int operador2) {
        return operador1 * operador2;
    }

    public int dividir(int operador1, int operador2) {
        if (operador2 == 0) {
            throw new ArithmeticException("División por cero");
        }
        return operador1 / operador2;
    }
    
}
