/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author User
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int [] sumaVectorial(int [] v1, int [] v2){
        int []  s = new int[v1.length];
        int suma = 0;
        for (int i = 0; i < v1.length; i ++){
            s[i] = v1[i]+v2[i];
        }         
        return s;
    }
    
}
