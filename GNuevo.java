package ABCCbasic;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *  Autores
 *  Cardoso Hernandez Edith Alejandra
 *  Juarez Barrios Axel Nicolas 
 *  Zuñiga Aguilar Saul
 */

public class GNuevo extends javax.swing.JFrame {
    
    CProducto producto = new CProducto();
    Metodos metodos = new Metodos();
    DefaultTableModel modelTable;
    Vector vHeaders = new Vector();
    
    
    public GNuevo() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        vHeaders.addElement("Clave");
        vHeaders.addElement("Nombre");
        vHeaders.addElement("Unidades");
        vHeaders.addElement("Costo");
        modelTable = new DefaultTableModel(vHeaders, 0);
        TablaNuevos.setModel(modelTable);
        TablaNuevos.setModel(metodos.listaProductos());
        
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        this.getContentPane().setBackground(Color.getHSBColor(0.0f, 0.0f, 0.8f));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitulo = new javax.swing.JLabel();
        lClave = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        lUnidades = new javax.swing.JLabel();
        lPrecio = new javax.swing.JLabel();
        fClave = new javax.swing.JTextField();
        fNombre = new javax.swing.JTextField();
        fUnidades = new javax.swing.JTextField();
        fPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaNuevos = new javax.swing.JTable();
        bGuardar = new javax.swing.JButton();
        bRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nuevo Producto");
        setBackground(new java.awt.Color(153, 153, 153));

        lTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lTitulo.setText("Nuevo producto");

        lClave.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lClave.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lClave.setText("Clave:");
        lClave.setToolTipText("");

        lNombre.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lNombre.setText("Nombre:");
        lNombre.setToolTipText("");

        lUnidades.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lUnidades.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lUnidades.setText("Unidades:");
        lUnidades.setToolTipText("");

        lPrecio.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lPrecio.setText("Precio:");
        lPrecio.setToolTipText("");

        fClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fClaveActionPerformed(evt);
            }
        });

        fNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNombreActionPerformed(evt);
            }
        });

        fUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fUnidadesActionPerformed(evt);
            }
        });

        fPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fPrecioActionPerformed(evt);
            }
        });

        TablaNuevos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaNuevos.setEnabled(false);
        jScrollPane1.setViewportView(TablaNuevos);

        bGuardar.setBackground(new java.awt.Color(51, 51, 51));
        bGuardar.setForeground(new java.awt.Color(255, 255, 255));
        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        bRegresar.setBackground(new java.awt.Color(51, 51, 51));
        bRegresar.setForeground(new java.awt.Color(255, 255, 255));
        bRegresar.setText("Regresar");
        bRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bRegresar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lClave, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fClave, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lClave)
                    .addComponent(fClave, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre)
                    .addComponent(fNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUnidades)
                    .addComponent(fUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPrecio)
                    .addComponent(fPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("resources/iconapp.png"));
        return retValue;
    }
    
    private void fClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fClaveActionPerformed
    }//GEN-LAST:event_fClaveActionPerformed

    private void fNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNombreActionPerformed
    }//GEN-LAST:event_fNombreActionPerformed

    private void fUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fUnidadesActionPerformed
    }//GEN-LAST:event_fUnidadesActionPerformed

    private void fPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fPrecioActionPerformed
    }//GEN-LAST:event_fPrecioActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        modelTable = new DefaultTableModel(); 
        int clave = Integer.parseInt(fClave.getText());
        String nombre = fNombre.getText();
        int unidades = Integer.parseInt(fUnidades.getText());
        int precio = Integer.parseInt(fPrecio.getText());
        
        producto.setClave(clave);
        producto.setNombre(nombre);
        producto.setUnidades(unidades);
        producto.setPrecio(precio);
        
        metodos.guardarProducto(producto);
        metodos.guardarArchivo(producto);
        
        TablaNuevos.setModel(metodos.listaProductos());
        
        JOptionPane.showMessageDialog(null, "Registro Exitoso");
        
        fClave.setText("");
        fNombre.setText("");
        fUnidades.setText("");
        fPrecio.setText("");
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_bRegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaNuevos;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bRegresar;
    private javax.swing.JTextField fClave;
    private javax.swing.JTextField fNombre;
    private javax.swing.JTextField fPrecio;
    private javax.swing.JTextField fUnidades;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lClave;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lPrecio;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JLabel lUnidades;
    // End of variables declaration//GEN-END:variables
}
