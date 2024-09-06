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
/**
 *
 * @author spala
 */



public class PriorityOperations implements Operation {
    BufferedReader bIn = new BufferedReader(new InputStreamReader(System.in));

    public PriorityOperations(BufferedReader bIn) {
        this.bIn = bIn;
    }

    @Override
    public void execute() {
        try {
            double num2 = (double) Lectura.tecladoDouble(bIn, "Enter second number: ");
            double num3 = (double) Lectura.tecladoDouble(bIn, "Enter third number: ");
            double num1 = (double) Lectura.tecladoDouble(bIn, "Enter first number: ");
            System.out.println("Result of num1 + num2 * num3: " + (num1 + num2 * num3));
            System.out.println("Result of (num1 + num2) * num3: " + ((num1 + num2) * num3));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}