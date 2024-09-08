/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author spala
 */

public class Lectura {
	
	public static BufferedReader bIn = new BufferedReader(new InputStreamReader(System.in));

    public static String tecladoLinea(String label) throws IOException {
        System.out.print(label);
        return bIn.readLine();
    }

    public static double tecladoDouble(String label) throws IOException {
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

    public static int tecladoInt(String label) throws IOException {
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

    public static float tecladoFloat(String label) throws IOException {
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

    public static boolean tecladoBoolean(String label) throws IOException {
        do {
            System.out.print(label);
            String texto = bIn.readLine();
            
            if(texto.equals("true")||texto.equals("false")) {
            	boolean retornar = Boolean.parseBoolean(texto);
            	return retornar;
            }
            else {
            	System.out.println("Debe ingresar un dato booleano (true/false)");
            }
        } while (true);
    }
}