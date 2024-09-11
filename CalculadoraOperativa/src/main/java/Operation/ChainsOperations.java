/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operation;

import Interface.ChainsInterface;

public class ChainsOperations implements ChainsInterface {

    @Override
    public String concatenate(String a, String b) {
        return a + b;
    }

    @Override
    public int length(String a) {
        return a.length();
    }

    @Override
    public String substring(String a, int start, int end) {
        return a.substring(start, end);
    }

    @Override
    public boolean contains(String a, String b) {
        return a.contains(b);
    }

    @Override
    public String toUpperCase(String a) {
        return a.toUpperCase();
    }

    @Override
    public String toLowerCase(String a) {
        return a.toLowerCase();
    }

    @Override
    public boolean equals(String a, String b) {
        return a.equals(b);
    }

    @Override
    public String replace(String a, String target, String replacement) {
        return a.replace(target, replacement);
    }
}
