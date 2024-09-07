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

    @Override
    public void execute() {
        try {
            double num2 = Lectura.tecladoDouble(bIn, "Ingresa el segundo número: ");
            double num3 = Lectura.tecladoDouble(bIn, "Ingresa el tercer número: ");
            double num1 = Lectura.tecladoDouble(bIn, "Ingresa el primer número: ");
            System.out.println("Resultado de num1 + num2 * num3: " + (num1 + num2 * num3));
            System.out.println("Resultado de (num1 + num2) * num3: " + ((num1 + num2) * num3));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
