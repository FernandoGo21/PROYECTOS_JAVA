package dbtienda;

import java.sql.*;

public class Dbtienda {
    public static void main(String[] args) {
        try{
            
            Connection conexion; 
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/tienda";
            String user = "root";
            String password = "Marelvy2021.";
            conexion = DriverManager.getConnection(url,user,password);
            
            String sentencia = "SELECT * FROM productos";
            Statement consulta = conexion.createStatement();
            ResultSet resultados = consulta.executeQuery(sentencia);
            
            System.out.println("Listado de productos");
            
            System.out.printf("%-20s %-20s %-20s %s %n","Codigo de barras",
                    "Producto","Precio","Stock");
            mostrarProductos(resultados);
            conexion.close();
            consulta.close();
        }
        
        catch(ClassNotFoundException e){
            System.out.println("No fue posible cargar el driver.");
        }
        
        catch(SQLException e){
            System.out.println("Hubo un error al acceder a la base de datos: "+ e.getMessage());
        }
        
    }
    //TRAER LOS VENDEDORES DE LA DB "Tienda
    //TRAER LOS PRODUCTOS DE LA BASE DE DATOS "Tienda"
    public static void mostrarProductos(ResultSet resultados) throws SQLException{
            int cod_barra,precio,stock;
            String producto;
            while(resultados.next() ){
                cod_barra = resultados.getInt("Cod_Barra_Prod");
                producto = resultados.getString("producto");
                precio = resultados.getInt("precio");
                stock = resultados.getInt("stock");
                
                System.out.printf("%-20d %-20s %-20d %d %n", cod_barra,producto,precio,stock);
            }
    }
}
