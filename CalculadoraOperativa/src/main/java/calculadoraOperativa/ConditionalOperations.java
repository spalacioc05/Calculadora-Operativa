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


public class ConditionalOperations implements Operation{

    BufferedReader bIn = new BufferedReader(new InputStreamReader(System.in));


    @Override
    public void execute() {
        try {
            int num = (int) Lectura.tecladoInt(bIn, "Ingresa un número: ");
            String result = (num > 0) ? "Positivo" : "No positivo";
            System.out.println("El número es: " + result);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
