/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;

import java.util.ArrayList;
public class Restaurante{
    //ATRIBUTOS
    private ArrayList<Pedido> pedidos;
    private Pedido pedidoseleccionado = null;
    //CONSTRUCTOR
    public Restaurante(){
    this .pedidos = new ArrayList<Pedido>();
    }
    //GETTERS AND SETTTERS
    public ArrayList<Pedido> getPedidos(){
        return this .pedidos;
    }
    public void setPedidos(ArrayList<Pedido> pedidos){
        this .pedidos = pedidos;
    }
    //METODOS
    private void buscar(String nPedido){
        for (Pedido p : this.pedidos){
            if(p.getnPedido().equals(nPedido)){
                this .pedidoseleccionado = p;
            }
        }
    }
    public void agregarPedidoLista(Pedido p){
        this .buscar(p.getnPedido());
        if(this .pedidoseleccionado == null){
           this .pedidos.add(p);
        }
            this.pedidoseleccionado = null;
    }
    public void eliminarPedido(String nPedido){
        for (int i = 0;i<pedidos.size();i++){
          if(pedidos.get(i).getnPedido().equals(nPedido)){
              pedidos.remove(i);
          }
          }
    }
    public double calcularGanancias(){
        double sumaPedidos = 0.0;
        for(Pedido SumaTotalPedidos : this .pedidos){
            sumaPedidos +=SumaTotalPedidos.getCostoPedido();
        }
            return sumaPedidos;
    }
    public double promedioGananciasTotales(){
        double promedio = 0;
        promedio = calcularGanancias()/this .pedidos.size();
        return promedio;
    }
    public double desviacionEstandarGananciasTotales(){
        int tamaño = this .pedidos.size();
        double promedio = promedioGananciasTotales();
        double cuadrado,desviacion = 0.0;
        double sumaCostoUnidadPedidos = 0.0;
        for (int i = 0;i<pedidos.size();i++){
            sumaCostoUnidadPedidos += pedidos.get(i).getCostoPedido();
        }
        cuadrado = Math.pow(sumaCostoUnidadPedidos-promedio,2);
        desviacion = Math.sqrt(cuadrado/this .pedidos.size());
        return desviacion;
    }
    public double retornarCostoPedido(String nPedido){
        double costoPedido = 0.0;
        for (int i = 0;i<pedidos.size();i++){
            if(pedidos.get(i).getnPedido().equals(nPedido)){
             costoPedido = pedidos.get(i).getCostoPedido();
            }
        }
        return costoPedido;
    }
    @Override
    public String toString() {
        return "Restaurante { " + 
               "\n pedidos=" + this .pedidos + "\n}";
    }
    
    public static void main(String[] args)
    {
        
        Restaurante sopasysopitas = new Restaurante();
        System.out.println( sopasysopitas );
        Pedido p1 = new Pedido( "A1", "72023394", 70000.0, 31, 3, 2021 );
        Pedido p2 = new Pedido( "A21", "1037681391", 20000.0, 23, 4, 2020 );
        Pedido p3 = new Pedido( "A32", "33277591", 40000.0, 24, 5, 2020 );
        Pedido p4 = new Pedido( "B1", "1032678245", 40000.0, 7, 1, 2021 );
        sopasysopitas .agregarPedidoLista(p1);
        sopasysopitas .agregarPedidoLista(p2);
        sopasysopitas .agregarPedidoLista(p3);
        sopasysopitas .eliminarPedido("A3456789");
        sopasysopitas .agregarPedidoLista(p4);
        sopasysopitas .eliminarPedido("A21");
        System .out .println( "total ganancias de todos los pedidos: " + sopasysopitas .calcularGanancias() );
        System .out .println( "promedio ganancias totales de todos los pedidos: " + sopasysopitas .promedioGananciasTotales() );
        System .out .println( "desviacion estandar del costo de todos los pedidos: " + sopasysopitas .desviacionEstandarGananciasTotales() );
        System .out .println( "retorno de costo de los pedidos: " + sopasysopitas .retornarCostoPedido("7987825") );
    }
}
