/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author User
 */
public class Ejercicio4 {

    /**
     * La función ordenamientoPersonalizado recibe como parámetro un vector de números enteros de longitud PAR, su trabajo 
     * será retornar el vector ordenado de la siguiente manera:

    La primera mitad de los valores deben estar ordenados ascendentemente
    La segunda mitad de los valores deben estar ordenados descendentemente

El programa debe retornar como resultado exclusivamente el valor solicitado, no debe contener letras ni enunciados que lo acompañen.

Ejemplo de entrada:

int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};

Salida (Retorno):

int [] vectorEntradaOrdenado = {0, 1, 2, 65, 66, 90, 78, 13, 12, 11};

Explicación:

El vector tiene 10 elementos, los primeros 5 elementos son: 0, 2, 1, 65, 66, ordenados de manera ascendente: 0, 1, 2, 65, 66

Los otros 5 elementos del vector son: 78, 12, 11, 90, 13, ordenados de manera descendente: 78, 13, 12, 11

Evite utilizar tildes, eñes y caracteres especiales dentro del código, ya que el sistema podría no reconocerlos y generar un mensaje de error.
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int [] ordenamientoPersonalizado(int [] vector){
       int [] vectorOrdenado = new int [vector.length];
       int acu1,acu2,menor,mayor;
       for (int i = 0; i < ((vector.length/2)); i++){
           for(int j = 0; j < ((vector.length/2)-1); j++){
                if(vector[j] > vector[j+1]){
                    menor = vector[j+1];
                    vector[j+1] = vector[j];
                    vector[j] = menor;
                }
           }
       }
       for (int i = vector.length/2; i < ((vector.length)); i++){
           for(int j = vector.length/2; j < ((vector.length)-1); j++){
                if(vector[j] < vector[j+1]){
                    mayor = vector[j+1];
                    vector[j+1] = vector[j];
                    vector[j] = mayor;
                }
           }
       }
       for(int i=0;i<vector.length/2;i++){
           acu1 = vector[i];
           vectorOrdenado[i] = acu1;
       } 
       for (int i = vector.length/2;i < vector.length;i++){
           acu2 = vector[i];
           vectorOrdenado[i] = acu2;
            }
        for (int i = 0; i < vectorOrdenado.length; i++){
            System.out.print(vectorOrdenado[i]);
        }  
        return vectorOrdenado;
    }
}
