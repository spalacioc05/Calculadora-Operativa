/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author spala
 */

public interface ArithmeticInterface {
    
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
    double module(double a, double b);
    double power(double a, double b);
    double squareRoot(double a);
    double cubeRoot(double a);
    double absoluteValue(double a);
    double factorial(double a);
    double increaseAdd(double a, double b, double c);
    double increaseSubtract(double a, double b, double c);
    double increaseMultiply(double a, double b, double c);
    double increaseDivide(double a, double b, double c);
    double increaseModule(double a, double b, double c);
    String positiveOrNegative(double a);
    boolean mayor(double a, double b);
    boolean menor(double a, double b);
    boolean mayorIgual(double a, double b);
    boolean menorIgual(double a, double b);
    
    
}
