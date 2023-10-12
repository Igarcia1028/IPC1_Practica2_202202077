/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import clases.GestorCampos;
import clases.GestorPedidos;
import clases.GestorProductos;
import clases.GestorVehiculos;
import clases.Producto;
import clases.Vehiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dg551
 */
public class vtnOrdenar extends javax.swing.JFrame {

    /**
     * Creates new form vtnOrdenar
     */
    
    DefaultTableModel modelProductos;
    GestorProductos gestorProd = GestorProductos.getInstancia();
    GestorVehiculos gestorVehiculo = GestorVehiculos.getInstancia();
    GestorCampos gestorCampos = new GestorCampos();
    GestorPedidos gestorPedido = GestorPedidos.getInstancia();
    
    public vtnOrdenar() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ListarProductos(gestorProd.getProductos());
        llenarComboVehiculos();
    }
    
    public void ListarProductos(ArrayList<Producto> lstProductos){
        modelProductos = (DefaultTableModel)tblProductos.getModel();
        modelProductos.setNumRows(0);
        for (int i = 0; i < lstProductos.size(); i++) {
            Object[] row = new Object[3];
            row[0] = lstProductos.get(i).getCodigo();
            row[1] = lstProductos.get(i).getNombre();
            row[2] = "Q" + lstProductos.get(i).getPrecio();
            modelProductos.addRow(row);
        }
        tblProductos.setModel(modelProductos);
    }
    
    public void ActualizarTotal(){
        DefaultTableModel modelProductosPedido = (DefaultTableModel)tblProductosPedido.getModel();
        Double total = 0.0;
        
        for (int i = 0; i < modelProductosPedido.getRowCount(); i++) {
            String precio = (String) modelProductosPedido.getValueAt(i, 2);
            Double precioD = Double.parseDouble(precio.replace("Q", ""));

            // Sumar el valor al total
            total += precioD;
        }
        lblTotal.setText("Total: Q." + String.valueOf(total));
    }
    
    public void llenarComboVehiculos(){
        ArrayList<Vehiculo> lstVehiculos = gestorVehiculo.getInstancia().getVehiculosDisponibles();
        
        // Limpiar el comboBox
        cmbVehiculo.removeAllItems();

        cmbVehiculo.addItem("Seleccione un vehiculo");
        // Agregar los profesores
        for (Vehiculo vehiculo : lstVehiculos) {
            cmbVehiculo.addItem(vehiculo.getCodigo() + "-" + vehiculo.getNombre());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductosPedido = new javax.swing.JTable();
        lblPedido = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblProductos = new javax.swing.JLabel();
        btnFlechaQuitar = new javax.swing.JLabel();
        btnFlechaAgregar = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblVehiculo = new javax.swing.JLabel();
        cmbVehiculo = new javax.swing.JComboBox<>();
        lblTitulo = new javax.swing.JLabel();
        lblDistancia = new javax.swing.JLabel();
        txtDistancia = new javax.swing.JTextField();
        btnConfirmarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblProductosPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio"
            }
        ));
        tblProductosPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosPedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductosPedido);

        lblPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPedido.setText("Pedido");

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio"
            }
        ));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProductos);

        lblProductos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductos.setText("Productos");

        btnFlechaQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/img/flechaQuitar.png"))); // NOI18N
        btnFlechaQuitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFlechaQuitarMouseClicked(evt);
            }
        });

        btnFlechaAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/img/flechaAgregar.png"))); // NOI18N
        btnFlechaAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFlechaAgregarMouseClicked(evt);
            }
        });

        lblTotal.setText("Total:  0.0");

        lblVehiculo.setText("Vehículo:");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("REALIZAR PEDIDO");

        lblDistancia.setText("Distancia a recorrer (Km):");

        txtDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistanciaActionPerformed(evt);
            }
        });

        btnConfirmarPedido.setText("Confirmar Pedido");
        btnConfirmarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarPedidoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                        .addGap(84, 84, 84)
                        .addComponent(lblPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnFlechaAgregar)
                                            .addComponent(btnFlechaQuitar, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(btnConfirmarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))))
                        .addGap(14, 14, 14)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnFlechaAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnFlechaQuitar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblProductosPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosPedidoMouseClicked
