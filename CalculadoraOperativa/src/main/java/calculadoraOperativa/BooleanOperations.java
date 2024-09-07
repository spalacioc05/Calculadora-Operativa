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
    @Override
    public void execute() {
        try {
            boolean bool1 = Lectura.tecladoBoolean(bIn, "Ingresa el primer booleano: ");
            boolean bool2 = Lectura.tecladoBoolean(bIn, "Ingresa el segundo booleano: ");
            System.out.println("AND booleano: " + (bool1 && bool2));
            System.out.println("OR booleano: " + (bool1 || bool2));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
