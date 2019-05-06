/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia2;

/**
 *
 * @author Usuario
 */
public class ArbolBinario {

    Nodo raiz;
    int contador = 0;
    
    public ArbolBinario(int r) {
        raiz = new Nodo(r);
        contador ++;
    }

    public boolean existeIzq(Nodo a) {
        boolean f = true;

        if (a.izq == null) {
            f = false;
        }

        return f;
    }

    public boolean existeDer(Nodo a) {
        boolean f = true;

        if (a.der == null) {
            f = false;
        }
        return f;
    }

    public void Add(Nodo n, Nodo raiz) {
        if (raiz.dato <= n.dato) {
            if (!existeDer(raiz)) {
                raiz.der = n;
            } else {
                Add(n, raiz.der);
            }
        }
        else {
            if(!existeIzq(raiz)) {
                raiz.izq = n;
            } else {
                Add(n, raiz.izq);
            }
        }
        contador ++;
    }

    
    public String imprimir(int tipo, Nodo raiz) {
        String a = null;
        
        switch(tipo) {
            case 0:
                 a = preOrden(raiz);
                break;
            case 1:
                a = inOrden(raiz);
                break;
            case 2:
                a = postOrden();
                break;
        }
       
        
        return (a);
        
    }
    
    public String preOrden(Nodo raiz) { //PreOrder
        String cadena = new String();
        System.out.println(raiz.dato + " ");
        cadena = cadena + raiz.dato + " ";
        if(existeIzq(raiz)) {
            cadena = cadena + preOrden(raiz.izq) + " ";
        }
        if(existeDer(raiz)){
            cadena = cadena + preOrden(raiz.der) + " ";
        }
        
        return cadena;
    }
    
    public String inOrden(Nodo raiz) {
        String cadena = new String();
       
        if(existeIzq(raiz)) {   
            cadena = cadena + inOrden(raiz.izq) + " ";  
        }  
        cadena = cadena + raiz.dato + " ";
        if(existeDer(raiz)){
            cadena = cadena + inOrden(raiz.der) + " ";
        }
        return cadena;
    }

    public String postOrden() {
    
    String cadena = new String();
        
     if(existeIzq(raiz)) {   
            cadena = cadena + inOrden(raiz.izq) + " ";  
        }  
        
     if(existeDer(raiz)){
            cadena = cadena + inOrden(raiz.der) + " ";
        } 
     cadena = cadena + raiz.dato + " ";
        return cadena;
    }
    
    public boolean isEmpty() {
        boolean a = false;

        if (raiz == null) {
            a = true;
        }

        return a;
    }

    public int Size() {
        return contador;
    }

    
    public boolean buscar(int x) {
        return (buscar(this.raiz, x));
    }

    
    private boolean buscar(Nodo r, int x) {
        if (r == null) {
            return false;
        }
        int compara = ((Comparable) r.getDato()).compareTo(x);
        if (compara > 0) {
            return (buscar(r.getIzq(), x));
        } else if (compara < 0) {
            return (buscar(r.getDer(), x));
        } else {
            return true;
        }
    }
    
    public int borrar(int x) {
        if (!this.buscar(x)) {
            return 0;
        }

        Nodo z = borrar(this.raiz, x);
        this.setRaiz(z);
        return x;

    }
    
    private Nodo borrar(Nodo r, int x) {
        if (r == null) {
            return null;	
        }
        int compara = ((Comparable) r.getDato()).compareTo(x);
        if (compara > 0) {
            r.setIzq(borrar(r.getIzq(), x));
        } else if (compara < 0) {
            r.setDer(borrar(r.getDer(), x));
        } else {
            System.out.println("Encontro el dato:" + x);
            if (r.getIzq() != null && r.getDer() != null) {
                System.out.println("2 ramas");
            } else {
                r = (r.getIzq() != null) ? r.getIzq() : r.getDer();
                System.out.println("Entro cuando le faltan ramas ");
            }
        }
        return r;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    
}
