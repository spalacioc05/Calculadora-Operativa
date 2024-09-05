/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraOperativa;
import java.io.BufferedReader;
import java.io.IOException;

import Interfaces.Operation;
import Utilities.Lectura;
/**
 *
 * @author spala
 */



public class ArithmeticOperations implements Operation {
    private final BufferedReader reader;

    public ArithmeticOperations(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public void execute() {
        try {
            double num1 = Double.parseDouble(Lectura.tecladoLinea(reader, "Enter first number: "));
            double num2 = Double.parseDouble(Lectura.tecladoLinea(reader, "Enter second number: "));
            System.out.println("Addition: " + (num1 + num2));
            System.out.println("Subtraction: " + (num1 - num2));
            System.out.println("Multiplication: " + (num1 * num2));
            System.out.println("Division: " + (num1 / num2));
        } catch (IOException e) {
        }
    }
}
