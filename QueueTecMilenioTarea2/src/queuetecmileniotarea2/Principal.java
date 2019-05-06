/*
IMPORTANTE:
Tarea 2:
Instrucciones:
Programa principal que ofrece un menú y que creará un objeto de tipo cola
En este programa no es necesario cambiar algo.
Dónde debes de programar es en la clase Cola
 */

package queuetecmileniotarea2;

import java.util.Scanner;


/**
 *
 * @author Mike
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("== Programa para manejar Colas Circulares ==");
                
        int opcion;
        String letra;
        Cola miCola = new Cola();
        Scanner teclado = new Scanner(System.in);
        paneles ventana = new paneles();
        ventana.setTitle("hospital");
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        
        do{
            System.out.println("Elige lo que deseas hacer con la cola circular");
            System.out.println(" 1 - Imprimir.");
            System.out.println(" 2 - Ingresar una letra");
            System.out.println(" 3 - Sacar una letra");
            System.out.println(" 4 - Ver la letra que se encuentra por salir");
            System.out.println(" 0 - Salir de este programa");
            System.out.println(" Opcion ---> ");
            opcion = teclado.nextInt();
            
            switch (opcion)
            {
                case 0: System.out.println("Adios.\n\n"); 
                        break;
                    
                case 1: 
                        System.out.println(miCola.toString()); 
                        break;
                    
                case 2: 
                  if (miCola.full == false){
                        System.out.println("Dame la letra a ingresar en la pila: \n");
                        letra = teclado.next().substring(0);
                        miCola.enqueue(letra);
                  }
                  else{
                       
                      System.out.println("desbordamiento");
                 }
                
                        break;
                    
                case 3: letra = miCola.dequeue();
               if(miCola.empty == true)
               {
                   System.out.println("La letra eliminada es:"+letra+"\n");
               }
               else
               {
                   System.out.println("vacio");
               }
                        break;
                    
                case 4:letra = miCola.first();
                
                
                if(miCola.first != miCola.end)
                {
                    System.out.println("La letra que se encuentra por salir es:"+letra+"\n");
                }
                else{ System.out.println("no hay numero");}
                        break;    
                     
                default : System.out.println("Solo poner una opción entre el 0 y el 4");
                          break;
            }
            
        } while(opcion!=0);
    }
    
}
