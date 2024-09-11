/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author spala
 */

 public interface BinaryInterface {
    String decimalToBinary(int decimal);
    int binaryToDecimal(String binary);
    int bitwiseAnd(int a, int b);
    int bitwiseOr(int a, int b);
    int bitwiseXor(int a, int b);
    int bitwiseNot(int a);
    int leftShift(int a, int positions);
    int rightShift(int a, int positions);
}