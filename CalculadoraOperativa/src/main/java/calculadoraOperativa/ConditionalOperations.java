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

    public ConditionalOperations(BufferedReader bIn) {
        this.bIn = bIn;
    }

    @Override
    public void execute() {
        try {
            int num = (int) Lectura.tecladoInt(bIn, "Enter a number: ");
            String result = (num > 0) ? "Positive" : "Non-positive";
            System.out.println("The number is: " + result);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}