/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * La función sumaPares recibe como parámetro un vector de números enteros, su trabajo será retornar la suma de los números PARES POSITIVOS que hay en el 
 * vector dado.

El programa debe retornar como resultado exclusivamente el valor solicitado, no debe contener letras ni enunciados que lo acompañen.

Ejemplo de entrada:

int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};

Salida (Retorno):

248

Explicación:

0 + 2 + 66 + 78 + 12 + 90 = 248

El -8 NO se incluye en la suma, pues NO es positivo.

Evite utilizar tildes, eñes y caracteres especiales dentro del código, ya que el sistema podría no reconocerlos y generar un mensaje de error.
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
    }
     public int sumaPares(int [] vector){
         int s = 0;
         int acu = 0;
            for (int i = 0; i < vector.length ;i++){
                if((vector[i]%2 == 0) && (vector[i]>=0)){
                    acu = vector[i];
                    s += acu;
                }
            }     
           return s;
    }
}