/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actfintro;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Hugo
 */
public class Actfintro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        int ventanas;
        String [] materia = new String[3];
        String [] actividades = new String[15];
        int [] ponderacion = new int[15];
       
    
         do{
        System.out.println("_________________________________________________");
        System.out.println("       Base de datos de calificaciones           ");
        System.out.println("_________________________________________________");
        System.out.println("ingresa 0 para ingresar el nombre de la materia");
        System.out.println("ingresa 1 para agregar las actividades y su ponderacion");
        System.out.println("ingresa 2 para agregar a los alumnos y su matricula");
        System.out.println("ingresa 3 para imprimir los datos");
        System.out.println("ingresa cualquier numero arriba de 4 para salir de la aplicacion");
        ventanas = leer.nextInt();
        
        switch(ventanas){
            
            case 0: 
                for(int i = 0;i < 3;i++){
			//Creamos una persona
			System.out.println("escribe el nombre de la materia numero: "+i);
                        materia[i] = leer.next();
		}
                break;
            case 1: 
                   for(int i = 0;i < 3;i++){
			//Creamos una persona
			System.out.println("escribe el nombre de la actividad numero: "+i);
                        actividades[i] = leer.next();
                        System.out.println("escribe la ponderacion de la actividad: "+i);
                        ponderacion[i] = leer.nextInt();
		}
                break;
            case 2: break;
            case 3: 
                for(int j = 0;j < 15;j++){//ahora imprimiremos las personas de nuestro ArrayList
			System.out.println("============================================================");
			System.out.println(""+j);
			System.out.println("materia: "+ materia[j] );
                        System.out.println("actividad: "+ actividades[j] + " ponderacion: " + ponderacion[j] );
                       
			System.out.println("============================================================");
		}
                break;
            
            default:
                System.out.println("_________________________________________________");
                System.out.println("               fin de Programa                   ");
                System.out.println("_________________________________________________");
                System.exit(0);
            
        }
        
      }while(ventanas != 4);   
       
    }
    
}
