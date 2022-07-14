/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorcreadoejercicio6;

/**
 *
 * @author User
 */
public class Vectorcreadoejercicio6 {

    /**
     * La función join recibe como parámetro un vector de caracteres, su trabajo será retornar una cadena de caracteres que es el resultado de concatenar todos los caracteres del vector.

El programa debe retornar como resultado exclusivamente el valor solicitado, no debe contener letras ni enunciados que lo acompañen.

Ejemplo de entrada:

char [] vector = {' ','P', 'r','o',' ', 'g', 'r','a',' ','m','a', 'r'};

Salida (Retorno):

String vectorConcatenado = " Pro gra mar";

Note cómo se manejan los espacios en blanco (Debe concatenarlos, NO eliminarlos).

Evite utilizar tildes, eñes y caracteres especiales dentro del código, ya que el sistema podría no reconocerlos y generar un mensaje de error.
     */
    public static void main(String[] args) {
        char [] vector = {' ','P', 'r','o',' ', 'g', 'r','a',' ','m','a', 'r'};
        String [] vc = new String [vector.length];
        char tx;
        for(int i = 0; i<vector.length;i++){
            tx = vector[i];
            vc[i] = Character.toString(tx);
        }
        char tx1;
        String vectorConcatenado = "";
        StringBuffer vc2 = new StringBuffer();
        String [] vc1 = new String [vector.length];
        for(int i = 0; i<vector.length;i++){
            tx1 = vector[i];
            vc1[i] = Character.toString(tx1);
        }    
        for(int i = 0; i<vc1.length;i++){
            vc2 = vc2.append(vc1[i]);
        }
        vectorConcatenado = vc2.toString();
        System.out.print(vectorConcatenado);
    }
    
}
