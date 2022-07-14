/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variantereto4;
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
        this .pedidos.add(p);
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
        int tamaño = this .pedidos.size();
            for(int i = 0; i < tamaño;i++){
            sumaPedidos = sumaPedidos + this .pedidos.get(i).getCostoPedido();
            }
            return sumaPedidos;
    }
    public double promedioGananciasTotales(){
        double prom = 0;
        int tamaño = this .pedidos.size();
        prom = calcularGanancias()/tamaño;
        return prom;
    }
    public double desviacionEstandarGananciasTotales(){
        double total = 0,desviacion;
        for(Pedido Desv : this .pedidos){
        total += Math.pow(Desv.getCostoPedido()-this.promedioGananciasTotales(),2);
       }
        desviacion = Math.sqrt((1/(double)this.pedidos.size())*total);
        return desviacion;
    }
    public double retornarCostoPedido(String ID){
        double costoPedido = 0.0;
        int tamaño = this .pedidos.size();
        for(int i = 0;i < tamaño;i++){
            if(this .pedidos.get(i).getCostoPedido()==costoPedido){
                costoPedido += this .pedidos.get(i).getCostoPedido();
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
        
        Pedido pedido1 = new Pedido( "3492", "7987823", 340, 26, 7, 2021 );
        Pedido pedido2 = new Pedido( "3493", "7987824", 210, 26, 8, 2021 );
        Pedido pedido3 = new Pedido( "3494", "7987824", 40, 26, 9, 2021 );
        Pedido pedido4 = new Pedido( "3494", "7987821", 25, 20, 5, 2000);
        sopasysopitas .agregarPedidoLista(pedido1);
        sopasysopitas .agregarPedidoLista( pedido2 );
        sopasysopitas .agregarPedidoLista( pedido3 );
        sopasysopitas .agregarPedidoLista( pedido4 );
        System.out.println( sopasysopitas );
        sopasysopitas .eliminarPedido( "3494" );
        System.out.println( sopasysopitas );
        System .out .println( "total ganancias de todos los pedidos: " + sopasysopitas .calcularGanancias() );
        System .out .println( "promedio ganancias totales de todos los pedidos: " + sopasysopitas .promedioGananciasTotales() );
        System .out .println( "desviacion estandar del costo de todos los pedidos: " + sopasysopitas .desviacionEstandarGananciasTotales() );
        System .out .println( "retorno de costo de los pedidos: " + sopasysopitas .retornarCostoPedido("7987823") );
    }

}
