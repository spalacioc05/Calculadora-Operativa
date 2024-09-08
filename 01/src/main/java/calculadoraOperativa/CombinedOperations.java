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

public class CombinedOperations implements Operation {
	
    public CombinedOperations() {
	}

	@Override
    public void execute() {
        try {
            int num = Lectura.tecladoInt("\nIngresa un número: ");
            num += 5;
            System.out.println("\nDespués de sumarle 5 al numero ingresado: " + num);
            num *= 2;
            System.out.println("Después de multiplicar por 2 el numero ingresado: " + num+"\n");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}