//        modelProductos = (DefaultTableModel)tblProductos.getModel();
//        int selectedRow = tblProductos.getSelectedRow();
//        String nombre = modelProductos.getValueAt(selectedRow, 1).toString();
//        String precio = modelProductos.getValueAt(selectedRow, 2).toString();
//
//        txtNombre.setText(nombre);
//        txtPrecio.setText(precio.replaceAll("Q", ""));
    }//GEN-LAST:event_tblProductosPedidoMouseClicked

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProductosMouseClicked

    private void txtDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistanciaActionPerformed

    private void btnFlechaAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFlechaAgregarMouseClicked
        int selectedRow = tblProductos.getSelectedRow();
        
        if (selectedRow >= 0) {
            modelProductos = (DefaultTableModel)tblProductos.getModel();
            Object[] row = new Object[3];
            row[0] = modelProductos.getValueAt(selectedRow, 0).toString();
            row[1] = modelProductos.getValueAt(selectedRow, 1).toString();
            row[2] = modelProductos.getValueAt(selectedRow, 2).toString();
            ((DefaultTableModel) tblProductosPedido.getModel()).addRow(row);
            ActualizarTotal();
        } else {
            Mensaje("Seleccione un producto para agregarlo");
        }
    }//GEN-LAST:event_btnFlechaAgregarMouseClicked

    private void btnFlechaQuitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFlechaQuitarMouseClicked
        int selectedRow = tblProductosPedido.getSelectedRow();
        
        if (selectedRow >= 0) {
            ((DefaultTableModel) tblProductosPedido.getModel()).removeRow(selectedRow);
            ActualizarTotal();
        } else {
            Mensaje("Seleccione un producto para quitarlo");
        }
    }//GEN-LAST:event_btnFlechaQuitarMouseClicked

    private void btnConfirmarPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarPedidoMouseClicked
        Double distancia = gestorCampos.validarEntradaDouble(txtDistancia.getText());
        String seleccion = (String) cmbVehiculo.getSelectedItem();
        ArrayList<Producto> productos = new ArrayList<Producto>();
        DefaultTableModel modelo = (DefaultTableModel) tblProductosPedido.getModel();
        int rowCount = modelo.getRowCount();
      
        if(tblProductosPedido.getRowCount() == 0){
            Mensaje("Ingrese productos al pedido");
        } else if (distancia > 10 || distancia <= 0) {
            Mensaje("La distancia debe ser un valor numérico entre 1 y 10");
        } else {
            String[] partes = seleccion.split("-");
            String codigoVehiculo = partes[0].trim();
            Vehiculo vehiculo = gestorVehiculo.getVehiculoByCodigo(codigoVehiculo);
        
            for (int row = 0; row < rowCount; row++) {
                Object value = modelo.getValueAt(row, 0);

                // Suponiendo que gestorProd es una instancia de tu clase de gestión de productos
                Producto producto = gestorProd.getProductoByCodigo(value.toString());
                if (producto != null) {
                    productos.add(producto);
                }   
            }
            
            gestorPedido.agregarPedido(productos, vehiculo, distancia);
            llenarComboVehiculos();
            modelo.setRowCount(0);
            txtDistancia.setText("");
            ActualizarTotal();
        }      
    }//GEN-LAST:event_btnConfirmarPedidoMouseClicked
    
    public void Mensaje(String message) {
        JOptionPane.showMessageDialog(null, message);
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
            java.util.logging.Logger.getLogger(vtnOrdenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnOrdenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnOrdenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnOrdenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnOrdenar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarPedido;
    private javax.swing.JLabel btnFlechaAgregar;
    private javax.swing.JLabel btnFlechaQuitar;
    private javax.swing.JComboBox<String> cmbVehiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDistancia;
    private javax.swing.JLabel lblPedido;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTable tblProductosPedido;
    private javax.swing.JTextField txtDistancia;
    // End of variables declaration//GEN-END:variables
}
