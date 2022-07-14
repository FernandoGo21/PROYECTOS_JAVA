/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

/**
 *
 * @author User
 */
public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] vectorEntrada = {900,125,1,3};
       int [] vectorOrdenado = new int [vectorEntrada.length];
       int acu1,acu2,menor,mayor;
       for (int i = 0; i < ((vectorEntrada.length/2)); i++){
           for(int j = 0; j < ((vectorEntrada.length/2)-1); j++){
                if(vectorEntrada[j] > vectorEntrada[j+1]){
                    menor = vectorEntrada[j+1];
                    vectorEntrada[j+1] = vectorEntrada[j];
                    vectorEntrada[j] = menor;
                }
           }
       }
       for (int i = vectorEntrada.length/2; i < ((vectorEntrada.length)); i++){
           for(int j = vectorEntrada.length/2; j < ((vectorEntrada.length)-1); j++){
                if(vectorEntrada[j] < vectorEntrada[j+1]){
                    mayor = vectorEntrada[j+1];
                    vectorEntrada[j+1] = vectorEntrada[j];
                    vectorEntrada[j] = mayor;
                }
           }
       }
       for(int i=0;i<vectorEntrada.length/2;i++){
           acu1 = vectorEntrada[i];
           vectorOrdenado[i] = acu1;
       } 
       for (int i = vectorEntrada.length/2;i < vectorEntrada.length;i++){
           acu2 = vectorEntrada[i];
           vectorOrdenado[i] = acu2;
            }
        for (int i = 0; i < vectorOrdenado.length; i++){
            System.out.print(" "+vectorOrdenado[i]);
        }
       }
    }

