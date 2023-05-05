/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numeros.en2.apartir.del50;

/**
 *
 * @author Administrador
 */
public class Numeros2en2ApartirDel50 {

    public static void main(String[] args) {
        System.out.println("Con ciclo for");
        System.out.println();
        for (int i = 50; i <= 100; i+=2) {
            System.out.println(i);
            
        }
        
        System.out.println("Con ciclo while");
        int j = 50;
        while (j<=100){
            if(j==100){
                System.out.println(j);
            } else {
                System.out.print(j + "-");
            }
            j=j+2;
        }
        
    }
}
