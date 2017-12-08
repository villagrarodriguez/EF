/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gvillena;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class pago extends javax.swing.JFrame {

    /**
     * Creates new form pago
     */
    public pago() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Pagos Onlain");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNombre = new javax.swing.JLabel();
        lbNumeroTarjeta = new javax.swing.JLabel();
        lbCodigoSeguridad = new javax.swing.JLabel();
        lbCaducidad = new javax.swing.JLabel();
        etMes = new javax.swing.JTextField();
        etNombreTitular = new javax.swing.JTextField();
        etNumeroTarjeta = new javax.swing.JTextField();
        etCodigoSeguridad = new javax.swing.JTextField();
        etDia = new javax.swing.JTextField();
        lbPagoConTarjeta = new javax.swing.JLabel();
        lbAceptamos = new javax.swing.JLabel();
        spCiudad = new javax.swing.JSpinner();
        lbCiudad = new javax.swing.JLabel();
        lbImagenVisa = new javax.swing.JLabel();
        lbMensajeConfirmar = new javax.swing.JLabel();
        jbtnvolver = new javax.swing.JButton();
        btnOtrometodopag1 = new javax.swing.JToggleButton();
        tipostj = new javax.swing.JLabel();
        jlblimagt = new javax.swing.JLabel();
        jtiptarjet = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbNombre.setText("Nombre del Titular");

        lbNumeroTarjeta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbNumeroTarjeta.setText("Numero de Tarjeta");

        lbCodigoSeguridad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbCodigoSeguridad.setText("CVV (Código de seguridad)");

        lbCaducidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbCaducidad.setText("Fecha de Caducidad");

        lbPagoConTarjeta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbPagoConTarjeta.setForeground(new java.awt.Color(51, 0, 255));
        lbPagoConTarjeta.setText("Pago con Tarjeta");

        lbAceptamos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbAceptamos.setForeground(new java.awt.Color(51, 51, 0));
        lbAceptamos.setText("Aceptamos:");

        lbCiudad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbCiudad.setText("Seleccione Ciudad");

        lbMensajeConfirmar.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 10)); // NOI18N
        lbMensajeConfirmar.setForeground(new java.awt.Color(255, 0, 51));
        lbMensajeConfirmar.setText("Confirm your order of 32,66 $ by clicking the button \"Confirm my order\"");

        jbtnvolver.setText("Volver");
        jbtnvolver.setBorder(null);
        jbtnvolver.setBorderPainted(false);
        jbtnvolver.setContentAreaFilled(false);
        jbtnvolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnvolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnvolver.setIconTextGap(-3);
        jbtnvolver.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnvolver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnvolverActionPerformed(evt);
            }
        });

        btnOtrometodopag1.setText("Comprar");
        btnOtrometodopag1.setBorder(null);
        btnOtrometodopag1.setBorderPainted(false);
        btnOtrometodopag1.setContentAreaFilled(false);
        btnOtrometodopag1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOtrometodopag1.setDoubleBuffered(true);
        btnOtrometodopag1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOtrometodopag1.setIconTextGap(-3);
        btnOtrometodopag1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnOtrometodopag1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOtrometodopag1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtrometodopag1ActionPerformed(evt);
            }
        });

        tipostj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Untitled2.jpg"))); // NOI18N

        jlblimagt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Scousha.jpg"))); // NOI18N

        jtiptarjet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtiptarjet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otros Metodos de Pago", "Visa", "Master Card", "Interbank", "BCP" }));
        jtiptarjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtiptarjetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbPagoConTarjeta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAceptamos)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(tipostj, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbNombre)
                            .addComponent(lbNumeroTarjeta)
                            .addComponent(lbCodigoSeguridad)
                            .addComponent(lbCaducidad)
                            .addComponent(lbCiudad))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etNombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etCodigoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etMes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(etDia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(spCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(lbImagenVisa))
                            .addComponent(jlblimagt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jtiptarjet, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lbMensajeConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jbtnvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOtrometodopag1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lbPagoConTarjeta)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbAceptamos)
                        .addGap(16, 16, 16)
                        .addComponent(tipostj)
                        .addGap(11, 11, 11)
                        .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbCodigoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(etNombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(etNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(etCodigoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(spCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbImagenVisa, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jlblimagt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jtiptarjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(lbMensajeConfirmar)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOtrometodopag1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOtrometodopag1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtrometodopag1ActionPerformed
        JOptionPane.showMessageDialog(null, "Gracias Por Comprar");
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnOtrometodopag1ActionPerformed

    private void jbtnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnvolverActionPerformed
        Tiendita obj=new Tiendita();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnvolverActionPerformed

    private void jtiptarjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtiptarjetActionPerformed
            int item=jtiptarjet.getSelectedIndex();
            
            switch (item){
                case 1:
                    ImageIcon imagen= new ImageIcon(this.getClass().getResource("/img/Untitled3_1.jpg"));
                    jlblimagt.setIcon(imagen);
                    
                    break;
                    
                case 2:
                    ImageIcon imagen1= new ImageIcon(this.getClass().getResource("/img/MC.jpg"));
                    jlblimagt.setIcon(imagen1);
                    
                    break;
                case 3:
                    ImageIcon imagen2= new ImageIcon(this.getClass().getResource("/img/IBK.jpg"));
                    jlblimagt.setIcon(imagen2);
                    
                    break;
                case 4:
                    ImageIcon imagen3= new ImageIcon(this.getClass().getResource("/img/bcp.jpg"));
                    jlblimagt.setIcon(imagen3);
                    
                    break;    
            }
// TODO add your handling code here:
    }//GEN-LAST:event_jtiptarjetActionPerformed

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
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnOtrometodopag1;
    private javax.swing.JTextField etCodigoSeguridad;
    private javax.swing.JTextField etDia;
    private javax.swing.JTextField etMes;
    private javax.swing.JTextField etNombreTitular;
    private javax.swing.JTextField etNumeroTarjeta;
    private javax.swing.JButton jbtnvolver;
    private javax.swing.JLabel jlblimagt;
    private javax.swing.JComboBox<String> jtiptarjet;
    private javax.swing.JLabel lbAceptamos;
    private javax.swing.JLabel lbCaducidad;
    private javax.swing.JLabel lbCiudad;
    private javax.swing.JLabel lbCodigoSeguridad;
    private javax.swing.JLabel lbImagenVisa;
    private javax.swing.JLabel lbMensajeConfirmar;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNumeroTarjeta;
    private javax.swing.JLabel lbPagoConTarjeta;
    private javax.swing.JSpinner spCiudad;
    private javax.swing.JLabel tipostj;
    // End of variables declaration//GEN-END:variables
}
