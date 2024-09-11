/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operation;

import Interface.BinaryInterface;

/**
 *
 * @author spala
 */
 

public class BinaryOperations implements BinaryInterface {
 
    @Override
    public String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
 
    @Override
     public int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    @Override
    public int bitwiseAnd(int a, int b) {
        return a & b;
    }

    @Override
    public int bitwiseOr(int a, int b) {
        return a | b;
    }

    @Override
    public int bitwiseXor(int a, int b) {
        return a ^ b;
    }

    @Override
    public int bitwiseNot(int a) {
        return ~a;
    }

    @Override
    public int leftShift(int a, int positions) {
        return a << positions;
    }

    @Override
    public int rightShift(int a, int positions) {
        return a >> positions;
    }

}