/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.miejemplo.utilidades;

/**
 *
 * @author usuario
 */

public class Calculadora extends superCalculadora implements interfaceCalculadora {

    public int resultado;
    
    @Override
    public int sumar(int sumando1, int sumando2) {
        return sumando1 + sumando2;
    }

    @Override
    public int restar(int operador1, int operador2) {
        return operador1 - operador2;
    }


    public int modulo(int operador1, int operador2) {
        if (operador2 == 0) {
            throw new ArithmeticException("Módulo por cero");
        }
        return operador1 % operador2;
    }
    
    public int operacion(int operador1, int operador2, String operacion) {
        if (null != operacion) switch (operacion) {
            case "sumar":
                return sumar(operador1, operador2);
            case "restar":
                return restar(operador1, operador2);
            case "multiplicar":
                return multiplicar(operador1, operador2);
            case "dividir":
                return dividir(operador1, operador2);
            case "modulo":
                return modulo(operador1, operador2);
            default:
                break;
        }
        
        throw new IllegalArgumentException("Operación no válida");
    }
  

}