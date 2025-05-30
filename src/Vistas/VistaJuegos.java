package Vistas;

import Controllers.JuegoController;
import Models.Juego;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class VistaJuegos extends javax.swing.JFrame {
    
    private JuegoController juegoController = new JuegoController();
    private int idActual;
    
    public VistaJuegos() {
        initComponents();
    }
    
    public void setIdActual (int idActual){
        this.idActual = idActual;
        actualizarListaJuegos();
        actualizarListaJuegosJugados();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaJuegos = new javax.swing.JList<>();
        agregarJuegoAMiLista = new javax.swing.JButton();
        ButtonEliminarJuego = new javax.swing.JButton();
        EditarCalificacion = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaJuegosJugados = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonAgregarJuego = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textoNuevaCalificacion = new javax.swing.JTextField();
        textoJuegoNuevo = new javax.swing.JTextField();
        textoCalificacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listaJuegos);

        agregarJuegoAMiLista.setText("Agregar Juego a mi lista");
        agregarJuegoAMiLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarJuegoAMiListaActionPerformed(evt);
            }
        });

        ButtonEliminarJuego.setText("EliminarJuego");
        ButtonEliminarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarJuegoActionPerformed(evt);
            }
        });

        EditarCalificacion.setText("Editar Calificacion");
        EditarCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarCalificacionActionPerformed(evt);
            }
        });

        jScrollPane6.setViewportView(listaJuegosJugados);

        jLabel1.setText("Ingrese calificacion para el juego seleccionado.");

        jLabel2.setText("Ingrese la nueva calificacion para el juego seleccionado.");

        jLabel3.setText("Ingrese el nombre del nuevo juego");

        botonAgregarJuego.setText("Agregar juego");
        botonAgregarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarJuegoActionPerformed(evt);
            }
        });

        jLabel4.setText("--------------------------------------------------------------");

        textoNuevaCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNuevaCalificacionActionPerformed(evt);
            }
        });

        textoCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCalificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregarJuegoAMiLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(textoJuegoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonAgregarJuego)))
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonEliminarJuego)
                                .addGap(70, 70, 70)
                                .addComponent(EditarCalificacion)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane6))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(textoNuevaCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(EditarCalificacion)
                                .addComponent(ButtonEliminarJuego))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonAgregarJuego)
                                .addGap(19, 19, 19))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(textoJuegoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarJuegoAMiLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(7, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoNuevaCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarListaJuegos() {
        List<Juego> juegos = this.juegoController.readJuegos(idActual);
        Juego[] arrayJuegos = juegos.toArray(new Juego[0]);
        
        listaJuegos.setListData(arrayJuegos);
        
    }
    
    private void actualizarListaJuegosJugados() {
        
        List<Juego> juegos = this.juegoController.readJuegosJugados(idActual);
        juegos = juegos.stream().sorted((j1, j2) -> j2.getCalificacion() - j1.getCalificacion()).collect(Collectors.toList());
        Juego[] arrayJuegosJugados = juegos.toArray(new Juego[0]);
        
        listaJuegosJugados.setListData(arrayJuegosJugados);
        
    }

    private void ButtonEliminarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarJuegoActionPerformed
        
        try {
            Juego juegoSeleccionado = listaJuegosJugados.getSelectedValue();
            this.juegoController.eliminar(juegoSeleccionado.getId());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "error al elimiar el juego", JOptionPane.ERROR_MESSAGE);
        }
        actualizarListaJuegos();
        actualizarListaJuegosJugados();
    }//GEN-LAST:event_ButtonEliminarJuegoActionPerformed

    private void agregarJuegoAMiListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarJuegoAMiListaActionPerformed
        
        try {
            int califIngresada = Integer.parseInt(textoCalificacion.getText());
            
            Juego juegoSeleccionado = listaJuegos.getSelectedValue();
            if (juegoSeleccionado == null) {
                JOptionPane.showMessageDialog(null, "Se debe seleccionar un juego de la lista", "No se selecciono ningun juego.", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            juegoController.agregarJuegoJugado(idActual, juegoSeleccionado, califIngresada);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Se debe ingresar un Numero para la calificacion", JOptionPane.ERROR_MESSAGE);
        }
        textoCalificacion.setText("");
        actualizarListaJuegosJugados();
        actualizarListaJuegos();

    }//GEN-LAST:event_agregarJuegoAMiListaActionPerformed

    private void botonAgregarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarJuegoActionPerformed
        // TODO add your handling code here:
        String nombre = textoJuegoNuevo.getText();
        
        if (!nombre.equals("")) {
            Juego infoJuego = new Juego(0, nombre, -1);
            
            juegoController.creacion(infoJuego);
        } else {
            JOptionPane.showMessageDialog(null, "Se debe ingresar el nombre de un juego", "Error al tratar de agregar juego", JOptionPane.ERROR_MESSAGE);
        }
        actualizarListaJuegos();
        textoJuegoNuevo.setText("");
    }//GEN-LAST:event_botonAgregarJuegoActionPerformed

    private void textoNuevaCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNuevaCalificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNuevaCalificacionActionPerformed

    private void textoCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCalificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCalificacionActionPerformed

    private void EditarCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarCalificacionActionPerformed
        
        try {
            int califNueva = Integer.parseInt(textoNuevaCalificacion.getText());
            Juego j = listaJuegosJugados.getSelectedValue();
            int id = j.getId();
            this.juegoController.actualizar(idActual, id, califNueva);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "error al actualizar calificacion", JOptionPane.ERROR_MESSAGE);
        }
        actualizarListaJuegosJugados();
        textoNuevaCalificacion.setText("");
    }//GEN-LAST:event_EditarCalificacionActionPerformed
    
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
            java.util.logging.Logger.getLogger(VistaJuegos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaJuegos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaJuegos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaJuegos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaJuegos().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEliminarJuego;
    private javax.swing.JButton EditarCalificacion;
    private javax.swing.JButton agregarJuegoAMiLista;
    private javax.swing.JButton botonAgregarJuego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JList<Juego> listaJuegos;
    private javax.swing.JList<Juego> listaJuegosJugados;
    private javax.swing.JTextField textoCalificacion;
    private javax.swing.JTextField textoJuegoNuevo;
    private javax.swing.JTextField textoNuevaCalificacion;
    // End of variables declaration//GEN-END:variables
}
