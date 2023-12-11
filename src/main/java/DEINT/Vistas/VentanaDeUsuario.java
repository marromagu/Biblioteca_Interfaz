/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DEINT.Vistas;

import DEINT.Funcionamiento.*;
import DEINT.Libreria.AppBiblioteca;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mario
 */
public class VentanaDeUsuario extends javax.swing.JPanel {

    /**
     * Creates new form Usuario
     */
     AppBiblioteca miApp = new AppBiblioteca();

    public VentanaDeUsuario() {
        initComponents();
        mostrarUsuariosEnTextArea();
    }

    private void mostrarUsuariosEnTextArea() {
        usuariosLista.setText(""); // Limpiar el contenido actual
        HashMap<Integer, Usuario> usuariosHashMap = miApp.getMiBiblioteca().getUsuariosHashMap();
        for (Map.Entry<Integer, Usuario> entry
                : usuariosHashMap.entrySet()) {
            Usuario usuario = entry.getValue();

            usuariosLista.append("Número de Lector: " + usuario.getnLector() + "\n"
                    + "Nombre: " + usuario.getNombre() + "\n"
                    + "Prestamos: " + usuario.getPrestamos().toString() + "\n"
                    + "Estado: " + (usuario.isEstado() ? "No Sancionado" : "Sancionado") + "\n\n");
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

        jPanel1 = new javax.swing.JPanel();
        Icono = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usuariosLista = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 430));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/de-miedo_1.png"))); // NOI18N

        usuariosLista.setColumns(20);
        usuariosLista.setRows(5);
        jScrollPane1.setViewportView(usuariosLista);

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Icono)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea usuariosLista;
    // End of variables declaration//GEN-END:variables

}
