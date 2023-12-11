/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DEINT.Vistas;

import DEINT.Libreria.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class VentanaDePrestamos extends javax.swing.JPanel {

    /**
     * Creates new form Inicio
     */
    AppBiblioteca miApp = new AppBiblioteca();

    public VentanaDePrestamos() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        Icono = new javax.swing.JLabel();
        NumeroLector = new javax.swing.JLabel();
        LibroPrestar = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        ListaPrestarField = new javax.swing.JTextField();
        NumeroLectorField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 430));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrito-de-compras_1.png"))); // NOI18N

        NumeroLector.setBackground(new java.awt.Color(255, 255, 255));
        NumeroLector.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        NumeroLector.setForeground(new java.awt.Color(0, 0, 0));
        NumeroLector.setText("- Número de lector:");

        LibroPrestar.setBackground(new java.awt.Color(255, 255, 255));
        LibroPrestar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LibroPrestar.setForeground(new java.awt.Color(0, 0, 0));
        LibroPrestar.setText("- Libro a prestar :");

        Aceptar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        ListaPrestarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaPrestarFieldActionPerformed(evt);
            }
        });

        NumeroLectorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroLectorFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Icono))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NumeroLector)
                                .addGap(18, 18, 18)
                                .addComponent(NumeroLectorField))
                            .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LibroPrestar)
                                .addGap(18, 18, 18)
                                .addComponent(ListaPrestarField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Icono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroLector)
                    .addComponent(NumeroLectorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LibroPrestar)
                    .addComponent(ListaPrestarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
        int nLector = Integer.parseInt(NumeroLectorField.getText());
        int nLibro = Integer.parseInt(ListaPrestarField.getText());
        if (miApp.getMiBiblioteca().añadirPrestamo(nLector, nLibro)) {
            JOptionPane.showMessageDialog(jPanel1, "Prestamo Aceptado");
        }else{
            JOptionPane.showMessageDialog(jPanel1, "Prestamo Denegado");
        }
        NumeroLectorField.setText("");
        ListaPrestarField.setText("");
    }//GEN-LAST:event_AceptarActionPerformed

    private void NumeroLectorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroLectorFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_NumeroLectorFieldActionPerformed

    private void ListaPrestarFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaPrestarFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ListaPrestarFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel LibroPrestar;
    private javax.swing.JTextField ListaPrestarField;
    private javax.swing.JLabel NumeroLector;
    private javax.swing.JTextField NumeroLectorField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
