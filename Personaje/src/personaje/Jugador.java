/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaje;

/**
 *
 * @author ferna
 */
public class Jugador extends Personaje{
    //ATRIBUTOS
    private int numeroBotiquines;
    //CONSTRUCTOR
    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage){
        super(nombre, sexo, posicionX, posicionY, damage);
        this .numeroBotiquines = 0;
    }

    //METODOS
    public void usarBotiquin(){
        if(getNumeroBotiquines() > 0){
            if(getVida() > 0 && getVida() <= 100){
            setNumeroBotiquines(getNumeroBotiquines() - 1);
            setVida(getVida() + 5);
            }
        }
    }
    public void recogerBotiquin(){
        setNumeroBotiquines(getNumeroBotiquines() + 1);
    }
    public void moverDerecha (double d){
        setPosicionX(getPosicionX() + d);
    }
    public void moverIzquierda (double d){
        setPosicionX(getPosicionX() - d);
    }
    public void moverArriba (double d){
        setPosicionY(getPosicionY() + d);
    }
    public void moverAbajo (double d){
        setPosicionY(getPosicionY() - d);
    }
    public void golpear (Enemigo p){
        super.golpear(p);
        p.evolucionar();
    }
    //GETTERS Y SETTERS
    
    public int getNumeroBotiquines(){
        return this .numeroBotiquines;
    }
    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }
 /**
    @Override
    public String toString() {
        return "Jugador [ " 
                + "\n  numeroBotiquines=" + this .numeroBotiquines
            + "\n]";
    }
    * 
    */
}
