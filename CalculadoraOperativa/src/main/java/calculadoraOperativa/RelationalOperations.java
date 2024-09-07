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


    @Override
    public void execute() {
        try {
            double num1 = Lectura.tecladoDouble(bIn, "Ingresa el primer número: ");
            double num2 = Lectura.tecladoDouble(bIn, "Ingresa el segundo número: ");
            System.out.println("Mayor que: " + (num1 > num2));
            System.out.println("Menor que: " + (num1 < num2));
            System.out.println("Igual a: " + (num1 == num2));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
