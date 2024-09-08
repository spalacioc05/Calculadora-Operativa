/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraOperativa;
import java.io.IOException;

import Utilities.Lectura;
/**
 *
 * @author spala
 */



public class UserInterface {

    public UserInterface() {
    	
    }

    public void displayMenu() {
        System.out.println("¡Bienvenido a la Calculadora de la Vida!\n");
        System.out.println("Por favor, selecciona una operación:");
        System.out.println("1. Operaciones Aritméticas");
        System.out.println("2. Operaciones Relacionales");
        System.out.println("3. Operaciones a Nivel de Bits");
        System.out.println("4. Operaciones Booleanas");
        System.out.println("5. Operaciones Combinadas Incrementales y Aritméticas");
        System.out.println("6. Operaciones Condicionales");
        System.out.println("7. Prioridad entre Operadores Aritméticos");
        System.out.println("8. Salir");
    }

    public int getUserChoice() throws IOException {
        return (int) Lectura.tecladoInt("\nIngresa tu elección: ");
    }

    public void executeOperation(int choice) {
        try {
            switch (choice) {
                case 1:
                    ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
                    arithmeticOperations.execute();
                    break;
                case 2:
                    RelationalOperations relationalOperations = new RelationalOperations();
                    relationalOperations.execute();
                    break;
                case 3:
                    BitwiseOperations bitwiseOperations = new BitwiseOperations();
                    bitwiseOperations.execute();
                    break;
                case 4:
                    BooleanOperations booleanOperations = new BooleanOperations();
                    booleanOperations.execute();
                    break;
                case 5:
                    CombinedOperations combinedOperations = new CombinedOperations();
                    combinedOperations.execute();
                    break;
                case 6:
                    ConditionalOperations conditionalOperations = new ConditionalOperations();
                    conditionalOperations.execute();
                    break;
                case 7:
                    PriorityOperations priorityOperations = new PriorityOperations();
                    priorityOperations.execute();
                    break;
                case 8:
                    System.out.println("\nSaliendo de la calculadora. ¡Adiós!");
                    break;
                
                default:
                	System.out.println("\nElección inválida. Por favor, inténtalo de nuevo.\n");
            }
        //} catch (IOException e) {
            //System.err.println("Error leyendo la entrada: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Entrada inválida. Por favor, ingresa un número.");
        } 
    }


    public void Menu(){
        boolean exit = false;

        while (!exit) {
            displayMenu();

            try {
                int choice = getUserChoice();
                if (choice == 8) {
                    exit = true;
                }
                executeOperation(choice);
            } catch (IOException e) {
                System.err.println("Ocurrió un error: " + e.getMessage());
            }
        }

    }

}