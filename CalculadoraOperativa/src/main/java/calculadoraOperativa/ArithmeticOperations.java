/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package calculadoraOperativa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Interfaces.Operation;
import Utilities.Lectura;

public class ArithmeticOperations implements Operation {

    BufferedReader bIn = new BufferedReader(new InputStreamReader(System.in));

    double suma(double num1, double num2) {
        return num1 + num2;
    }

    private double resta(double num1, double num2) {
        return num1 - num2;
    }

    private double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    private double division(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return num1 / num2;
    }

    private double modulo(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return num1 % num2;
    }

    @Override
    public void execute() {
        try {
            double num1 = Lectura.tecladoDouble(bIn, "Ingresa el primer número: ");
            double num2 = Lectura.tecladoDouble(bIn, "Ingresa el segundo número: ");

            System.out.println(num1 + " + " + num2 + " = " + suma(num1, num2));
            System.out.println(num1 + " - " + num2 + " = " + resta(num1, num2));
            System.out.println(num1 + " * " + num2 + " = " + multiplicacion(num1, num2));
            System.out.println(num1 + " / " + num2 + " = " + division(num1, num2));
            System.out.println(num1 + " % " + num2 + " = " + modulo(num1, num2));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
 