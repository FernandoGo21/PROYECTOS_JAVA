/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        double resultado = 1;
        for(int i=1;i<=num;i++){
            resultado = resultado * i;
        }
        System.out.printf("%.0f",resultado);
    }
    
}
