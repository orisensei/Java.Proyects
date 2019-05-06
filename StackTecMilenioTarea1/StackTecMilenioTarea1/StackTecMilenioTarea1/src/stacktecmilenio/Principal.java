/*
IMPORTANTE:
Tarea 1:
Instrucciones:
Programa principal que ofrece un menú y que creará un objeto de tipo pila
En este programa no es necesario cambiar algo.
Dónde debes de programar es en la clase Pila
 */

package stacktecmilenio;

import java.util.Scanner;

/**
 *
 * @author Mike Gárate
 */

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.println("_____________________________________________________");
        System.out.println("\t== Programa para manejar Stacks ==");
        System.out.println("_____________________________________________________");
                
        int opcion;
        int n;
        Scanner teclado = new Scanner(System.in);
        
        Pila miPila = new Pila();     // Crea el objeto miPila de la clase Pila para ejecutar sus 
                                      // acciones.
        
        
        do{
            System.out.println("Elige lo que deseas hacer con tu pila");
            System.out.println(" 1 - Imprimir.");
            System.out.println(" 2 - Ingresar un número");
            System.out.println(" 3 - Sacar un número");
            System.out.println(" 4 - Ver el número que se encuentra en la cima");
            System.out.println(" 0 - Salir de este programa");
            System.out.println(" Opcion ---> ");
            opcion = teclado.nextInt();
            
            switch (opcion)
            {
                case 0: 
                    System.out.println("_____________________________________________________");
                    System.out.println("                Fin del Programa");
                    System.out.println("_____________________________________________________");
                        break;
                    
                case 1: System.out.println(miPila.toString()); 
                        break;
                    
                case 2: System.out.println("Dame el número a ingresar en la pila: \n");
                        n = teclado.nextInt();
                        miPila.push(n);
                        break;
                    
                case 3: n = miPila.pop();
                if(n !=0){
                        System.out.println("El número eliminado es:"+n+"\n");
                }
                else{}
                        break;
                    
                 case 4:n = miPila.peek();
                 if(n != 0){
                        System.out.println("El número que se encuentra en la parte superior es:"+n+"\n");
                 }
                 else{System.out.println("\n======Error, no se encuentra ningun numero en la pila======\n");}
                        break;    
                     
                default : System.out.println("Solo poner una opción entre el 0 y el 4");
                          break;
            }
            
        } while(opcion!=0);
        
    }
    
}
