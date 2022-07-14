/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_semana2;

/**
 *
 * @author User
 */
public class Clase2_semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado_2 c1 = new Cuadrado_2();
        Cuadrado_2 c2 = new Cuadrado_2(3);
        System.out.println("Lado cuadrado uno "+ c1.getLado());
        c1.setLado(50);
        System.out.println("Lado cuadrado uno "+ c1.getLado());
        
    }
    
}
