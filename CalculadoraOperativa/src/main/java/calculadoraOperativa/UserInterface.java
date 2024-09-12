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
import Operation.ChainsOperations;
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
                int opcion = Lectura.tecladoInt(bIn, "\nIngresa tu eleccion: ");
                procesarOpcionMenuPrincipal(opcion);
            } catch (IOException ex) {
                System.err.println("\nError de entrada/salida: " + ex.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada invalida. Por favor, ingresa un numero.");
            }
        }
    }

    private void mostrarMenuPrincipal() {
        System.out.println("\n¡Bienvenido a la Calculadora Operativa!");
        System.out.println("\nPor favor, selecciona una operacion:");
        System.out.println("1. Operaciones Aritmeticas");
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
                System.out.println("\nSaliendo de la calculadora. ¡Adios!");
                System.exit(0);
            }
            default -> System.out.println("\nEleccion invalida. Por favor, intentalo de nuevo.");
        }
    }

    public void MenuBinary() {
        BinaryOperations binaryOperations = new BinaryOperations();

        while (true) {
            try {
                mostrarMenuBinary();
                int opcion = Lectura.tecladoInt(bIn, "\nOpcion: \n");
                procesarOpcionMenuBinary(opcion, binaryOperations);
            } catch (IOException ex) {
                System.err.println("\nError de entrada/salida: " + ex.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada invalida. Por favor, ingresa un numero.");
            }
        }
    }

    private void mostrarMenuBinary() {
        System.out.println("\nSeleccione una opcion:");
        System.out.println("1. Cambio binario");
        System.out.println("2. Operaciones con bits");
        System.out.println("3. Posicion");
        System.out.println("4. Salir");
    }

    private void procesarOpcionMenuBinary(int opcion, BinaryOperations binaryOperations) throws IOException {
        switch (opcion) {
            case 1 -> {
                int decimal = Lectura.tecladoInt(bIn, "\nIngrese un numero decimal: ");
                String binario = binaryOperations.decimalToBinary(decimal);
                System.out.println("Binario: " + binario);

                String bin = Lectura.tecladoLinea(bIn, "\nIngrese un numero binario: ");
                int dec = binaryOperations.binaryToDecimal(bin);
                System.out.println("Decimal: " + dec);
            }
            case 2 -> {
                int a = Lectura.tecladoInt(bIn, "\nIngrese el primer numero: ");
                int b = Lectura.tecladoInt(bIn, "Ingrese el segundo numero: ");
                System.out.println("AND: " + binaryOperations.bitwiseAnd(a, b));
                System.out.println("OR: " + binaryOperations.bitwiseOr(a, b));
                System.out.println("XOR: " + binaryOperations.bitwiseXor(a, b));
                System.out.println("NOT: " + binaryOperations.bitwiseNot(a));
            }

            case 3 -> {
                int a = Lectura.tecladoInt(bIn, "\nIngrese el numero: ");
                int b = Lectura.tecladoInt(bIn, "Ingrese la posicion: ");
                System.out.println("Izquierda: " + binaryOperations.leftShift(a, b));
                System.out.println("Derecha: " + binaryOperations.rightShift(a, b));
                
            }
            case 4 -> {
                System.out.println("\nSaliendo...");
                System.exit(0);
            }
            default -> System.out.println("\nOpcion no valida. Intente de nuevo.");
        }
    }

    public void MenuArithmetic() {
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

        while (true) {
            try {
                mostrarMenuArithmetic();
                int opcion = Lectura.tecladoInt(bIn, "\nOpcion: \n");
                procesarOpcionMenuArithmetic(opcion, arithmeticOperations);
            } catch (IOException ex) {
                System.err.println("\nError de entrada/salida: " + ex.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("\nEntrada invalida. Por favor, ingresa un numero.");
            }
        }
    }

    private void mostrarMenuArithmetic() {
        System.out.println("\nSeleccione una opcion:");
        System.out.println("1. Operaciones con dos numeros");
        System.out.println("2. Operaciones de incrementos");
        System.out.println("3. Operaciones de condicionales");
        System.out.println("4. Prioridad entre operadores");
        System.out.println("5. Salir");
    }

    private void procesarOpcionMenuArithmetic(int opcion, ArithmeticOperations arithmeticOperations) throws IOException {
        switch (opcion) {
            case 1 -> realizarOperacionesAritmeticas(arithmeticOperations);
            case 2 -> evaluarPrioridadOperadores(arithmeticOperations);
            case 3 -> realizarOperacionesIncrementales(arithmeticOperations);
            case 4 -> evaluarOperacionesCondicionales(arithmeticOperations);
            case 5 -> {
                System.out.println("\nSaliendo...");
                System.exit(0);
            }
            default -> System.out.println("\nOpcion no valida. Intente de nuevo.");
        }
    }

    private void realizarOperacionesAritmeticas(ArithmeticOperations arithmeticOperations) throws IOException {
        double num1 = Lectura.tecladoDouble(bIn, "\nIngrese el primer numero: ");
        double num2 = Lectura.tecladoDouble(bIn, "Ingrese el segundo numero: \n");
        
        System.out.println("Suma: " + arithmeticOperations.add(num1, num2));
        System.out.println("Resta: " + arithmeticOperations.subtract(num1, num2));
        System.out.println("Multiplicacion: " + arithmeticOperations.multiply(num1, num2));
        System.out.println("Division: " + arithmeticOperations.divide(num1, num2));
        System.out.println("Modulo: " + arithmeticOperations.module(num1, num2));
        System.out.println("Potencia: " + arithmeticOperations.power(num1, num2));
        double num1V = arithmeticOperations.absoluteValue(num1);
        System.out.println("Valor absoluto del primer numero: " + num1V);
        double num2V = arithmeticOperations.absoluteValue(num2);
        System.out.println("Valor absoluto del segundo numero: " + num2V);
        System.out.println("Raíz cuadrada del primer numero: " + arithmeticOperations.squareRoot(num1V));
        System.out.println("Raíz cuadrada del segundo numero: " + arithmeticOperations.squareRoot(num2V));
        System.out.println("Raíz cubica del primer numero: " + arithmeticOperations.cubeRoot(num1));
        System.out.println("Raíz cubica del segundo numero: " + arithmeticOperations.cubeRoot(num2));
        System.out.println("Factorial del primer numero: " + arithmeticOperations.factorial(num1V));
        System.out.println("Factorial del segundo numero: " + arithmeticOperations.factorial(num2V));
    }

    private void realizarOperacionesIncrementales(ArithmeticOperations arithmeticOperations) throws IOException {
        double a = Lectura.tecladoDouble(bIn, "\nIngrese el numero base: ");
        double b = Lectura.tecladoDouble(bIn, "Ingrese el numero en el que sera incrementado: ");
        double c = Lectura.tecladoDouble(bIn, "Ingrese la cantidad de veces que quiere que itere el ciclo: \n");

        System.out.println("Incremento: " + arithmeticOperations.increaseAdd(a, b, c));
        System.out.println("Decremento: " + arithmeticOperations.increaseSubtract(a, b, c));
        System.out.println("Multiplicacion: " + arithmeticOperations.increaseMultiply(a, b, c));
        System.out.println("Division: " + arithmeticOperations.increaseDivide(a, b, c));
        System.out.println("Modulo: " + arithmeticOperations.increaseModule(a, b, c));
        
    }

    private void evaluarPrioridadOperadores(ArithmeticOperations arithmeticOperations) throws IOException {
        double a = Lectura.tecladoDouble(bIn, "\nIngrese el primer numero: ");
        double b = Lectura.tecladoDouble(bIn, "Ingrese el segundo numero: ");
        double c = Lectura.tecladoDouble(bIn, "Ingrese el tercer numero: ");
        double d = Lectura.tecladoDouble(bIn, "Ingrese el cuarto numero: \n");
    
        mostrarOpcionesOperaciones();
    
        int opcion = Lectura.tecladoInt(bIn, "\nSeleccione una opcion: ");
        realizarOperacionSeleccionada(opcion, arithmeticOperations, a, b, c, d);
    }
    
    private void mostrarOpcionesOperaciones() {
        System.out.println("\nSeleccione una operacion:");
        System.out.println("1. a + b * (c - d)");
        System.out.println("2. a! + (b - c) / 2");
        System.out.println("3. (a + b) * (c - d)");
        System.out.println("4. a^b + c / d");
        System.out.println("5. sqrt(a) + b^c - d");
        System.out.println("6. abs(a - b) + c * d");
    }
    
    private void realizarOperacionSeleccionada(int opcion, ArithmeticOperations arithmeticOperations, double a, double b, double c, double d) {
        switch (opcion) {
            case 1 -> System.out.println("Resultado: " + (a + b * (c - d)));
            case 2 -> System.out.println("Resultado: " + (arithmeticOperations.factorial(a) + (b - c) / 2));
            case 3 -> System.out.println("Resultado: " + ((a + b) * (c - d)));
            case 4 -> System.out.println("Resultado: " + (Math.pow(a, b) + c / d));
            case 5 -> System.out.println("Resultado: " + (Math.sqrt(a) + Math.pow(b, c) - d));
            case 6 -> System.out.println("Resultado: " + (Math.abs(a - b) + c * d));
            default -> System.out.println("Opcion no valida. Intente de nuevo.");
        }
    }

    public void MenuChains() throws IOException {
        ChainsOperations chainsOperations = new ChainsOperations();

        while (true) {
            mostrarMenuChains();
            int opcion = Lectura.tecladoInt(bIn, "\nSeleccione una opcion: ");
            try {
                procesarOpcionMenuChains(opcion, chainsOperations);
            } catch (IOException e) {
                System.err.println("Error al procesar la opcion: " + e.getMessage());
            }
        }
    }

    private void mostrarMenuChains() {
        System.out.println("\nSeleccione una opcion:");
        System.out.println("1. Concatenar cadenas");
        System.out.println("2. Longitud de una cadena");
        System.out.println("3. Subcadena de una cadena");
        System.out.println("4. Contiene una cadena");
        System.out.println("5. Convertir a mayusculas");
        System.out.println("6. Convertir a minusculas");
        System.out.println("7. Comparar cadenas");
        System.out.println("8. Reemplazar en una cadena");
        System.out.println("9. Salir");
    }

    private void procesarOpcionMenuChains(int opcion, ChainsOperations chainsOperations) throws IOException {
        switch (opcion) {
            case 1 -> {
                String str1 = Lectura.tecladoLinea(bIn, "\nIngrese la primera cadena: ");
                String str2 = Lectura.tecladoLinea(bIn, "Ingrese la segunda cadena: ");
                System.out.println("Resultado: " + chainsOperations.concatenate(str1, str2));
            }
            case 2 -> {
                String str = Lectura.tecladoLinea(bIn, "\nIngrese la cadena: ");
                System.out.println("Longitud: " + chainsOperations.length(str));
            }
            case 3 -> {
                String str = Lectura.tecladoLinea(bIn, "\nIngrese la cadena: ");
                int start = Lectura.tecladoInt(bIn, "Ingrese el índice de inicio: ");
                int end = Lectura.tecladoInt(bIn, "Ingrese el índice de fin: ");
                System.out.println("Subcadena: " + chainsOperations.substring(str, start, end));
            }
            case 4 -> {
                String str1 = Lectura.tecladoLinea(bIn, "\nIngrese la cadena principal: ");
                String str2 = Lectura.tecladoLinea(bIn, "Ingrese la cadena a buscar: ");
                System.out.println("Contiene: " + chainsOperations.contains(str1, str2));
            }
            case 5 -> {
                String str = Lectura.tecladoLinea(bIn, "\nIngrese la cadena: ");
                System.out.println("Mayusculas: " + chainsOperations.toUpperCase(str));
            }
            case 6 -> {
                String str = Lectura.tecladoLinea(bIn, "\nIngrese la cadena: ");
                System.out.println("Minusculas: " + chainsOperations.toLowerCase(str));
            }
            case 7 -> {
                String str1 = Lectura.tecladoLinea(bIn, "\nIngrese la primera cadena: ");
                String str2 = Lectura.tecladoLinea(bIn, "Ingrese la segunda cadena: ");
                System.out.println("Iguales: " + chainsOperations.equals(str1, str2));
            }
            case 8 -> {
                String str = Lectura.tecladoLinea(bIn, "\nIngrese la cadena: ");
                String target = Lectura.tecladoLinea(bIn, "Ingrese la cadena a reemplazar: ");
                String replacement = Lectura.tecladoLinea(bIn, "Ingrese la cadena de reemplazo: ");
                System.out.println("Resultado: " + chainsOperations.replace(str, target, replacement));
            }
            case 9 -> System.exit(0);
            default -> System.out.println("\nOpcion no valida. Intente de nuevo.");
        }
    }

    public void evaluarOperacionesCondicionales(ArithmeticOperations arithmeticOperations) throws IOException {
        double a = Lectura.tecladoDouble(bIn, "\nIngrese el primer numero: ");
        double b = Lectura.tecladoDouble(bIn, "Ingrese el segundo numero: \n");

        System.out.println(a + " > " + b + " : " + arithmeticOperations.mayor(a, b));
        System.out.println(a + " < " + b + " : " + arithmeticOperations.menor(a, b));
        System.out.println(a + " >= " + b + " : " + arithmeticOperations.mayorIgual(a, b));
        System.out.println(a + " <= " + b + " : " + arithmeticOperations.menorIgual(a, b));
        System.out.println(a + " es " + arithmeticOperations.positiveOrNegative(a));
        System.out.println(b + " es " + arithmeticOperations.positiveOrNegative(b));
        
    }
}