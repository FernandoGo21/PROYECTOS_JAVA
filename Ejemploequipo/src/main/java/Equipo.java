
import java.util.Scanner;

public class Equipo {
    
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
     do{  
        System.out.print("1. Verde");
        System.out.print("2. Blanco");
        System.out.print("3. Rojo");
        System.out.print("4. Axul");
        System.out.print("5. Salir");
        System.out.print("Seleccione un color: ");
        
        if(opcion < 1 || opcion > 4){
            System.out.println("Rango no valido");
        }
        if(opcion == 1 || opcion == 2){
            System.out.println("Es de nacional");
        }else if(opcion == 3 || opcion == 4){
            System.out.println("Es de nacional");
        }
     }while(opcion!=5);
  }
}
