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

public class BitwiseOperations implements Operation {
    BufferedReader bIn = new BufferedReader(new InputStreamReader(System.in));
    ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

    private int binarioABase10(String binario) {
        return Integer.parseInt(binario, 2);
    }

    private String base10ABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    @Override
    public void execute() {
        try {

            String binario = Lectura.tecladoLinea(bIn, "Ingresa un número binario: ");
            int base10 = Lectura.tecladoInt(bIn, "Ingresa un número en base 10: ");

            int numBinarioBase10 = binarioABase10(binario);

            double suma = arithmeticOperations.suma(numBinarioBase10, base10);
            double resta = arithmeticOperations.resta(numBinarioBase10, base10);
            double multiplicacion = arithmeticOperations.multiplicacion(numBinarioBase10, base10);
            double division = arithmeticOperations.division(numBinarioBase10, base10);
            double modulo = arithmeticOperations.modulo(numBinarioBase10, base10);

            System.out.println("Resultados en base 10:");
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            System.out.println("División: " + division);
            System.out.println("Módulo: " + modulo);

            System.out.println("Resultados en binario:");
            System.out.println("Suma: " + base10ABinario((int) suma));
            System.out.println("Resta: " + base10ABinario((int) resta));
            System.out.println("Multiplicación: " + base10ABinario((int) multiplicacion));
            System.out.println("División: " + base10ABinario((int) division));
            System.out.println("Módulo: " + base10ABinario((int) modulo));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}