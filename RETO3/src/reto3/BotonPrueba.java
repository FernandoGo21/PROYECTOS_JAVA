/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

public class BotonPrueba extends Boton{
    public BotonPrueba(double ancho, double alto, String colorFondo, String colorTexto, String texto){
        super(ancho, alto, colorFondo, colorTexto, texto);
    }
    @Override
    public void hacerClick() {
       setTexto("Hello World");
    }
}
