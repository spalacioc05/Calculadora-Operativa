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



public class BitwiseOperations implements Operation {
    private final BufferedReader reader;

    public BitwiseOperations(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public void execute() {
        try {
            int num1 = Integer.parseInt(Lectura.tecladoLinea(reader, "Enter first number: "));
            int num2 = Integer.parseInt(Lectura.tecladoLinea(reader, "Enter second number: "));
            System.out.println("Bitwise AND: " + (num1 & num2));
            System.out.println("Bitwise OR: " + (num1 | num2));
            System.out.println("Bitwise XOR: " + (num1 ^ num2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}