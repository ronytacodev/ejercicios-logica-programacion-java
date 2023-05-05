/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tablamultiplicardel1.al4;

/**
 *
 * @author Administrador
 */
public class TablaMultiplicarDel1Al4 {

    public static void main(String[] args) {
        System.out.println("Usando ciclo for");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Tabla de Multiplicar del: " + i);
            System.out.println("");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + " = " + i*j);
            }
        }
        
        System.out.println("Usando ciclo while");
        int i = 1;
        while (i<=4){
            System.out.println("Tabla de multiplicar del: " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + " = " + i*j);
            }
            i++;
        }
    }
    
 
}
