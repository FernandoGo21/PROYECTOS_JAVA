/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaje;

public class Personaje{
    //ATRIBUTOS
    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double damage;
    private double vida;
    //CONSTRUCTOR
    public Personaje(String nombre, char sexo, double posicionX, double posicionY, double damage){
        this .nombre = nombre;
        this .sexo = sexo;
        this .posicionX = posicionX;
        this .posicionY = posicionY;
        this .damage = damage;
        this .vida = 100;
    }
    //METODOS
    public void golpear(Personaje p){
        if(p.getVida()>0){
            p.setVida(p.getVida()-this .damage/calcularDistanciaRespectoPersonaje(p));
        }
    }
    public void recibirImpacto(double d){
        setVida(getVida()-d);
    }
    public double calcularDistanciaRespectoPersonaje(Personaje p){
        double x = 0, y = 0, e = 0, d = 0;
        x = p.getPosicionX() - this .posicionX;
        y = p.getPosicionY() - this .posicionY;
        e = Math.pow(x,2) + Math.pow(y,2);
        d = Math.sqrt(e);
        return d;
   }
    //SETTERS Y GETTERS
        public String getNombre(){
            return this .nombre;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public char getSexo(){
            return this .sexo;
        }
        public void setSexo(char sexo) {
            this.sexo = sexo;
        }
        public double getPosicionX(){
            return this .posicionX;
        }
        public void setPosicionX(double posicionX) {
            this.posicionX = posicionX;
        }
         public double getPosicionY(){
            return this .posicionY;
        }
        public void setPosicionY(double posicionY) {
            this.posicionY = posicionY;
        }
         public double getDamage(){
            return this .damage;
        }
        public void setDamage(double damage) {
            this.damage = damage;
        }
    public double getVida(){
       if(this .vida > 100){
        return 100;
        }
        else if(this.vida < 0){
        return 0;
        }
        else{
        return this .vida;
        }
    }
    public void setVida(double vida) {
        this .vida = vida;
        
    }
    @Override
    public String toString() {
        return "Personaje [ " 
                + "\n  nombre=" + this .nombre
                + ",  \n  sexo=" + this .sexo
                + ",  \n  posicionX=" + this .posicionX
                + ",  \n  posicionY=" + this .posicionY
                + ",  \n  damage=" + this .damage
                + ",  \n  vida=" + this .vida
            + "\n]";
    }
     public static void main(String[] args)
  {
    Jugador j = new Jugador( "Exploradora",'f',-1.0,-1.0,130.0);
    Enemigo e = new Enemigo("Bitter",'f',0,0,80);
    System.out.println( "1. " + j );
    System.out.println( "2. " + e );
        j.golpear(e); 
        j.golpear(e); 
        System.out.println( "VPL " + j);
        System.out.println( "VPL  ENEMIGO" + e);
        j.usarBotiquin();
        System.out.println( "VPL " + j);
        j.recogerBotiquin();
        j.recogerBotiquin();
        System.out.println( "VPL " + j);
        j.usarBotiquin();
        System.out.println( "VPL " + j);
        j.moverArriba(2);
        e.golpear(j);
        System.out.println( "VPL " + j);
        System.out.println( "VPL  ENEMIGO" + e);
       
  }
}

