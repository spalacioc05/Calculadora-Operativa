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



public class ConditionalOperations implements Operation {
    private final BufferedReader reader;

    public ConditionalOperations(BufferedReader reader) {
        this.reader = reader;
    }

    @Override
    public void execute() {
        try {
            int num = Integer.parseInt(Lectura.tecladoLinea(reader, "Enter a number: "));
            String result = (num > 0) ? "Positive" : "Non-positive";
            System.out.println("The number is: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}