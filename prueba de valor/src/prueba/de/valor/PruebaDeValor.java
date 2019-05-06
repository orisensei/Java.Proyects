/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.de.valor;
import java.util.Scanner;
/**
 *
 * @author Hugo
 */
public class PruebaDeValor 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner teclado = new Scanner(System.in);
       double numero = 0;
       double espacio = 12;
       System.out.println("insertar numero a dar");
       numero = teclado.nextDouble();
       
       double resultado = numero % espacio;
       System.out.println( "el numero resultante es: "+ resultado);
       
       System.out.println("insertar numero a dar");
       numero = teclado.nextDouble();
       
       resultado = (numero+1) % espacio;
       System.out.println( "el numero resultante es: "+ resultado);
    }
    
}
