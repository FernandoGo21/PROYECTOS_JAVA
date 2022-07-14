/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo;

import java.util.Scanner;


public class Equipo {

    
    public static void main(String[] args) {
            int i= 1;
            while(i>0){
            i = i+1; 
            Scanner input = new Scanner(System.in);
            System.out.print("Seleccion un color: \n");
            System.out.print("1, Verde\n");
            System.out.print("2, Blanco\n");
            System.out.print("3, Rojo\n");
            System.out.print("4, Azul\n");
            System.out.print("5, Salir\n");
            int opcion = input.nextInt();
            if(opcion < 1 || opcion > 5){
                System.out.print("El numero no esta en el rango establecido\n");         
            }
            if(opcion == 1 || opcion == 2){
                System.out.print("Usted es de Nacional\n");
            }
            if(opcion == 3 || opcion == 4){
                System.out.print("Usted es de medellin\n");
            }     
            else if(opcion == 5){
                System.out.println("Adios");
                break;
            }
        }
   }

}
    
