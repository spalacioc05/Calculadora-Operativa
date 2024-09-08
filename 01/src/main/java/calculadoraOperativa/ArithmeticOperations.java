/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package calculadoraOperativa;
import java.io.IOException;

import Interfaces.Operation;
import Utilities.Lectura;

public class ArithmeticOperations implements Operation {

    public ArithmeticOperations() {
		
	}

	private double suma(double num1, double num2) {
        return num1 + num2;
    }

    private double resta(double num1, double num2) {
        return num1 - num2;
    }

    private double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    private String division(double num1, double num2) { 
       try {
    	   double div = num1/num2;
    	   return Double.toString(div);
        }
       catch(ArithmeticException e){
    	   System.err.println("División por cero no permitida");
        }
       return "Error";
    }

    private String modulo(double num1, double num2) {
    	try {
     	   double res = num1%num2;
     	   return Double.toString(res);
         }
        catch(ArithmeticException e){
     	   System.err.println("División por cero no permitida");
         }
        return "Error";
    }

    @Override
    public void execute() {
        try {
            double num1 = Lectura.tecladoDouble("\nIngresa el primer número: ");
            double num2 = Lectura.tecladoDouble("Ingresa el segundo número: ");
            
            System.out.println("\nLas operaciones basicas aritmeticas que se pueden realizar con los numeros ingresados son:\n");
            System.out.println(num1 + " + " + num2 + " = " + suma(num1, num2));
            System.out.println(num1 + " - " + num2 + " = " + resta(num1, num2));
            System.out.println(num1 + " * " + num2 + " = " + multiplicacion(num1, num2));
            System.out.println(num1 + " / " + num2 + " = " + division(num1, num2));
            System.out.println(num1 + " % " + num2 + " = " + modulo(num1, num2)+"\n");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
 