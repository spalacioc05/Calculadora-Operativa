/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package calculadoraOperativa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Operation.ArithmeticOperations;
import Operation.BinaryOperations;
import Util.Lectura;

/**
 *
 * @author spala
 */


public class UserInterface {
    BufferedReader bIn = new BufferedReader(new InputStreamReader(System.in));

    public UserInterface() {
        this.bIn = new BufferedReader(new InputStreamReader(System.in));
    }

    public void Menu() {

        while (true) {
            try {
                System.out.println("\n¡Bienvenido a la Calculadora Operativa!");
                System.out.println("\nPor favor, selecciona una operación:");
                System.out.println("1. Operaciones Aritméticas");
                System.out.println("2. Operaciones a Nivel de Bits y Binarios");
                System.out.println("3. Operaciones con cadenas y Strings");
                System.out.println("4. Salir");
                
                int opcion = Lectura.tecladoInt(bIn, "\nIngresa tu elección: ");
                
                try {
                    switch (opcion) {
                        case 1 -> {
                            MenuArithmetic();
                        }
                        case 2 -> {
                            MenuBinary();
                        }
                        case 3 -> {
                            MenuChains();
                        }
                        case 4 -> {
                            System.out.println("\nSaliendo de la calculadora. ¡Adiós!");
                            return;
                        }
                        default -> System.out.println("\nElección inválida. Por favor, inténtalo de nuevo.");
                    }
                    
                } catch (NumberFormatException e) {
                    System.err.println("\nEntrada inválida. Por favor, ingresa un número.");
                }
            } catch (IOException ex) {
            }
        }
        
    }

    public void MenuBinary() {
        BinaryOperations binaryOperations = new BinaryOperations();
        
        while (true) {
            try {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Operaciones a nivel de bits y binario");
            System.out.println("3. Operaciones con bits");
            System.out.println("4. Salir");
            
            int opcion = Lectura.tecladoInt(bIn, "\nOpción: \n");
            
            switch (opcion) {
                case 1 -> {
                    int decimal = Lectura.tecladoInt(bIn, "\nIngrese un número decimal: ");
                    String binario = binaryOperations.decimalToBinary(decimal);
                    System.out.println("Binario: " + binario);
                }
                case 2 -> {
                    String bin = Lectura.tecladoLinea(bIn, "\nIngrese un número binario: ");
                    int dec = binaryOperations.binaryToDecimal(bin);
                    System.out.println("Decimal: " + dec);
                }
                case 3 -> {
                    int num1 = Lectura.tecladoInt(bIn, "\nIngrese el primer número: ");
                    int num2 = Lectura.tecladoInt(bIn, "Ingrese el segundo número: \n");
                    
                    System.out.println("AND: " + binaryOperations.bitwiseAnd(num1, num2));
                    System.out.println("OR: " + binaryOperations.bitwiseOr(num1, num2));
                    System.out.println("XOR: " + binaryOperations.bitwiseXor(num1, num2));
                    System.out.println("NOT (primer número): " + binaryOperations.bitwiseNot(num1));
                    System.out.println("NOT (segundo número): " + binaryOperations.bitwiseNot(num2));
                    System.out.println("Left Shift (primer número): " + binaryOperations.leftShift(num1, 1));
                    System.out.println("Right Shift (primer número): " + binaryOperations.rightShift(num1, 1));
                    System.out.println("Left Shift (segundo número): " + binaryOperations.leftShift(num2, 1));
                    System.out.println("Right Shift (segundo número): " + binaryOperations.rightShift(num2, 1));
                }
                case 4 -> {
                    System.out.println("\nSaliendo...");
                    return;
                }
                default -> System.out.println("\nOpción no válida. Intente de nuevo.");
            }
            } catch (IOException ex) {
            }

        }   
    }

    public void MenuArithmetic() {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        
        while (true) {
            try {
                System.out.println("\nSeleccione una opción:");
                System.out.println("1. Operaciones con dos números");
                System.out.println("2. Prioridad entre operadores");
                System.out.println("3. Salir");
                
                int opcion = Lectura.tecladoInt(bIn, "\nOpción: \n");
                
                switch (opcion) {
                    case 1 -> {
                        double num1 = Lectura.tecladoDouble(bIn, "\nIngrese el primer número: ");
                        double num2 = Lectura.tecladoDouble(bIn, "Ingrese el segundo número: \n");
                        
                        System.out.println("Suma: " + arithmeticOperations.add(num1, num2));
                        System.out.println("Resta: " + arithmeticOperations.subtract(num1, num2));
                        System.out.println("Multiplicación: " + arithmeticOperations.multiply(num1, num2));
                        System.out.println("División: " + arithmeticOperations.divide(num1, num2));
                        System.out.println("Módulo: " + arithmeticOperations.module(num1, num2));
                        System.out.println("Potencia: " + arithmeticOperations.power(num1, num2));
                        double num1V = arithmeticOperations.absoluteValue(num1);
                        System.out.println("Valor absoluto del primer número: " + num1V);
                        double num2V = arithmeticOperations.absoluteValue(num2);
                        System.out.println("Valor absoluto del segundo número: " + num2V);
                        System.out.println("Raíz cuadrada del primer número: " + arithmeticOperations.squareRoot(num1V));
                        System.out.println("Raíz cuadrada del segundo número: " + arithmeticOperations.squareRoot(num2V));
                        System.out.println("Raíz cúbica del primer número: " + arithmeticOperations.cubeRoot(num1));
                        System.out.println("Raíz cúbica del segundo número: " + arithmeticOperations.cubeRoot(num2));
                        System.out.println("Factorial del primer número: " + arithmeticOperations.factorial(num1V));
                        System.out.println("Factorial del segundo número: " + arithmeticOperations.factorial(num2V));
                    }
                    case 2 -> {
                        int cantidadNumeros = Lectura.tecladoInt(bIn, "\n¿Cuántos números va a ingresar?: ");
                        double resultado = Lectura.tecladoDouble(bIn, "Ingrese el primer número: \n");
                        
                        for (int i = 1; i < cantidadNumeros; i++) {
                            String operador = Lectura.tecladoLinea(bIn, "\nIngrese el operador (+, -, *, /): ");
                            double numero = Lectura.tecladoDouble(bIn, "Ingrese el siguiente número: \n");
                            
                            switch (operador) {
                                case "+" -> resultado = arithmeticOperations.add(resultado, numero);
                                case "-" -> resultado = arithmeticOperations.subtract(resultado, numero);
                                case "*" -> resultado = arithmeticOperations.multiply(resultado, numero);
                                case "/" -> resultado = arithmeticOperations.divide(resultado, numero);
                                default -> System.out.println("\nOperador no válido. Intente de nuevo.");
                            }
                        }
                        
                        System.out.println("\nResultado: " + resultado);
                    }
                    case 3 -> {
                        System.out.println("\nSaliendo...");
                        return;
                    }
                    default -> System.out.println("\nOpción no válida. Intente de nuevo.");
                }
            } catch (IOException ex) {
                System.err.println("\nError de entrada/salida: " + ex.getMessage());
            }
        }
    }

    public void MenuChains() {

    }
        
}
