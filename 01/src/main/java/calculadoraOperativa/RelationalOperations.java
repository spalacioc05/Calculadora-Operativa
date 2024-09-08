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



public class RelationalOperations implements Operation {
	
    public RelationalOperations() {
	}
    
    private boolean EsMayor(double num1,double num2) {
    	return num1 > num2;
    }
    
    private boolean EsMenor(double num1,double num2) {
    	return num1 < num2;
    }
    
    private boolean EsIgual(double num1,double num2) {
    	return num1 == num2;
    }

	@Override
    public void execute() {
        try {
            double num1 = Lectura.tecladoDouble("\nIngresa el primer número: ");
            double num2 = Lectura.tecladoDouble("Ingresa el segundo número: ");
            System.out.println("\nLas operaciones relaciones entre "+num1+" y "+num2+" son:");
            System.out.println("Mayor que: " + num1+" > "+num2+" = "+EsMayor(num1,num2));
            System.out.println("Menor que: " + num1+" < "+num2+" = "+EsMenor(num1,num2));
            System.out.println("Igual a: " + num1+" == "+num2+" = "+EsIgual(num1,num2)+"\n");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}