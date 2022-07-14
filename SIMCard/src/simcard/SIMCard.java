/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simcard;

public class SIMCard {
    private String empresaTelefonia;
    private double saldo;
    private String numeroTelefono;
    private boolean celularApagado;
    private boolean modoAvionActivado;
    private boolean datosActivados;
    private int saldoDatos;
    
    public SIMCard(String numeroTelefono){
        this .numeroTelefono = numeroTelefono;
        this .empresaTelefonia = "HI";
        this .modoAvionActivado = false;
        this .datosActivados = false;
        this .celularApagado = true;
    }
   
    
   public void comprarDatos(int c){
       int precioVariable = 0, precioTotal = 0;
       if(c>0){
           if(c>0 && c<11){
           precioTotal = c * 3000;
                if(this .saldo > precioTotal){
                    this .saldo -= precioTotal;
                }
            }
           else if(c > 10 && c < 31){
           precioVariable = c - 10;
           precioTotal = ((precioVariable * 2500) + (10 * 3000)); 
                if(this .saldo > precioTotal){
                    this .saldo -= precioTotal;
                }
           }
           else if(c>30){
           precioVariable = c - 20;
           precioTotal = ((precioVariable * 1500)+(20*3000));
                if(this .saldo > precioTotal){
                    this .saldo -= precioTotal;
                }
           }
           this. saldoDatos += c;
        }
    }
    public void consumirDatos(int c){
        this .saldoDatos -= c;
    }
    public void llamar(int s){
        int precioSegundo = 1;
        int precioVariable, precioTotal;
        if(s>0){
            if(s<=60){
                this .saldo -= s;
            }
            else if(s>60){
                precioVariable = s-60;
                precioTotal = ((precioVariable*precioSegundo/2)+(60*precioSegundo));
                this .saldo -=s;
            }
        }
    }
    public void recargarSaldo(double s){
    }
    public void gestionarEncendidoCelular(){
      this .celularApagado = !this .celularApagado;
        if(this .celularApagado == true){
            this.datosActivados = false;
            this.modoAvionActivado = false;
        }
        else if(this .celularApagado == false){
            this.datosActivados = false;
            this.modoAvionActivado = false;
        }
    }
    public void gestionarModoAvion(){
        if( ! this .celularApagado ) {
            this .modoAvionActivado = !this .modoAvionActivado;
                if(this .modoAvionActivado == false){
                    this .datosActivados = false;
                }
                else if(this .modoAvionActivado == true){
                    this .datosActivados = false;
                }
        }
    }
    public void gestionarDatos(){
       if(! this .celularApagado && this.modoAvionActivado){
            this.datosActivados = true;
       }   
    }   
    
    
    //Inserte acá los SETTERS Y GETTERS
    public String getEmpresaTelefonia(){
        return this .empresaTelefonia;
    }
    public void setEmpresaTelefonia(String empresaTelefonia){
        this.empresaTelefonia = empresaTelefonia;
    }
    public double getSaldo(){
        return this .saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNumeroTelefono(){
        return this .numeroTelefono;
    }
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public boolean isCelularApagado(){
        return this .celularApagado;
    }
    public void setCelularApagado(boolean celularApagado) {
        this.celularApagado = celularApagado;
    }
    public boolean isModoAvionActivado(){
        return this .modoAvionActivado;
    }
    public void setModoAvionActivado(boolean modoAvionActivado) {
        this.modoAvionActivado = modoAvionActivado;
    }
    public boolean isDatosActivados(){
        return this .datosActivados;
    }
    public void setDatosActivados(boolean datosActivados) {
        this.datosActivados = datosActivados;
    }
    public int getSaldoDatos(){
        return this .saldoDatos;
    }
    public void setSaldoDatos(int saldoDatos) {
        this.saldoDatos = saldoDatos;
    }

@Override
    public String toString() {
        return "SIMCard [ " 
                + "\n  empresaTelefonia=" + this .empresaTelefonia
                + ",  \n  saldo=" + this .saldo
                + ",  \n  numeroTelefono=" + this .numeroTelefono
                + ",  \n  celularApagado=" + this .celularApagado
                + ",  \n  modoAvionActivado=" + this .modoAvionActivado
                + ",  \n  datosActivados=" + this .datosActivados
                + ",  \n  saldoDatos=" + this .saldoDatos
            + "\n]";
    }
    // Inicio de la ejecucion de aplicacion
    public static void main( String [] args ) throws Exception {
        SIMCard cliente = new SIMCard( "3015328969" );
        System.out.println( "1. " + cliente );

        cliente .llamar(50); 
        cliente .llamar(120); 
        cliente .gestionarEncendidoCelular(); 
        cliente .gestionarModoAvion(); 
        cliente .gestionarDatos(); 
        cliente .recargarSaldo(100000); 
        cliente .consumirDatos(3);

        System.out.println( "VPL " + cliente );
    }
}
