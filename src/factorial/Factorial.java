/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author David Antonio Quijano Ramos
 */
public class Factorial {

    public static void main(String[] args) {
        try {
            int numero;
            System.out.print("Porfavor ingrese un Numero :");
            Scanner scanner = new Scanner(System.in);
            numero = factorial(scanner.nextInt());

            System.out.println("El Factorial es : " + numero);

        } catch (Exception e) {
            System.out.println("Intentelo de nuevo, debe ingresar un numero por favor!");
            
        }

    }

    /**
     * Metodo con recursividad
     *
     * @param x
     * @return
     */
    public static int factorial(int x) {
        if (x < 0 ) {
            System.out.println("Debe ingresar un numero valido");
            return 0;
        } else {
            if (x == 0) {
                return 1;//factorial de 0=1
            } else {
                return x * factorial(x - 1);
            }

        }
//        return x * factorial(-x - 1);
    }

    /**
     * metoro con for
     */
//      public static int factorial(int x) {
//        int resultado = 1;
//        for (int i = 1; i <= x; i++) {
//            resultado *= i;
//        }
//
//        return resultado;
//    }
}
