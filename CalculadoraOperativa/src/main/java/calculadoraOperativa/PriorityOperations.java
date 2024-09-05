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



public class PriorityOperations implements Operation {
    private final BufferedReader reader;

    public PriorityOperations(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public void execute() {
        try {
            double num1 = Double.parseDouble(Lectura.tecladoLinea(reader, "Enter first number: "));
            double num2 = Double.parseDouble(Lectura.tecladoLinea(reader, "Enter second number: "));
            double num3 = Double.parseDouble(Lectura.tecladoLinea(reader, "Enter third number: "));
            System.out.println("Result of num1 + num2 * num3: " + (num1 + num2 * num3));
            System.out.println("Result of (num1 + num2) * num3: " + ((num1 + num2) * num3));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}