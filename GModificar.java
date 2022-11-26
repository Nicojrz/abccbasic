package ABCCbasic;

/**
 *  Autores
 *  Cardoso Hernandez Edith Alejandra
 *  Juarez Barrios Axel Nicolas 
 *  Zuñiga Aguilar Saul
 */

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.*;
import javax.swing.*;
import javax.swing.table.*;

public class GModificar extends javax.swing.JFrame {

    int filas;
    Metodos metodos = new Metodos();
    DefaultTableModel modelTable;
    
    public GModificar() {
        initComponents();
        this.setLocationRelativeTo(null);
        TablaModificar.setModel(metodos.listaProductos());
        
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        this.getContentPane().setBackground(Color.getHSBColor(0.0f, 0.0f, 0.8f));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaModificar = new javax.swing.JTable();
        bRegresar = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        lClave = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        lUnidades = new javax.swing.JLabel();
        lPrecio = new javax.swing.JLabel();
        fClave = new javax.swing.JTextField();
        fNombre = new javax.swing.JTextField();
        fUnidades = new javax.swing.JTextField();
        fPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Producto");
        setBackground(new java.awt.Color(153, 153, 153));

        lTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lTitulo.setText("Modificar producto");

        TablaModificar.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaModificarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaModificar);

        bRegresar.setBackground(new java.awt.Color(51, 51, 51));
        bRegresar.setForeground(new java.awt.Color(255, 255, 255));
        bRegresar.setText("Regresar");
        bRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegresarActionPerformed(evt);
            }
        });

        bModificar.setBackground(new java.awt.Color(51, 51, 51));
        bModificar.setForeground(new java.awt.Color(255, 255, 255));
        bModificar.setText("Modificar");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                        .addGap(164, 164, 164))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bRegresar))
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lClave, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fClave, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 63, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lTitulo)
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("resources/iconapp.png"));
        return retValue;
    }
    
    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_bRegresarActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        String[] datos = new String[4];
        datos[0] = fClave.getText();
        datos[1] = fNombre.getText();
        datos[2] = fUnidades.getText();
        datos[3] = fPrecio.getText();
        
        for (int i = 0; i < TablaModificar.getColumnCount(); i++) {
            TablaModificar.setValueAt(datos[i], filas, i);
        }
        
        try {
            String archivo = "Productos.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            for (int j = 0; j < TablaModificar.getRowCount(); j++) {
                for (int k = 0; k < TablaModificar.getColumnCount(); k++) {
                    bw.write((String)(TablaModificar.getValueAt(j, k)));
                    if(k < TablaModificar.getColumnCount()-1) {
                        bw.write("|");
                    }
                }
                bw.newLine();
            }
            bw.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        JOptionPane.showMessageDialog(null, "Registro actualizado");
        
        fClave.setText("");
        fNombre.setText("");
        fUnidades.setText("");
        fPrecio.setText("");
    }//GEN-LAST:event_bModificarActionPerformed

    private void fClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fClaveActionPerformed

    }//GEN-LAST:event_fClaveActionPerformed

    private void fNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNombreActionPerformed

    }//GEN-LAST:event_fNombreActionPerformed

    private void fUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fUnidadesActionPerformed

    }//GEN-LAST:event_fUnidadesActionPerformed

    private void fPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fPrecioActionPerformed

    }//GEN-LAST:event_fPrecioActionPerformed

    private void TablaModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaModificarMouseClicked
        this.modelTable = (DefaultTableModel) TablaModificar.getModel();
        
        int selection = TablaModificar.getSelectedRow();
        fClave.setText(TablaModificar.getValueAt(selection, 0).toString());
        fNombre.setText(TablaModificar.getValueAt(selection, 1).toString());
        fUnidades.setText(TablaModificar.getValueAt(selection, 2).toString());
        fPrecio.setText(TablaModificar.getValueAt(selection, 3).toString());
        
        filas = selection;
    }//GEN-LAST:event_TablaModificarMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaModificar;
    private javax.swing.JButton bModificar;
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
