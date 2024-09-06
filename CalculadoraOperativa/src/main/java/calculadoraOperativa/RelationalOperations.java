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



public class RelationalOperations implements Operation {
    BufferedReader bIn = new BufferedReader(new InputStreamReader(System.in));

    public RelationalOperations(BufferedReader bIn) {
        this.bIn = bIn;
    }

    @Override
    public void execute() {
        try {
            double num1 = (double) Lectura.tecladoDouble(bIn, "Enter first number: ");
            double num2 = (double) Lectura.tecladoDouble(bIn, "Enter second number: ");
            System.out.println("Greater than: " + (num1 > num2));
            System.out.println("Less than: " + (num1 < num2));
            System.out.println("Equal to: " + (num1 == num2));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}