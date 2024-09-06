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



public class BooleanOperations implements Operation {
    BufferedReader bIn = new BufferedReader(new InputStreamReader(System.in));

    public BooleanOperations(BufferedReader bIn) {
        this.bIn = bIn;
    }

    @Override
    public void execute() {
        try {
            boolean bool1 = Boolean.parseBoolean(Lectura.tecladoLinea(bIn, "Enter first boolean: "));
            boolean bool2 = Boolean.parseBoolean(Lectura.tecladoLinea(bIn, "Enter second boolean: "));
            System.out.println("Boolean AND: " + (bool1 && bool2));
            System.out.println("Boolean OR: " + (bool1 || bool2));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}