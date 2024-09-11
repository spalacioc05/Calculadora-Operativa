/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Util;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author spala
 */

public class Lectura {

    public static String tecladoLinea(BufferedReader bIn, String label) throws IOException {
        System.out.print(label);
        return bIn.readLine();
    }

    public static double tecladoDouble(BufferedReader bIn, String label) throws IOException {
        do {
            System.out.print(label);
            try {
                double retornar = Double.parseDouble(bIn.readLine());
                return retornar;
            } catch (NumberFormatException e) {
                System.err.println("Debe ingresar un dato numérico");
            }
        } while (true);
    }

    public static int tecladoInt(BufferedReader bIn, String label) throws IOException {
        do {
            System.out.print(label);
            try {
                int retornar = Integer.parseInt(bIn.readLine());
                return retornar;
            } catch (NumberFormatException e) {
                System.err.println("Debe ingresar un dato numérico entero");
            }
        } while (true);
    }

    public static float tecladoFloat(BufferedReader bIn, String label) throws IOException {
        do {
            System.out.print(label);
            try {
                float retornar = Float.parseFloat(bIn.readLine());
                return retornar;
            } catch (NumberFormatException e) {
                System.err.println("Debe ingresar un dato numérico flotante");
            }
        } while (true);
    }

    public static boolean tecladoBoolean(BufferedReader bIn, String label) throws IOException {
        do {
            System.out.print(label);
            try {
                boolean retornar = Boolean.parseBoolean(bIn.readLine());
                return retornar;
            } catch (IOException e) {
                System.err.println("Debe ingresar un dato booleano (true/false)");
            }
        } while (true);
    }
}