/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraOperativa;
import java.io.IOException;

import Interfaces.Operation;
import Utilities.Lectura;



public class ConditionalOperations implements Operation{
	
    public ConditionalOperations() {
	}
    
    private String comparacion(int num) {
    	String result = (num > 0) ? "Positivo, debido que "+num+" es mayor a cero" : "No positivo, debido a que "+num+"es menor o igual a cero";
    	return result;
    }

	@Override
    public void execute() {
        try {
            int num = (int) Lectura.tecladoInt("\nIngresa un número: ");
            System.out.println("El número ingresado es: " + comparacion(num)+"\n");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}