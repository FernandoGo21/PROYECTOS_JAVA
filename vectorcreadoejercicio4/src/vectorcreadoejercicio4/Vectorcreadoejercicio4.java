/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorcreadoejercicio4;

/**
 *
 * @author User
 */
public class Vectorcreadoejercicio4 {

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

Los otros 5 elementos del vector son: 78, 12, 11, 90, 13, ordenados de manera descendente:90, 78, 13, 12, 11

Evite utilizar tildes, eñes y caracteres especiales dentro del código, ya que el sistema podría no reconocerlos y generar un mensaje de error.
     */
    public static void main(String[] args) {
       int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
       int [] vectorOrdenado1 = {};
       int [] vectorOrdenado2 = {};
       int menor,mayor;
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
            System.out.println(vectorEntrada[i]);
       } 
       for (int i = vectorEntrada.length/2;i < vectorEntrada.length;i++){
            System.out.println(vectorEntrada[i]);
       }
       
    }
}
