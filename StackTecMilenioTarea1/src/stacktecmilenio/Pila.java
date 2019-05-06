/*
IMPORTANTE:
Tarea 1:
Instrucciones:
Realiza lo necesario para que esta clase pila funcione completamente con todos sus métodos.
Revisa cada una de las anotaciones y comentarios que tiene en sus propiedades y métodos.
 */

package stacktecmilenio;

/**
 *
 * @author Mike Gárate
 */

public class Pila {
    
    // Clase tipo pública
    // La cual genera un arreglo que funciona como pila
    
    // Propiedades
    
    int arregloEnteros[];    // Arreglo de enteros que funcionará como una pila
    int top;                 // Apuntador superior de la pila que indicará el espacio siguiente vacío
    boolean full;            // Bandera que indicará si la pila se encuentra llena
    boolean empty;           // Bandera que indicará si la pila se encuentra vacía
    int pop;
    int push;
    
    // Constructor de la clase
    
    Pila()
    {
        arregloEnteros = new int[5];    // Inicializa el arreglo con 5 espacios
        top = 0;                          // El próximo espacio a ocupar es el 0
        full = false;                   // La pila se inicia como no llena
        empty = true;                   // La pila se inicia como vacía
        for (int i=0; i<5; i++)         // Se limpia la pila
        {
            arregloEnteros[i] = 0;
        }
    }
    
    // Métodos
    
    public void push(int numero)
    {
        if(full == true)
        {
            System.out.println("Stack overflow");
        }
        else
        {
            arregloEnteros[top] = numero;
            top++;
            if(top > 4)
            {
                full = true;
            }
            else
            {
               full = false;
            }
            System.out.println("el numero se ingreso con exito");
            empty = false;
         }
       // El méotod push
       // Programa a partir de aquí todo lo necesario para ingresar el numero enviado a la pila
        
        
    }
    
    public int pop()
    {
       int numero = 0;
        if (empty == true)
        {
            System.out.println("====  Empty Stack ==== ");
        }
        else
        {
            top--;
            numero = arregloEnteros[top];
            
            if (top < 0)
            {
                empty = true;
            }
            else 
            {
                empty = false;
            }
            System.out.println("el numero salio con exito");
            if (top==0)
            {
                empty = true;
            }
            full = false;
        }
        
        // El método pop
        // Programa a partir de aquí todo lo necesario para eliminar un número de la pila
        
        return numero;
        
    }
    
    public int peek()
    {
       int numero;
        
        // El método peek
        // Programa a partir de aquí todo lo necesario para obtener e informar el número superior de la pila
       if(empty == true)
       {
           numero = 0;
       }
       else {numero = arregloEnteros[top-1];}
         
        return numero;
    }
    
    
    @Override
    public String toString()
    {
        // El método toString
        // Método que ayuda a imprimir la pila de manera amigable
        
        String texto = "El estado de la pila es:\n";
        
        if (empty)
        {
            texto = "====  Empty Stack ==== \n";
        }  
        else
        {
            for (int i=(top-1); i>=0; i--)
            {
                texto = texto + arregloEnteros[i] + "\n";
                texto = texto + "--- \n";
            }
        }
        
        
        return texto;
    }
            
    
    // Se termina la clase pila
    
}
