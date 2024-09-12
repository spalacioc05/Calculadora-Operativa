/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Operation;
import Interface.ArithmeticInterface;

public class ArithmeticOperations implements ArithmeticInterface {
    
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            return Double.NaN; // Devuelve NaN si b es 0
        }
        return a / b;
    }

    @Override
    public double module(double a, double b) {
        if (b == 0) {
            return Double.NaN; // Devuelve NaN si b es 0
        }
        return a % b;
    }

    @Override
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double cubeRoot(double a) {
        return Math.cbrt(a);
    }

    @Override
    public double absoluteValue(double a) {
        return Math.abs(a);
    }

    @Override
    public double factorial(double a) {
        double factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    @Override
    public double increaseAdd(double a, double b, double c) {
        while (true){
            if (c>=0){
                break;
            }else{
                System.out.println("Ingrese un valor mayor a 0");
            }         
        }

        for (double i = 0;i <c; i ++){
            a+= b;
        }       
        return a;
    }

    @Override
    public double increaseSubtract(double a, double b, double c) {
        while (true){
            if (c>=0){
                break;
            }else{
                System.out.println("Ingrese un valor mayor a 0");
            }         
        }

        for (double i = 0;i <c; i ++){
            a+= b;
        }       
        return a;
    }

    @Override
    public double increaseMultiply(double a, double b, double c) {
        while (true){
            if (c>=0){
                break;
            }else{
                System.out.println("Ingrese un valor mayor a 0");
            }         
        }

        for (double i = 0;i <c; i ++){
            a+= b;
        }       
        return a;
    }

    @Override
    public double increaseDivide(double a, double b, double c) {
        if (b == 0) {
            return Double.NaN; // Devuelve NaN si b es 0
        }
        while (true){
            if (c>=0){
                break;
            }else{
                System.out.println("Ingrese un valor mayor a 0");
            }         
        }

        for (double i = 0;i <c; i ++){
            a+= b;
        }       
        return a;
    }

    @Override
    public double increaseModule(double a, double b, double c) {
        if (b == 0) {
            return Double.NaN; // Devuelve NaN si b es 0
        }
        while (true){
            if (c>=0){
                break;
            }else{
                System.out.println("Ingrese un valor mayor a 0");
            }         
        }

        for (double i = 0;i <c; i ++){
            a+= b;
        }       
        return a;
    }

    @Override
    public String positiveOrNegative(double a) {
        String result = (a > 0) ? "Positivo" : "No positivo";
        return result;
    }

    @Override
    public boolean mayor(double a, double b) {
        return a > b;
    }

    @Override
    public boolean menor(double a, double b) {
        return a < b;
    }

    @Override
    public boolean mayorIgual(double a, double b) {
        return a >= b;
    }

    @Override
    public boolean menorIgual(double a, double b) {
        return a <= b;
    }
    
}