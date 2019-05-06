/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;
import java.awt.event.MouseAdapter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Random;
import java.awt.event.MouseEvent;
 
public class Juego {
    JFrame dato;
    JLabel arreglo1[][];
    int arreglo2[][];
    Random azar = new Random();
    
    public Juego(){
        
        dato = new JFrame("juego java evidencia 3");
	dato.setBounds(0,0,518,540);
        dato.setLayout(null);
        dato.setTitle("juego java evidencia 3");
	dato.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        arreglo1 = new JLabel[10][10];
        arreglo2 = new int [10][10];
        
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1.length; j++) {
                arreglo1[i][j] = new JLabel();
                arreglo1[i][j].setBounds(0+i*50,0+j*50,50,50);
                arreglo2[i][j] = azar.nextInt(4)+1;
                arreglo1[i][j].setIcon(new ImageIcon("imagenes/"+arreglo2[i][j]+".jpg"));
                arreglo1[i][j].setVisible(true);
                dato.add(arreglo1[i][j]);
            }
            
        }
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1.length; j++) {
                
                arreglo1[i][j].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent ev){
                    for (int k = 0; k < arreglo1.length; k++) {
                        for (int l = 0; l < arreglo1.length; l++) {
                            if(arreglo1[k][l] == ev.getSource()){
                                System.out.println("resultado: "+k+", "+l);
                                recursivo(k,l, arreglo2[k][l]);
                            }
                            
                        }
                        
                    }
                    // ordenamiento burbuja
                    for (int k = 0; k < arreglo1.length; k++) {
                        for (int l = 0; l < arreglo1.length; l++) {
                            for (int m = 0; m < arreglo1.length; m++) {
                                if(m > 0 && arreglo2[l][m] == -2){
                                    arreglo2[l][m] = arreglo2[l][m-1];
                                    arreglo2[l][m-1] = -2;
                                }
                                arreglo1[l][m].setIcon(new ImageIcon("imagenes/"+arreglo2[l][m]+".jpg"));
                            }
                            
                        }
                        
                    }
                
                }});
                
            }
            
        }
        
        
        dato.setVisible(true);
        
    }
    // metodo de recursividad
    public void recursivo(int px,int py, int color){
        
        
        if(color != -1)
        arreglo2[px][py] = -1;
        if (color == -1)
        arreglo2[px][py] = -2;   
        arreglo1[px][py].setIcon(new ImageIcon("imagenes/"+arreglo2[px][py]+".jpg"));
        
        if(px < 9 && arreglo2[px+1][py] == color)
        recursivo(px+1, py, color);
        if(px > 0 && arreglo2[px-1][py]== color)
        recursivo(px-1, py, color);
        if(py < 9 && arreglo2[px][py+1] == color)
        recursivo(px, py+1, color);
        if(py > 0 && arreglo2[px][py-1]== color)
        recursivo(px, py-1, color);
    }
    public static void main(String[] args) {
        Juego obj = new Juego();
        
        
    }
    
}
