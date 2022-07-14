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
public class Cuadrado_2 {
    private double lado,lado1,lado2,lado3;
    
    public Cuadrado_2(){
        this.lado = 0;
        System.out.println("Constructor sin parametro");
    }
    public Cuadrado_2(double lado){
        this.lado = 0;
        System.out.println("Constructor con parametro");
    }
   public double getLado(){
        return this.lado;
    }
   public void setLado(double l){
       this.lado = l;
   }
}
