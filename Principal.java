/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller_2;

import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("\n****************Operaciones******************\n");
        Operaciones_COMPLETO obj1 = new Operaciones_COMPLETO();
        obj1.ingresaDouble();
        obj1.operar();
        System.out.println("\n****************Inventario******************\n");
        Inventario_COMPLETO obj2 = new Inventario_COMPLETO();
        obj2.for1();
        obj2.for2();
        obj2.for3();
        obj2.for4();
        obj2.while1();
        obj2.while2();
        obj2.while3();
        obj2.while4();
        obj2.dowhile1();
        obj2.dowhile2();
        obj2.dowhile3();
        obj2.dowhile4();
        System.out.println("\n****************Palabra invertida******************\n");
        PalabraInvertida_COMPLETO obj3 = new PalabraInvertida_COMPLETO();
        obj3.ver();
        
    }
}
