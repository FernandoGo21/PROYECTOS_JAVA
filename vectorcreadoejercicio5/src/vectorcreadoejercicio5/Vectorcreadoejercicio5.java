/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorcreadoejercicio5;

/**
 *
 * @author User
 */
public class Vectorcreadoejercicio5 {

    /**
     * La función sumaVectorial recibe como parámetros dos vectores de números enteros DE IGUAL LONGITUD (L), 
     * su trabajo será retornar un vector nuevo de números enteros, que es el resultado de hacer la suma vectorial entre los dos vectores recibidos como parámetro.

El programa debe retornar como resultado exclusivamente el valor solicitado, no debe contener letras ni enunciados que lo acompañen.

Ejemplo de entrada:

int [] v1 = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};

int [] v2 = {0, -2, 1, 9, 4, 78, 12, 11, 90, 13};

Salida (Retorno):

int [] s = {0, 0, 2, 74, 70, 156, 24, 22, 180, 26};

Explicación:

La suma vectorial se hace componente a componente, es decir:

    La suma del primer elemento de ambos vectores: 0 + 0 = 0
    La suma del segundo elemento de ambos vectores: -2 + 0 = 0
    La suma del tercer elemento de ambos vectores: 1 + 1 = 2
    La suma del cuarto elemento de ambos vectores: 65 + 9 = 74
    Y así sucesivamente 
    Nótese que el vector resultante es un vector de igual longitud de los vectores sumar, es decir, L
     */
    public static void main(String[] args) {
        int [] v1 = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int [] v2 = {0, -2, 1, 9, 4, 78, 12, 11, 90, 13};
        int []  s = new int[v1.length];
        int suma = 0;
        for (int i = 0; i < v1.length; i ++){
            s[i] = v1[i]+v2[i];
            System.out.println(s[i]);
        }

    }
    
}
