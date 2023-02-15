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
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("\n****************Operaciones******************\n");
        Operaciones obj1 = new Operaciones();
        obj1.ingresaDouble();
        obj1.operar();
        System.out.println("\n****************Inventario******************\n");
        Inventario_COMPLETO obj2 = new Inventario_COMPLETO();
        obj2.ingresarNombre();
        obj2.ingresarPrecio();
        obj2.ingresarCantidad();
        obj2.mostrar();
        System.out.println("\n****************Palabra invertida******************\n");
        PalabraInvertida_COMPLETO obj3 = new PalabraInvertida_COMPLETO();
        obj3.ver();
        
        
        
    }
}
