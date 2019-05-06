
package tarea.pkg4;
import java.util.Scanner;

public class Tarea4 
{
static int num;
    
    public static void main(String[] args) 
    {
       Scanner leer = new Scanner(System.in);
       int numero =0;
       
       System.out.println("(1) para el programa que suma por 2");
       System.out.println("(2) para el programa que convierte a binarios");
       numero = leer.nextInt();
       
       switch(numero){
           case 1:
        do{
        System.out.println("ingresa un numero mayor a 10");
        num = leer.nextInt();
        }while(num<=9);
        System.out.println("sumatoria de dos en dos");
        suma(num);
        System.out.println("\n");
        break;
           case 2: 
               do{
               System.out.println("ingresa un numero mayor a 0");
               num = leer.nextInt();
               }while(num<=0);
               System.out.println("conversion a numero binario " );
               Bin(num);
               System.out.println("\n");
               break;
       }
    }

    public static void suma(int n)
    {
        
        if (n == 0) {
           
        }
        else{
           suma(n-1);
            System.out.print((n/2)*2);
            
            
        }
        
        
    }
     public static void Bin(int n) {
        if (n < 2) {
            System.out.print(n);
            
            //return 0;
        } else {
            Bin(n / 2);
            System.out.print(n % 2);
            
           // return 0;
        }
     }
}
