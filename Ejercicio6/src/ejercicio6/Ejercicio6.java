/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author User
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static String join(char [] vector){
        char tx;
        String vectorConcatenado = "";
        StringBuffer vc2 = new StringBuffer();
        String [] vc = new String [vector.length];
        for(int i = 0; i<vector.length;i++){
            tx = vector[i];
            vc[i] = Character.toString(tx);
        }    
        for(int i = 0; i<vc.length;i++){
            vc2 = vc2.append(vc[i]);
        }
        vectorConcatenado = vc2.toString();
        return vectorConcatenado;
        
    }
}
    

