/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

public abstract class Boton {
    //ATRIBUTOS
    private double ancho;
    private double alto;
    private String colorFondo;
    private String colorTexto;
    private String texto;
    //CONSTRUCTOR
    public Boton(double ancho, double alto, String colorFondo, String colorTexto, String texto){
    this .ancho = ancho;
    this .alto = alto;
    this .colorFondo = colorFondo;
    this .colorTexto = colorTexto;
    this .texto = texto;
        } 
    //GETTERS AND SETTERS
    public double getAncho(){
        return this .ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
     public double getAlto(){
        return this .alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }
     public String getColorFondo(){
        return this .colorFondo;
    }
    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }
    public String getColorTexto(){
        return this .colorTexto;
    }
    public void setColorTexto(String colorTexto) {
        this.colorTexto = colorTexto;
    }
     public String getTexto(){
        return this .texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    //METODOS
    abstract void hacerClick();   
   }
    
