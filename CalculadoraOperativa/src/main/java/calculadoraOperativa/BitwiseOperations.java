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

    public BitwiseOperations(BufferedReader bIn) {
        this.bIn = bIn;
    }

    @Override
    public void execute() {
        try {
            int num1 = (int) Lectura.tecladoInt(bIn, "Enter first number: ");
            int num2 = (int) Lectura.tecladoInt(bIn, "Enter second number: ");
            System.out.println("Bitwise AND: " + (num1 & num2));
            System.out.println("Bitwise OR: " + (num1 | num2));
            System.out.println("Bitwise XOR: " + (num1 ^ num2));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}