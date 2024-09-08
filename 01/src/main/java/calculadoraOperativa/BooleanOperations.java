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



public class BooleanOperations implements Operation {
	
    public BooleanOperations() {
		
	}
    	
    private boolean and(boolean bol1, boolean bol2) {
        return bol1 && bol2;
    }  //||
    
    private boolean or(boolean bol1, boolean bol2) {
        return bol1 || bol2;
    }
    
	@Override
    public void execute() {
        try {
            boolean bool1 = Lectura.tecladoBoolean("\nIngresa el primer booleano: ");
            boolean bool2 = Lectura.tecladoBoolean("Ingresa el segundo booleano: ");
            System.out.println("\nLas operaciones booleanas que se pueden realizar son:\n");
            System.out.println("AND booleano: " + bool1 + " && "+bool2+" = "+and(bool1,bool2));
            System.out.println("OR booleano: " + bool1 + " || "+bool2+" = "+or(bool1,bool2));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}