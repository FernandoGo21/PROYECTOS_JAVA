/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

import java.math.BigDecimal;

    public class SimCard {
    // Atributos
    private String empresaTelefonia;
    private double saldo;
    private String numeroTelefono;
    private boolean celularApagado;
    private boolean modoAvionActivado;
    private boolean datosActivados;
    private int saldoDatos;
    //<acceso> <modificadores+> <tipo*> <nombre-variable*>

    // Constructor
    public SimCard( String numeroTelefono ) {
        this .numeroTelefono = numeroTelefono;

        // Asignaciones
        this .empresaTelefonia = "HI";
        this .modoAvionActivado = false;
        this .datosActivados = false;
        this .celularApagado = true;
    }

    // Getters and setters
    public String getEmpresaTelefonia() {
        return this .empresaTelefonia;
    }

    public void setEmpresaTelefonia(String empresaTelefonia) {
        this.empresaTelefonia = empresaTelefonia;
    }

    public double getSaldo() {
        return this .saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroTelefono() {
        return this .numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public boolean isCelularApagado() {
        return this .celularApagado;
    }

    public void setCelularApagado(boolean celularApagado) {
        this.celularApagado = celularApagado;
    }

    public boolean isModoAvionActivado() {
        return this .modoAvionActivado;
    }

    public void setModoAvionActivado(boolean modoAvionActivado) {
        this.modoAvionActivado = modoAvionActivado;
    }

    public boolean isDatosActivados() {
        return this .datosActivados;
    }

    public void setDatosActivados(boolean datosActivados) {
        this.datosActivados = datosActivados;
    }

    public int getSaldoDatos() {
        return this .saldoDatos;
    }

    public void setSaldoDatos(int saldoDatos) {
        this.saldoDatos = saldoDatos;
    }

    // Metodos: Resta el costo de las c GB a saldo
    public void comprarDatos( int c ) { // 25 (10:3000) (15:2500)
        int costoCorriente, costoTotal;
        if( c > 0 ) {
            if( c >= 0 && c < 11 ) {
                costoTotal = c * 3000;
                if( this .saldo > costoTotal ) {
                    this .saldo -= costoTotal;  
                }
            }
            else if( c < 31 ) {
                costoCorriente = c - 10;
                costoTotal = costoCorriente * 2500 + 10 * 3000;
                if( this .saldo > costoTotal ) {
                    this .saldo -= costoTotal;
                }
            }
            else {
                costoCorriente = c - 20;
                costoTotal = costoCorriente * 1500 + 20 * 3000;
                if( this .saldo > costoTotal ) {
                    this .saldo -= costoTotal;
                }
            }
            this .saldoDatos += c;
        }
    }

    public void consumirDatos( int c ) {
        // Verifica que el movil este encendido
        if( ! this .celularApagado ) {
            this .saldoDatos -= c;
        }
    }

    public void llamar( int s ) {
        int valorSegundo = 1;
        int costoCorriente, costoTotal;

        // Verifica que el movil este encendido
        if( ! this .celularApagado ) {

            if( s > 0 && s < 61 ) {
                this .saldo -= s;
            }
            else {
                costoCorriente = s - 60;
                costoTotal = 60 * valorSegundo + costoCorriente * valorSegundo / 2;
                this .saldo -= costoTotal;
            }

        }
    }

    public void recargarSaldo( double s ) {
        this .saldo += s;
    }

    public void gestionarEncendidoCelular() {
        this .celularApagado = ! this .celularApagado;

        // Verifica que datos moviles y modo avion se apaquen cuando el movil este apagado
        if ( this .celularApagado ) {
            this .datosActivados = false;
            this .modoAvionActivado = false;
        }
    }

    public void gestionarModoAvion() {
        // Verifica que el movil este encendido
        if( ! this .celularApagado ) {
            this .modoAvionActivado = ! this .modoAvionActivado;

            // Verifica
            if( ! this .modoAvionActivado ) {
                this .datosActivados = false;
            }
        }
    }

    public void gestionarDatos() {
        // Verifica que el movil este encendido
        //if( this .celularApagado ) {
            this .datosActivados = ! this .datosActivados;
        //}

        // NOTA: En la vida real si el movil no esta encendido no podemos activar o desactivar los datos, he comentado la condicion que verifica que el movil este encendido para cumplir los requisitos del reto
    }

    @Override
    public String toString() {
        return "SimCard [ "
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

        // 1. Generar instancia
        SimCard cliente = new SimCard( "3015328969" );
        System.out.println( "1. " + cliente );

        // 2. Recarga $50000
        cliente .recargarSaldo(50);
        System.out.println( "2. " + cliente );

        // 3. Compra 12GB (Datos)
        cliente .comprarDatos( 12 );
        System.out.println( "3. " + cliente );

        // 4. Intenta usar 3GB del plan de datos
        cliente .consumirDatos( 3 );
        System.out.println( "4. " + cliente );

        // 5. Enciende el movil y llamamos a un amigo (120 segundos)
        cliente .gestionarEncendidoCelular();
        cliente .llamar( 120 );
        System.out.println( "5. " + cliente );

        // 6. Enciende modo avion y datos moviles
        cliente .gestionarModoAvion();
        cliente .gestionarDatos();
        System.out.println( "6. " + cliente );

        // 7. Apaga modo avion y enciende datos moviles
        cliente .gestionarModoAvion();
        cliente .gestionarDatos();
        System.out.println( "7. " + cliente );

        // 8. Consume 3GB de datos
        cliente .consumirDatos( 3 );
        System.out.println( "8. " + cliente );

        // 9. Apaga el movil
        cliente .gestionarEncendidoCelular();
        System.out.println( "9. " + cliente );

    }

}