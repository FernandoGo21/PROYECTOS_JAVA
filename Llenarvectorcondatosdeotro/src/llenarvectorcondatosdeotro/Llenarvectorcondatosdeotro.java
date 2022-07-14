/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llenarvectorcondatosdeotro;

/**
 *
 * @author User
 */
public class Llenarvectorcondatosdeotro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int [] vectorOrdenado1 = new int [vectorEntrada.length];
        int acu = 0;
        for (int i = 0;i<vectorEntrada.length/2;i++){
            acu = vectorEntrada[i];
            vectorOrdenado1[i] = acu;
            System.out.println(vectorOrdenado1[i]);
        }
    }
    
}
