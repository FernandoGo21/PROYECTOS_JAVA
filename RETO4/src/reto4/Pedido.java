/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;
public class Pedido {
    //ATRIBUTOS
    private String nPedido;
    private String IDCliente;
    private double costoPedido;
    private int diaPedido ;
    private int mesPedido;
    private int yearPedido;
    //CONSTRUCTOR
    public Pedido(String nPedido, String IDCliente, double costoPedido, int diaPedido, int mesPedido, int yearPedido){
    this .nPedido = nPedido;
    this .IDCliente = IDCliente;
    this .costoPedido = costoPedido;
    this .diaPedido = diaPedido;
    this .mesPedido = mesPedido;
    this .yearPedido = yearPedido;
    }
    //GETTERS AND SETTERS
        public String getnPedido(){
            return this .nPedido;
        }
        public void setnPedido(String nPedido){
            this.nPedido = nPedido;
        }
        public String getIDCliente(){
            return this .IDCliente;
        }
        public void setIDCliente(String IDCliente){
            this.IDCliente = IDCliente;
        }
        public double getCostoPedido(){
            return this .costoPedido;
        }
        public void setCostoPedido(double costoPedido) {
            this.costoPedido = costoPedido;
        }
        public int getDiaPedido(){
            return this.diaPedido;
        }
        public void setDiaPedido(int diaPedido) {
            this.diaPedido = diaPedido;
        }
        public int getMesPedido(){
            return this .mesPedido;
        }
        public void setMesPedido(int mesPedido) {
            this.mesPedido = mesPedido;
        }
        public int getYearPedido(){
            return this .yearPedido;
        }
        public void setYearPedido(int yearPedido) {
            this.yearPedido = yearPedido;
        }
        @Override
    public String toString() {
        return
            "\n    { " +
            "IDCliente: " + this .IDCliente +
            ", costoPedido: " + this .costoPedido +
            ", diaPedido: " + this .diaPedido +
            ", mesPedido: " + this .mesPedido +
            ", nPedido: " + this .nPedido +
            ", yearPedido: " + this .yearPedido +
            " }";
    }
}
