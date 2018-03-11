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
public class Factorial2 {

    public static void main(String[] args) {

        long numero = 0;
        long resultado = 0;

        do {
            try {
                System.out.print("Porfavor ingrese un numero entero : ");
                Scanner scanner = new Scanner(System.in);
                numero = scanner.nextInt();

            } catch (Exception e) {
                System.out.println("Ingrese un caracter de tipo numero entero");
            }

        } while (numero < 0);

        resultado =  factorial(numero);

        System.out.println("El Factorial es : " + resultado);
    }

    /**
     * Metodo con recursividad
     *
     * @param x
     * @return
     */
    public static long factorial(long x) {

        if (x == 0) {
            return 1;//factorial de 0=1
        } else {
            return x * factorial(x - 1);
        }

    }
}
