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

public class CombinedOperations implements Operation {
    BufferedReader bIn = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void execute() {
        try {
            int num = Lectura.tecladoInt(bIn, "Ingresa un número: ");
            num += 5;
            System.out.println("Después de sumar 5: " + num);
            num *= 2;
            System.out.println("Después de multiplicar por 2: " + num);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
