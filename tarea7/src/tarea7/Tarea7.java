
package tarea7;
import java.util.Scanner;
/**
 *
 * @author Hugo
 */
public class Tarea7 
{

    
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        metodos n = new metodos();
        int numero;
        int opcion;
        String palabra;
        
        do { 
        System.out.println("_______________________________________________ ");
        System.out.println("                  Tarea 7");
        System.out.println("_______________________________________________ ");
        System.out.println("(1) para el programa 1 ");
        System.out.println("(2) para el programa 2 ");
        System.out.println("(0) para salir ");
 
        opcion = leer.nextInt();
          
        switch(opcion){
            case 1:
        
        do{
        System.out.println("ingresa una cantidad arriba de 20 ");
        numero = leer.nextInt();
        if (numero <=20){System.out.println("ingrese un numero mayor");}
        }while(numero <=20);
        
        if(numero >= 20){
            if(numero % 2 == 0){
                n.par(numero);
            }
            else if(numero % 2 == 1){
                n.inpar(numero);
            }
            else{
                n.inpar(numero);
            }
            
        }
        break;
         case 2: 
             System.out.println("ingresa una palabra");
             palabra = leer.next();
             
             
             System.out.println("numero de vocales "+ n.cuentaconsonantes(palabra));
             System.out.println("numero de consonantes "+ n.cuentavocales(palabra));
             
             break;
             default: 
                System.out.println("adios "); 
                 break;
        } 
        
        
     } while (opcion != 0);   
    }
    
}
