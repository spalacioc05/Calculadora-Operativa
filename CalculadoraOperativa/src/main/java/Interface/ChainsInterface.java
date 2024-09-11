/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

public interface ChainsInterface {
    String concatenate(String a, String b);
    int length(String a);
    String substring(String a, int start, int end);
    boolean contains(String a, String b);
    String toUpperCase(String a);
    String toLowerCase(String a);
    boolean equals(String a, String b);
    String replace(String a, String target, String replacement);
}
