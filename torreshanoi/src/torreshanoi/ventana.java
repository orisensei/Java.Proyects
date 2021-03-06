/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torreshanoi;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class ventana extends javax.swing.JFrame {

    /**
     * Creates new form ventana
     */
    public ventana() {
        initComponents();
    }
    
  public void Hanoi(int n, int origen,  int auxiliar, int destino)
  {
    if(n==1){
      //  System.out.println("mover disco de " + origen + " a " + destino);
  }
    else{
        Hanoi(n-1, origen, destino, auxiliar);
       
      //  System.out.println("mover disco de "+ origen + " a " + destino);
        Hanoi(n-1, auxiliar, origen, destino);
   }
 }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        hanoi1 = new javax.swing.JTextField();
        hanoi2 = new javax.swing.JTextField();
        hanoi3 = new javax.swing.JTextField();
        hanoi4 = new javax.swing.JTextField();
        hanoi5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        hanoi6 = new javax.swing.JTextField();
        hanoi7 = new javax.swing.JTextField();
        hanoi8 = new javax.swing.JTextField();
        hanoi9 = new javax.swing.JTextField();
        hanoi10 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        hanoi11 = new javax.swing.JTextField();
        hanoi12 = new javax.swing.JTextField();
        hanoi13 = new javax.swing.JTextField();
        hanoi14 = new javax.swing.JTextField();
        hanoi15 = new javax.swing.JTextField();
        inicio = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 240, 240));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("torres de hanoi version infierno");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(166, 11, 360, 30);

        jPanel1.setBackground(new java.awt.Color(20, 240, 240));
        jPanel1.setToolTipText("");

        hanoi1.setBackground(new java.awt.Color(255, 255, 102));
        hanoi1.setText("1");

        hanoi2.setBackground(new java.awt.Color(51, 255, 51));
        hanoi2.setText("2");
        hanoi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanoi2ActionPerformed(evt);
            }
        });

        hanoi3.setBackground(new java.awt.Color(255, 0, 0));
        hanoi3.setText("3");
        hanoi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanoi3ActionPerformed(evt);
            }
        });

        hanoi4.setBackground(new java.awt.Color(153, 0, 153));
        hanoi4.setText("4");

        hanoi5.setBackground(new java.awt.Color(255, 204, 204));
        hanoi5.setText("5");
        hanoi5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanoi5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Adobe Arabic", 0, 18)); // NOI18N
        jLabel2.setText("torre 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(hanoi1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addComponent(hanoi2)
                        .addComponent(hanoi3)
                        .addComponent(hanoi4)
                        .addComponent(hanoi5)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hanoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(hanoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hanoi3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hanoi4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hanoi5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(36, 54, 170, 190);

        jPanel2.setBackground(new java.awt.Color(20, 240, 240));

        jLabel5.setFont(new java.awt.Font("Adobe Arabic", 0, 18)); // NOI18N
        jLabel5.setText("torre 2");

        hanoi8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanoi8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hanoi6, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(hanoi7, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(hanoi8)
                    .addComponent(hanoi9)
                    .addComponent(hanoi10)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hanoi6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hanoi7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hanoi8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hanoi9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hanoi10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(238, 54, 172, 184);

        jPanel3.setBackground(new java.awt.Color(20, 240, 240));

        jLabel3.setFont(new java.awt.Font("Adobe Arabic", 0, 18)); // NOI18N
        jLabel3.setText("torre 3");

        hanoi13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanoi13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hanoi13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hanoi12, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hanoi14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hanoi15, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hanoi11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hanoi11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hanoi12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hanoi13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hanoi14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hanoi15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(441, 54, 161, 184);

        inicio.setFont(new java.awt.Font("Adobe Arabic", 0, 18)); // NOI18N
        inicio.setText("iniciar");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        getContentPane().add(inicio);
        inicio.setBounds(145, 279, 135, 58);

        jButton1.setFont(new java.awt.Font("Adobe Arabic", 0, 18)); // NOI18N
        jButton1.setText("salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(345, 279, 140, 58);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/torreshanoi/assets/Black-and-Blue-3D-4K-Wallpaper-the-alphabet-39220421-3840-2160.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 660, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hanoi5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanoi5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hanoi5ActionPerformed

    private void hanoi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanoi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hanoi2ActionPerformed

    private void hanoi8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanoi8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hanoi8ActionPerformed

    private void hanoi13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanoi13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hanoi13ActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed

/*2C-1C
        31 movimientos de hanoi*/        
            boolean dato = true;
            Hanoi(1, 1, 1, 1);
            hanoi15.setText(hanoi1.getText());
            hanoi15.setBackground(hanoi1.getBackground());
            hanoi1.setText("");
            hanoi1.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 2 a torre 2");
            if(dato == true){
            hanoi10.setText(hanoi2.getText());
            hanoi10.setBackground(hanoi2.getBackground());
            hanoi2.setText("");
            hanoi2.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 1 a torre 2");
            dato = false;
            if(dato == false){
            hanoi9.setText(hanoi15.getText());
            hanoi9.setBackground(hanoi15.getBackground());
            hanoi15.setText("");
            hanoi15.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 3 a torre 3");
            dato = true;
            if(dato == true){
            hanoi15.setText(hanoi3.getText());
            hanoi15.setBackground(hanoi3.getBackground());
            hanoi3.setText("");
            hanoi3.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 1 a torre 1");
            dato = false;
            if(dato==false){
            hanoi3.setText(hanoi9.getText());
            hanoi3.setBackground(hanoi9.getBackground());
            hanoi9.setText("");
            hanoi9.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 2 a torre 3");
            dato = true; 
            if(dato == true){
            hanoi14.setText(hanoi10.getText());
            hanoi14.setBackground(hanoi10.getBackground());
            hanoi10.setText("");
            hanoi10.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 1 a torre 3");
            dato = false;
            if(dato == false){
            hanoi13.setText(hanoi3.getText());
            hanoi13.setBackground(hanoi3.getBackground());
            hanoi3.setText("");
            hanoi3.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 4 a torre 2");
            dato = true; 
            if(dato == true){
            hanoi10.setText(hanoi4.getText());
            hanoi10.setBackground(hanoi4.getBackground());
            hanoi4.setText("");
            hanoi4.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 1 a torre 2");
            dato = false;
            if(dato == false){
            hanoi9.setText(hanoi13.getText());
            hanoi9.setBackground(hanoi13.getBackground());
            hanoi13.setText("");
            hanoi13.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 2 a torre 1");
            dato = true; 
            if(dato == true){
            hanoi4.setText(hanoi14.getText());
            hanoi4.setBackground(hanoi14.getBackground());
            hanoi14.setText("");
            hanoi14.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 1 a torre 1");
            dato = false; 
            if(dato == false){
            hanoi3.setText(hanoi9.getText());
            hanoi3.setBackground(hanoi9.getBackground());
            hanoi9.setText("");
            hanoi9.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 3 a torre 2");
            dato = true; 
            //15 a 9
            if(dato == true){
            hanoi9.setText(hanoi15.getText());
            hanoi9.setBackground(hanoi15.getBackground());
            hanoi15.setText("");
            hanoi15.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 1 a torre 3");
            dato = false; 
            if(dato == false){
             //3 a 15
            hanoi15.setText(hanoi3.getText());
            hanoi15.setBackground(hanoi3.getBackground());
            hanoi3.setText("");
            hanoi3.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 2 a torre 2");
            dato = true; 
            if(dato == true){
             //4 a 9
            hanoi8.setText(hanoi4.getText());
            hanoi8.setBackground(hanoi4.getBackground());
            hanoi4.setText("");
            hanoi4.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 1 a torre 2");
            dato = false;
            if(dato == false){
            // 15 a 7
            hanoi7.setText(hanoi15.getText());
            hanoi7.setBackground(hanoi15.getBackground());
            hanoi15.setText("");
            hanoi15.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 5 a torre 3");
            dato = true;
            if(dato == true){
             // 5 a 15
            hanoi15.setText(hanoi5.getText());
            hanoi15.setBackground(hanoi5.getBackground());
            hanoi5.setText("");
            hanoi5.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 1 a torre 1");
            dato = false;
            if(dato == false){
             // 7 a 5
            hanoi5.setText(hanoi7.getText());
            hanoi5.setBackground(hanoi7.getBackground());
            hanoi7.setText("");
            hanoi7.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 2 a torre 3");
            dato = true;
             if(dato == true){
             // 8 a 14
            hanoi14.setText(hanoi8.getText());
            hanoi14.setBackground(hanoi8.getBackground());
            hanoi8.setText("");
            hanoi8.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 1 a torre 3");
            dato = false;
            if(dato == false){
             // 5 a 13
            hanoi13.setText(hanoi5.getText());
            hanoi13.setBackground(hanoi5.getBackground());
            hanoi5.setText("");
            hanoi5.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 3 a torre 1");
            dato = true;
            // 9 a 5
            if(dato == true){
            hanoi5.setText(hanoi9.getText());
            hanoi5.setBackground(hanoi9.getBackground());
            hanoi9.setText("");
            hanoi9.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 1 a torre 2");
            dato = false;
            // 13 a 9
            if(dato == false){
            hanoi9.setText(hanoi13.getText());
            hanoi9.setBackground(hanoi13.getBackground());
            hanoi13.setText("");
            hanoi13.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 2 a torre 1");
            dato = true;
            // 14 a 4
            if(dato == true){
            hanoi4.setText(hanoi14.getText());
            hanoi4.setBackground(hanoi14.getBackground());
            hanoi14.setText("");
            hanoi14.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 1 a torre 1");
            dato = false;
            // 9 a 3
            if(dato == false){
            hanoi3.setText(hanoi9.getText());
            hanoi3.setBackground(hanoi9.getBackground());
            hanoi9.setText("");
            hanoi9.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 4 a torre 3");
            dato = true;
            // 10 a 14
            if(dato == true){
            hanoi14.setText(hanoi10.getText());
            hanoi14.setBackground(hanoi10.getBackground());
            hanoi10.setText("");
            hanoi10.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 1 a torre 3");
            dato = false;
            // 3 a 13
            if(dato == false){
            hanoi13.setText(hanoi3.getText());
            hanoi13.setBackground(hanoi3.getBackground());
            hanoi3.setText("");
            hanoi3.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 2 a torre 2");
            dato = true;
            // 4 a 10
            if(dato == true){
            hanoi10.setText(hanoi4.getText());
            hanoi10.setBackground(hanoi4.getBackground());
            hanoi4.setText("");
            hanoi4.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 1 a torre 2");
            dato = false;
            // 13 a 9
            if(dato == false){
            hanoi9.setText(hanoi13.getText());
            hanoi9.setBackground(hanoi13.getBackground());
            hanoi13.setText("");
            hanoi13.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 3 a torre 3");
            dato = true;
            // 5 a 13
            if(dato == true){
            hanoi13.setText(hanoi5.getText());
            hanoi13.setBackground(hanoi5.getBackground());
            hanoi5.setText("");
            hanoi5.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 1 a torre 1");
            dato = false;
            // 9 a 5
            if(dato == false){
            hanoi5.setText(hanoi9.getText());
            hanoi5.setBackground(hanoi9.getBackground());
            hanoi9.setText("");
            hanoi9.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 2 a torre 3");
            dato = true;
            // 10 a 12
            if(dato == true){
            hanoi12.setText(hanoi10.getText());
            hanoi12.setBackground(hanoi10.getBackground());
            hanoi10.setText("");
            hanoi10.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "mover disco 1 a torre 3");
            dato = false;
            if(dato == false){
            // 5 a 11
            hanoi11.setText(hanoi5.getText());
            hanoi11.setBackground(hanoi5.getBackground());
            hanoi5.setText("");
            hanoi5.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "fin");
            dato = true;
            if(dato == true){
            System.exit(0);   
         }//31
         }//30
         }//29
         }//28
         }//27
         }//26
         }//25
         }//24
         }//23
         }//22
         }//21
         }//20
         }//19
         }//18
         }//17
         }//16
         }//15
         }//14
         }//13
         }//12
         }//11
         }//10
         }//9
         }//8
         }//7
         }//6
         }//5
         }//4
         }//3        
         }//2
         }//1
    }//GEN-LAST:event_inicioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hanoi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanoi3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hanoi3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hanoi1;
    private javax.swing.JTextField hanoi10;
    private javax.swing.JTextField hanoi11;
    private javax.swing.JTextField hanoi12;
    private javax.swing.JTextField hanoi13;
    private javax.swing.JTextField hanoi14;
    private javax.swing.JTextField hanoi15;
    private javax.swing.JTextField hanoi2;
    private javax.swing.JTextField hanoi3;
    private javax.swing.JTextField hanoi4;
    private javax.swing.JTextField hanoi5;
    private javax.swing.JTextField hanoi6;
    private javax.swing.JTextField hanoi7;
    private javax.swing.JTextField hanoi8;
    private javax.swing.JTextField hanoi9;
    public javax.swing.JButton inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
