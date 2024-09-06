/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraOperativa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Utilities.Lectura;
/**
 *
 * @author spala
 */



public class UserInterface {
    BufferedReader bIn = new BufferedReader(new InputStreamReader(System.in));

    public UserInterface() {
        this.bIn = new BufferedReader(new InputStreamReader(System.in));
    }

    public void displayMenu() {
        System.out.println("Welcome to the Calculator of Life!");
        System.out.println("Please select an operation:");
        System.out.println("1. Arithmetic Operations");
        System.out.println("2. Relational Operations");
        System.out.println("3. Bitwise Operations");
        System.out.println("4. Boolean Operations");
        System.out.println("5. Combined Incremental and Arithmetic Operations");
        System.out.println("6. Conditional and String Operations");
        System.out.println("7. Priority between Arithmetic Operators");
        System.out.println("8. Exit");
    }

    public int getUserChoice() throws IOException {
        return (int) Lectura.tecladoInt(bIn, "Enter your choice: ");
    }

    public void executeOperation(int choice) {
        try {
            switch (choice) {
                case 1 -> {
                    ArithmeticOperations arithmeticOperations = new ArithmeticOperations(bIn);
                    arithmeticOperations.execute();
                }
                case 2 -> {
                    RelationalOperations relationalOperations = new RelationalOperations(bIn);
                    relationalOperations.execute();
                }
                case 3 -> {
                    BitwiseOperations bitwiseOperations = new BitwiseOperations(bIn);
                    bitwiseOperations.execute();
                }
                case 4 -> {
                    BooleanOperations booleanOperations = new BooleanOperations(bIn);
                    booleanOperations.execute();
                }
                case 5 -> {
                    CombinedOperations combinedOperations = new CombinedOperations(bIn);
                    combinedOperations.execute();
                }
                case 6 -> {
                    ConditionalOperations conditionalOperations = new ConditionalOperations(bIn);
                    conditionalOperations.execute();
                }
                case 7 -> {
                    PriorityOperations priorityOperations = new PriorityOperations(bIn);
                    priorityOperations.execute();
                }
                case 8 -> {
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        //} catch (IOException e) {
            //System.err.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter a number.");
        }
    }

    public BufferedReader getReader() {
        return bIn;
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
                System.err.println("An error occurred: " + e.getMessage());
            }
        }

    }
    
}