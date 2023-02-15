/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller_1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class Inventario_COMPLETO {

    Scanner leer = new Scanner(System.in);
    Random obj = new Random();
    int cantidad = obj.nextInt(23);
    String[] nombre = new String[cantidad];
    double[] precio = new double[cantidad];
    int[] cantidades = new int[cantidad];
    int cont = cantidad, cont2 = cantidad, cont3 = cantidad;

    void ingresarNombre() {
        System.out.println(" Items elegido aleatorio del 0 al 23 : " + cantidad+"\n");
        System.out.println("Ingrese en el inventario el nombre del procduto \n");
        for (int i = 0; i <= nombre.length - 1; i++) {
            System.out.println(" Procduto # " + cont + " : ");
            cont--;
            nombre[i] = leer.nextLine();
        }
    }

    void ingresarPrecio() {
        System.out.println("Ingrese en el inventario el precio del procduto \n");
        for (int i = 0; i <= precio.length - 1; i++) {
            System.out.println(" Precio $ del " + cont2 + " : ");
            cont2--;
            precio[i] = leer.nextDouble();
        }
    }

    void ingresarCantidad() {
        System.out.println("Ingrese en el inventario la cantidad del procduto \n");
        for (int i = 0; i <= cantidades.length - 1; i++) {
            System.out.println(" Cantidad del # " + cont3 + " : ");
            cont3--;
            cantidades[i] = leer.nextInt();
        }
    }

    public void mostrar() {
        int cont = 0;
        System.out.println("_____________PRODUCTOS__________");
        for (int a = 0; a <= cantidades.length - 1; a++) {
            cont++;
            System.out.println("Producto  # " + cont + " : " + nombre[a] + " , COSTO DE  $ " + precio[a] + " , CANTIDAD TOTAL : " + cantidades[a]);
            // no retroceder mas, esta bien hasta aca
        }
    }
}
