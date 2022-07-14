/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaeje2;

/**
 *
 * @author User
 */
public class PRUEBAEJE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [] vectorEntrada = {0, 2, 14, 65, -66, -78, -80, 11, 90, 13, -8};
                int acu = 0;
                int suma = 0;
            for (int i = 0; i < vectorEntrada.length ;i++){
                if((vectorEntrada[i]%2 == 0) && (vectorEntrada[i]>=0)){
                    acu = vectorEntrada[i];
                    suma += acu;
                }
            }     
            System.out.println(suma);
    }
    
}
