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
public class Enemigo extends Personaje{
    //ATRIBUTOS
    private int evolucionesAplicadas;
    private int resistencia;
    
    //CONSTRUCTOR
    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage){
        super(nombre, sexo, posicionX, posicionY, damage);
        this .evolucionesAplicadas = 0;
        this .resistencia = 1;
    }
    //METODOS
    public void evolucionar(){
        if(getVida() > 0 && getVida() <= 30 && this .evolucionesAplicadas == 0){
            setDamage(getDamage() + 20);
            this .evolucionesAplicadas += 1;
        }
        if(getVida() > 0 && getVida() <= 10 && this .evolucionesAplicadas == 1){
            this .resistencia += 1;
            this .evolucionesAplicadas += 1;
        }
    }
    public void recibirimpacto(double d){
        if(getVida() > 0){
        setVida(getVida() - d/resistencia);
                }
    }
    //GETTERS Y SETTERS
    public int getEvolucionesAplicadas(){
        return this .evolucionesAplicadas;
    }
    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }
    public int getResistencia(){
        return this .resistencia;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
 /**  
    @Override
    public String toString() {
        return "Enemigo [ " 
                + "\n  evolucionesAplicadas=" + this .evolucionesAplicadas
                + "\n  resistencia=" + this .resistencia
            + "\n]";
    }
*/
}
