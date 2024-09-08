/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraOperativa;
import java.io.IOException;
import Interfaces.Operation;
import Utilities.Lectura;
/**
 *
 * @author spala
 */

public class BitwiseOperations implements Operation {

    public BitwiseOperations() {
       
    }
    
    private int and(int num1, int num2) {
        return num1 & num2;
    }
    
    private int or(int num1, int num2) {
        return num1 | num2;
    }
    
    private int xor(int num1, int num2) {
        return num1 ^ num2;
    }
    
    @Override
    public void execute() {
        try {
            int num1 = (int) Lectura.tecladoInt("\nIngresa el primer número: ");
            int num2 = (int) Lectura.tecladoInt("Ingresa el segundo número: ");
            System.out.println("\nLas operaciones de bits que se pueden realizar entre "+num1+" y "+num2+" son:\n");
            System.out.println("AND a nivel de bits: " + num1+" & "+num2+" = " + and(num1,num2));
            System.out.println("OR a nivel de bits: " + num1 + " | "+num2+" = "+ or(num1,num2));
            System.out.println("XOR a nivel de bits: " + num1+" ^ "+num2+" = "+ xor(num1,num2)+"\n");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}