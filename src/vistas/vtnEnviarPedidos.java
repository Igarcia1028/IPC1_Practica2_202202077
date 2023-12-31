/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import clases.GestorPedidos;
import clases.GestorVehiculos;
import clases.Pedido;
import clases.Producto;
import clases.Vehiculo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author dg551
 */
public class vtnEnviarPedidos extends javax.swing.JFrame {

    ImageIcon imagenIconIda = new ImageIcon("D:\\USAC\\4to. SEMESTRE\\IPC1\\LABORATORIO IPC1\\GestionDelivery\\src\\vistas\\img\\vehiculoIda.png");
    Image imagenIda = imagenIconIda.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    ImageIcon iconoEscaladoIda = new ImageIcon(imagenIda);
    GestorVehiculos gestorVehiculo = GestorVehiculos.getInstancia();
    GestorPedidos gestorPedidos = GestorPedidos.getInstancia();
    
    public vtnEnviarPedidos() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        M_1.setIcon(iconoEscaladoIda);
        M_2.setIcon(iconoEscaladoIda);
        M_3.setIcon(iconoEscaladoIda);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        M_2 = new javax.swing.JLabel();
        M_1 = new javax.swing.JLabel();
        M_3 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        btnEnviarMoto3 = new javax.swing.JButton();
        btnEnviarMoto1 = new javax.swing.JButton();
        btnEnviarMoto2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDistancia2 = new javax.swing.JLabel();
        lblDistancia1 = new javax.swing.JLabel();
        lblDistancia3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        M_2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        M_1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        M_3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M_3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M_2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M_1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(M_1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(M_2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(M_3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        btnEnviar.setText("Enviar todos");
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMouseClicked(evt);
            }
        });
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnEnviarMoto3.setText("Enviar");
        btnEnviarMoto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMoto3MouseClicked(evt);
            }
        });

        btnEnviarMoto1.setText("Enviar");
        btnEnviarMoto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMoto1MouseClicked(evt);
            }
        });

        btnEnviarMoto2.setText("Enviar");
        btnEnviarMoto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMoto2MouseClicked(evt);
            }
        });

        jLabel1.setText("Motocicleta 1");

        jLabel2.setText("Motocicleta 2");

        jLabel3.setText("Motocicleta 3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEnviarMoto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEnviarMoto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEnviarMoto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDistancia2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDistancia3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDistancia1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(617, 617, 617)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnEnviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDistancia1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviarMoto1)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDistancia2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnEnviarMoto2)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDistancia3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviarMoto3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
        ArrayList<Pedido> lstPedidos = gestorPedidos.getPedidosPendientes();
        M_1.setName("M_1");
        M_2.setName("M_2");
        M_3.setName("M_3");
        
        ArrayList<JLabel> lblVehiculos = new ArrayList<>();
        lblVehiculos.add(M_1);
        lblVehiculos.add(M_2);
        lblVehiculos.add(M_3);
        
        for (Pedido pedido : lstPedidos) {
            if (pedido != null) {
                String codigoVehiculo = pedido.getVehiculo().getCodigo();

                for (JLabel lbl : lblVehiculos) {
                    if (codigoVehiculo.equals(lbl.getName())) {
                        pedido.getVehiculo().setElementos(lbl, this.panel);
                        pedido.getVehiculo().setDistancia(pedido.getDistancia());
                        pedido.getVehiculo().start();
                        pedido.setFechaSalida(new Date());
                        pedido.setEstado(false);
//
//                        // Marca el estado del pedido como false
                        //break; // Salir del bucle interno una vez que se encuentra la etiqueta correspondiente.
                    }
                }
            }
        }
    }//GEN-LAST:event_btnEnviarMouseClicked

    private void btnEnviarMoto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMoto1MouseClicked
        Vehiculo vehiculo = new Vehiculo("Vehículo 1");
        vehiculo.setElementos(M_1, this.panel);
        vehiculo.setDistancia(5.0);
        vehiculo.start();
    }//GEN-LAST:event_btnEnviarMoto1MouseClicked

    private void btnEnviarMoto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMoto2MouseClicked
        Vehiculo vehiculo2 = new Vehiculo("Vehículo 2");
        vehiculo2.setElementos(M_2, this.panel);
        vehiculo2.setDistancia(5.0);
        vehiculo2.start();

    }//GEN-LAST:event_btnEnviarMoto2MouseClicked

    private void btnEnviarMoto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMoto3MouseClicked
        Vehiculo vehiculo3 = new Vehiculo("Vehículo 3");
        vehiculo3.setElementos(M_3, this.panel);
        vehiculo3.setDistancia(5.0);
        vehiculo3.start();
    }//GEN-LAST:event_btnEnviarMoto3MouseClicked

    
    public void llenarDistancias(){
        ArrayList<Pedido> lstPedidos = gestorPedidos.getPedidosPendientes();
        for (Pedido pedido: lstPedidos){
            if (pedido != null) {
                String codigoVehiculo = pedido.getVehiculo().getCodigo();
            }
        }
    } 
            
    public JPanel getPanel(){
        return panel;
    }

    public void enviarPedido(int distancia){
    
    }
    
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
            java.util.logging.Logger.getLogger(vtnEnviarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnEnviarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnEnviarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnEnviarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnEnviarPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel M_1;
    private javax.swing.JLabel M_2;
    private javax.swing.JLabel M_3;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnEnviarMoto1;
    private javax.swing.JButton btnEnviarMoto2;
    private javax.swing.JButton btnEnviarMoto3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblDistancia1;
    private javax.swing.JLabel lblDistancia2;
    private javax.swing.JLabel lblDistancia3;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
