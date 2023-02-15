/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller_1;

import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class PalabraInvertida_COMPLETO {

    Scanner leer = new Scanner(System.in);
    String palabra;
    void ver() {
        System.out.println(" ingresa una palabra para darla alreves  = ");
        palabra = leer.nextLine();
        char[] invertir = palabra.toCharArray();
        
        int cont;
        for (cont = palabra.length() - 1; cont >= 0; cont--) {
            System.out.println(" "+invertir[cont]);
        }
        System.out.println(" resultado de "+palabra);
    }
}
