/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import archivos.Binario;
import clases.GestorCampos;
import clases.Producto;
import clases.GestorProductos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dg551
 */
public class vtnProductos extends javax.swing.JFrame {

    /**
     * Creates new form vtnProductos
     */
    
    
    DefaultTableModel modelProductos;
    GestorProductos gestorProd = GestorProductos.getInstancia();
    GestorCampos gestorCampos = new GestorCampos();
    Binario binario;
    
    public vtnProductos() {
        initComponents();
        setLocationRelativeTo(null);
        this.binario = new Binario();
        ListarProductos(gestorProd.getProductos());
        
        ListarProductos(binario.obtenerProductos());
        gestorProd.setListaProductos(binario.obtenerProductos());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblProducto = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jScrollPane1.setViewportView(tblProductos);

        lblProducto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProducto.setText("Productos");

        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        jLabel1.setText("Precio producto:");

        jLabel2.setText("Nombre producto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        String nombre = txtNombre.getText();
        Double precio = gestorCampos.validarEntradaDouble(txtPrecio.getText());
        
        ArrayList<String> campos = new ArrayList<String>();
        campos.add(nombre);
        campos.add(String.valueOf(precio));

        if(gestorCampos.camposVacios(campos)) {
            Mensaje("Debe llenar todos los campos");
        } else if (precio <= 0) {
            Mensaje("El precio debe ser un valor numérico mayor a cero");
        } else {
            gestorProd.crearProducto(nombre, precio);
            guardarBinario();
            LimpiarCampos();
            ListarProductos(gestorProd.getProductos());
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        modelProductos = (DefaultTableModel)tblProductos.getModel();
        int selectedRow = tblProductos.getSelectedRow();
        String nombre = modelProductos.getValueAt(selectedRow, 1).toString();
        String precio = modelProductos.getValueAt(selectedRow, 2).toString();
        
        txtNombre.setText(nombre);
        txtPrecio.setText(precio.replaceAll("Q", ""));
    }//GEN-LAST:event_tblProductosMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int selectedRow = tblProductos.getSelectedRow();
        
        if (selectedRow >= 0){
            int confirm = JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar el producto?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) tblProductos.getModel();
                gestorProd.eliminarProducto(model.getValueAt(selectedRow, 0).toString());
                ((DefaultTableModel) tblProductos.getModel()).removeRow(selectedRow);
                LimpiarCampos();
                guardarBinario();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un producto de la tabla");
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        int selectedRow = tblProductos.getSelectedRow();
        
        if(selectedRow >= 0 ) {
            // Obtener los valores de la fila seleccionada
            String codigo = modelProductos.getValueAt(selectedRow, 0).toString();
            String nombre = txtNombre.getText();
            Double precio = gestorCampos.validarEntradaDouble(txtPrecio.getText());
            
            ArrayList<String> campos = new ArrayList<String>();
            campos.add(nombre);
            campos.add(String.valueOf(precio));

            if(gestorCampos.camposVacios(campos)) {
                Mensaje("Debe llenar todos los campos");
            } else if (precio <= 0) {
                Mensaje("El precio debe ser un valor numérico mayor a 0");
            } else {
                gestorProd.actualizarProducto(codigo, nombre, precio);
                LimpiarCampos();
                ListarProductos(gestorProd.getProductos());
                guardarBinario();
            }
        } else {
            Mensaje("Seleccione un producto de la tabla");
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void LimpiarCampos(){
        txtNombre.setText("");
        txtPrecio.setText("");
    }
    
    public void Mensaje(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    public void guardarBinario(){
        boolean ok = binario.guardarProductos(gestorProd.getProductos());
        if(ok){
            Mensaje("Se ha guardado los datos");
        } else {
            Mensaje("¡Error!");
        }
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
            java.util.logging.Logger.getLogger(vtnProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
