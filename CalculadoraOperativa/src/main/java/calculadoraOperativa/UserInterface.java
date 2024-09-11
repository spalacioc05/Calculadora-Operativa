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

public class UserInterface {
    private final BufferedReader bIn;

    public UserInterface() {
        this.bIn = new BufferedReader(new InputStreamReader(System.in));
    }

    public void Menu() {
        while (true) {
            try {
                mostrarMenuPrincipal();
                int opcion = Lectura.tecladoInt(bIn, "\nIngresa tu elección: ");
                procesarOpcionMenuPrincipal(opcion);
            } catch (IOException ex) {
                System.err.println("\nError de entrada/salida: " + ex.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada inválida. Por favor, ingresa un número.");
            }
        }
    }

    private void mostrarMenuPrincipal() {
        System.out.println("\n¡Bienvenido a la Calculadora Operativa!");
        System.out.println("\nPor favor, selecciona una operación:");
        System.out.println("1. Operaciones Aritméticas");
        System.out.println("2. Operaciones a Nivel de Bits y Binarios");
        System.out.println("3. Operaciones con cadenas y Strings");
        System.out.println("4. Salir");
    }

    private void procesarOpcionMenuPrincipal(int opcion) throws IOException {
        switch (opcion) {
            case 1 -> MenuArithmetic();
            case 2 -> MenuBinary();
            case 3 -> MenuChains();
            case 4 -> {
                System.out.println("\nSaliendo de la calculadora. ¡Adiós!");
                System.exit(0);
            }
            default -> System.out.println("\nElección inválida. Por favor, inténtalo de nuevo.");
        }
    }

    public void MenuBinary() {
        BinaryOperations binaryOperations = new BinaryOperations();

        while (true) {
            try {
                mostrarMenuBinary();
                int opcion = Lectura.tecladoInt(bIn, "\nOpción: \n");
                procesarOpcionMenuBinary(opcion, binaryOperations);
            } catch (IOException ex) {
                System.err.println("\nError de entrada/salida: " + ex.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada inválida. Por favor, ingresa un número.");
            }
        }
    }

    private void mostrarMenuBinary() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Operaciones a nivel de bits y binario");
        System.out.println("2. Operaciones con bits");
        System.out.println("3. Salir");
    }

    private void procesarOpcionMenuBinary(int opcion, BinaryOperations binaryOperations) throws IOException {
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
                System.out.println("\nSaliendo...");
                return;
            }
            default -> System.out.println("\nOpción no válida. Intente de nuevo.");
        }
    }

    public void MenuArithmetic() {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

        while (true) {
            try {
                mostrarMenuArithmetic();
                int opcion = Lectura.tecladoInt(bIn, "\nOpción: \n");
                procesarOpcionMenuArithmetic(opcion, arithmeticOperations);
            } catch (IOException ex) {
                System.err.println("\nError de entrada/salida: " + ex.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada inválida. Por favor, ingresa un número.");
            }
        }
    }

    private void mostrarMenuArithmetic() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Operaciones con dos números");
        System.out.println("2. Prioridad entre operadores");
        System.out.println("3. Salir");
    }

    private void procesarOpcionMenuArithmetic(int opcion, ArithmeticOperations arithmeticOperations) throws IOException {
        switch (opcion) {
            case 1 -> realizarOperacionesAritmeticas(arithmeticOperations);
            case 2 -> evaluarPrioridadOperadores(arithmeticOperations);
            case 3 -> {
                System.out.println("\nSaliendo...");
                return;
            }
            default -> System.out.println("\nOpción no válida. Intente de nuevo.");
        }
    }

    private void realizarOperacionesAritmeticas(ArithmeticOperations arithmeticOperations) throws IOException {
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

    private void evaluarPrioridadOperadores(ArithmeticOperations arithmeticOperations) throws IOException {
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

    public void MenuChains() {
        System.out.println("\nFuncionalidad no implementada.");
    }
}