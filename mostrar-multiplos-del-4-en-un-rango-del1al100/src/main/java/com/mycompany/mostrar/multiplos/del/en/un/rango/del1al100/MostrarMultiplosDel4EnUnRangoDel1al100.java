/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mostrar.multiplos.del.en.un.rango.del1al100;

/**
 *
 * @author Administrador
 */
public class MostrarMultiplosDel4EnUnRangoDel1al100 {

    public static void main(String[] args) {
        int i = 0;
        while (i++ <= 100) {
            if (i % 4 == 0) {
                System.out.println(i + " " + "Es múltiplo de 4.");
            } else {
                System.out.println(i);
            }
        }
    }
}
