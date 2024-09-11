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
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }

    @Override
    public double module(double a, double b) {
        if (b == 0){
            throw new IllegalArgumentException("No se puede modular por cero");
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
    public double increaseAdd(double a, double b) {
        return a += b;
    }

    @Override
    public double increaseSubtract(double a, double b) {
        return a -= b;
    }

    @Override
    public double increaseMultiply(double a, double b) {
        return a *= b;
    }

    @Override
    public double increaseDivide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a /= b;
    }

    @Override
    public double increaseModule(double a, double b) {
        if (b == 0){
            throw new IllegalArgumentException("No se puede modular por cero");
        }
        return a %= b;
    }
    
}
 