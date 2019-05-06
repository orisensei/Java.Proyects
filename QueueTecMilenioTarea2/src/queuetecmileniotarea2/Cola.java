/*
IMPORTANTE:
Tarea 2:
Instrucciones:
Realiza lo necesario para que esta clase cola funcione de forma circular completamente con todos sus métodos.
Revisa cada una de las anotaciones y comentarios que tiene en sus propiedades y métodos.
 */

package queuetecmileniotarea2;

/**
 *
 * @author Mike
 */
public class Cola {
    
    // Clase tipo pública
    // La cual genera un arreglo de caracteres que funciona como cola
    
    // Propiedades
    
    String arregloLetras[];   // Arreglo de caracteres que funcionará como una cola circular
    int first;              // Apuntador de la parte inicial de la cola.
    int end;                // Apuntador de la parte final de la cola.
    boolean full;           // Bandera que indicará si la cola se encuentra llena
    boolean empty;          // Bandera que indicará si la cola se encuentra vacía
    
    Cola()    // Constructor de la cola
    {
        arregloLetras = new String[5];       // Inicializa el arreglo con cinco espacios
        first=0;                           // Se inicializa el puntero del inicio en la posición 0
        end = 0;                           // Se inicializa el puntero del final en la posición 0
        full = false;                      // La cola no se encuentra llena
        empty = true;                      // La cola no se encuentra vacía
        for (int i=0; i<5; i++)            // Se inicia la cola con espacios vacíos
        {
            arregloLetras[i] = " ";
        }
    }
    
    public void enqueue(String letra)
    {
        // El méotod enqueue
       // Programa a partir de aquí todo lo necesario para ingresar la letra enviada a la cola
     
            arregloLetras[end] = letra;
            end++;
         
            if (end > 4){
               
                end = 0;
            }
             if (end == first){
                full = true;
              // System.out.println("desbordamiento");
                }
                else{
                 full = false;
             }
            empty = true;
    }
    
    public String dequeue()
    {
        
        // El método dequeue
        // Programa a partir de aquí todo lo necesario para eliminar una letra de la cola
        
        String letra = " ";
        
      
        first++;
        letra = arregloLetras[first-1];
        
        if (first > 4){
            first = 0;
        }
       if (first == end)
       {
        empty = true;
       }
       else
       {
       empty = false;
       }
       full = false;
        return letra;
    }
    
    public String first()
    {
        // El método first
        // Programa a partir de aquí todo lo necesario para obtener e informar la letra a salir de la cola
        
        String letra = " ";
        letra = arregloLetras[first];
        
        return letra;
    }
    
    @Override
    public String toString()
            
    {   
        // El método toString
        // Método que ayuda a imprimir la cola de manera amigable
        
        
        String texto = "el siguiente:\n";
        
        if (first<end)
        {
            for (int i=first; i<end; i++)
            {
               texto = texto + arregloLetras[i] + "  |  ";
            }
        
        }
        else
        {
            for (int i=first; i<5; i++)
            {
               texto = texto + arregloLetras[i] + "  |  ";
            }
            for (int i=0; i<end; i++)
            {
               texto = texto + arregloLetras[i] + "  |  ";
            }
        }
        
        texto = texto + "--- \n";
        
        return texto;
    }
    
}
