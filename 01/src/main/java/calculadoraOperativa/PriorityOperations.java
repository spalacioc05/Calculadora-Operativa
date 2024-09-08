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



public class PriorityOperations implements Operation {

    public PriorityOperations() {
	}

	@Override
    public void execute() {
        try {
        	double num1 = Lectura.tecladoDouble("\nIngresa el primer número: ");
            double num2 = Lectura.tecladoDouble("Ingresa el segundo número: ");
            double num3 = Lectura.tecladoDouble("Ingresa el tercer número: ");
            System.out.println("\nVariando la posicion de los parentesis tenemos que: ");
            System.out.println("\nResultado de "+num1+ " + " +num2+ " * "+ num3+" = " + (num1 + num2 * num3));
            System.out.println("Resultado de "+"("+num1 +" + "+ num2+")"+" * "+num3+" = " + ((num1 + num2) * num3)+"\n");
            System.out.println("Debido a que se le da prioridad a operaciones entre parentesis, luego a la multiplicacion y finalmente a la suma.\n");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}