package ABCCbasic;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *  Autores
 *  Cardoso Hernandez Edith Alejandra
 *  Juarez Barrios Axel Nicolas 
 *  Zuñiga Aguilar Saul
 */

public class GCarrito extends javax.swing.JFrame {

    int filas;
    CCarrito carrito = new CCarrito();
    Vector vHeaders = new Vector();
    Metodos metodos = new Metodos();
    MetodosCarrito metodosCarrito = new MetodosCarrito();
    DefaultTableModel modelTable;
    DefaultTableModel modelCarrito;
    
    public GCarrito() {
        initComponents();
        
        vHeaders.addElement("Clave");
        vHeaders.addElement("Nombre");
        vHeaders.addElement("Compradas");
        modelCarrito = new DefaultTableModel(vHeaders, 0);
        
        TablaProductos.setModel(metodos.listaProductos());
        TablaCarrito.setModel(modelCarrito);
        TablaCarrito.setModel(metodosCarrito.listaCarrito());
        
        this.setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        this.getContentPane().setBackground(Color.getHSBColor(0.0f, 0.0f, 0.8f));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bModificar = new javax.swing.JButton();
        bRegresar = new javax.swing.JButton();
        lTitulo = new javax.swing.JLabel();
        lPrecio = new javax.swing.JLabel();
        lUnidades = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        lClave = new javax.swing.JLabel();
        fClave = new javax.swing.JTextField();
        fNombre = new javax.swing.JTextField();
        fUnidades = new javax.swing.JTextField();
        fPrecio = new javax.swing.JTextField();
        lUnidades1 = new javax.swing.JLabel();
        fCompradas = new javax.swing.JTextField();
        bQuitar = new javax.swing.JButton();
        bComprar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCarrito = new javax.swing.JTable();
        bRegresar2 = new javax.swing.JButton();
        bAnadir = new javax.swing.JButton();

        bModificar.setBackground(new java.awt.Color(51, 51, 51));
        bModificar.setForeground(new java.awt.Color(255, 255, 255));
        bModificar.setText("Modificar");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi carrito");
        setResizable(false);

        lTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lTitulo.setText("Añadir al carrito");

        lPrecio.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lPrecio.setText("Precio:");
        lPrecio.setToolTipText("");

        lUnidades.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lUnidades.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lUnidades.setText("Unidades:");
        lUnidades.setToolTipText("");

        lNombre.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lNombre.setText("Nombre:");
        lNombre.setToolTipText("");

        lClave.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lClave.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lClave.setText("Clave:");
        lClave.setToolTipText("");

        fClave.setEnabled(false);
        fClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fClaveActionPerformed(evt);
            }
        });

        fNombre.setEnabled(false);
        fNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNombreActionPerformed(evt);
            }
        });

        fUnidades.setEnabled(false);
        fUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fUnidadesActionPerformed(evt);
            }
        });

        fPrecio.setEnabled(false);
        fPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fPrecioActionPerformed(evt);
            }
        });

        lUnidades1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lUnidades1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lUnidades1.setText("Unidades a comprar:");
        lUnidades1.setToolTipText("");

        fCompradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fCompradasActionPerformed(evt);
            }
        });

        bQuitar.setBackground(new java.awt.Color(51, 51, 51));
        bQuitar.setForeground(new java.awt.Color(255, 255, 255));
        bQuitar.setText("Eliminar del carrito");
        bQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQuitarActionPerformed(evt);
            }
        });

        bComprar.setBackground(new java.awt.Color(51, 51, 51));
        bComprar.setForeground(new java.awt.Color(255, 255, 255));
        bComprar.setText("Comprar");
        bComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprarActionPerformed(evt);
            }
        });

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProductos);

        TablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TablaCarrito);

        bRegresar2.setBackground(new java.awt.Color(51, 51, 51));
        bRegresar2.setForeground(new java.awt.Color(255, 255, 255));
        bRegresar2.setText("Regresar");
        bRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegresar2ActionPerformed(evt);
            }
        });

        bAnadir.setBackground(new java.awt.Color(51, 51, 51));
        bAnadir.setForeground(new java.awt.Color(255, 255, 255));
        bAnadir.setText("Añadir al carrito");
        bAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bRegresar2)
                        .addGap(18, 18, 18)
                        .addComponent(bComprar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(533, 533, 533))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lClave, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fClave, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lUnidades1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(fCompradas, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11)))
                        .addContainerGap(84, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(lTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lUnidades1)
                            .addComponent(fCompradas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(fPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRegresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
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

    private void fCompradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fCompradasActionPerformed
    }//GEN-LAST:event_fCompradasActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
 
    }//GEN-LAST:event_bModificarActionPerformed

    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
    }//GEN-LAST:event_bRegresarActionPerformed

    private void bQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQuitarActionPerformed
        this.modelCarrito = (DefaultTableModel) TablaCarrito.getModel();
                modelCarrito.removeRow(TablaCarrito.getSelectedRow());

                try {
                    String archivo = "Carrito.txt";
                    BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
                    for(int i = 0 ; i < TablaCarrito.getRowCount(); i++) {
                        for (int j = 0; j < TablaCarrito.getColumnCount(); j++) {
                            bw.write((String)(TablaCarrito.getValueAt(i, j)));
                            if(j < TablaCarrito.getColumnCount()-1) {
                                bw.write("|");
                            }
                        }
                        bw.newLine();
                    }
                    bw.close();
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                JOptionPane.showMessageDialog(null, "Producto eliminado");
    }//GEN-LAST:event_bQuitarActionPerformed

    private void bComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprarActionPerformed
        String[] datos = new String[4];
        
        for (int i = 0; i < TablaProductos.getRowCount(); i++) {
            for (int m = 0; m < TablaCarrito.getRowCount(); m++) {
                if(TablaProductos.getValueAt(i, 0).equals(TablaCarrito.getValueAt(m, 0))) {
                    
                    datos[0] = (String) TablaProductos.getValueAt(i, 0);
                    datos[1] = (String) TablaProductos.getValueAt(i, 1);
                    
                    String cantidad = (String)(TablaProductos.getValueAt(i, 2));
                    String resta = (String)(TablaCarrito.getValueAt(m, 2));
                    
                    int cant = Integer.parseInt(cantidad);
                    int res = Integer.parseInt(resta);
                    int resultado = cant - res;
                    
                    datos[2] = "" + resultado;
                    datos[3] = (String) TablaProductos.getValueAt(i, 3);
                    
                    TablaProductos.setValueAt(datos[0], i, 0);
                    TablaProductos.setValueAt(datos[1], i, 1);
                    TablaProductos.setValueAt(datos[2], i, 2);
                    TablaProductos.setValueAt(datos[3], i, 3);
                }
            }
        }
        
        try {
            String archivo = "Productos.txt";
            String carrito = "Carrito.txt";
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            for (int j = 0; j < TablaProductos.getRowCount(); j++) {
                for (int k = 0; k < TablaProductos.getColumnCount(); k++) {
                    bw.write((String)(TablaProductos.getValueAt(j, k)));
                    if(k < TablaProductos.getColumnCount()-1) {
                        bw.write("|");
                    }
                }
                bw.newLine();
            }
            bw.close();
            
            BufferedWriter cbw = new BufferedWriter(new FileWriter(carrito));
            cbw.write("");
            cbw.close();
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        TablaCarrito.setModel(metodosCarrito.listaCarrito());

        JOptionPane.showMessageDialog(null, "Producto comprado");
        
    }//GEN-LAST:event_bComprarActionPerformed

    private void bRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresar2ActionPerformed
        dispose();
    }//GEN-LAST:event_bRegresar2ActionPerformed

    private void bAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnadirActionPerformed
        modelCarrito = new DefaultTableModel(); 
        
        int compradas = Integer.parseInt(fCompradas.getText());
        
        if(Integer.parseInt(fUnidades.getText())>= Integer.parseInt(fCompradas.getText())) {
            
            int clave = Integer.parseInt(fClave.getText());
            String nombre = fNombre.getText();
            
            carrito.setClave(clave);
            carrito.setNombre(nombre);
            carrito.setCompradas(compradas);

            metodosCarrito.guardarCarrito(carrito);
            metodosCarrito.guardarArchivoCarrito(carrito);

            TablaCarrito.setModel(metodosCarrito.listaCarrito());

            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } else {
            JOptionPane.showMessageDialog(null, "Unidades insuficientes");
        }
        
        fClave.setText("");
        fNombre.setText("");
        fUnidades.setText("");
        fCompradas.setText("");
    }//GEN-LAST:event_bAnadirActionPerformed

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked
        this.modelTable = (DefaultTableModel) TablaProductos.getModel();
        
        int selection = TablaProductos.getSelectedRow();
        fClave.setText(TablaProductos.getValueAt(selection, 0).toString());
        fNombre.setText(TablaProductos.getValueAt(selection, 1).toString());
        fUnidades.setText(TablaProductos.getValueAt(selection, 2).toString());
        fPrecio.setText(TablaProductos.getValueAt(selection, 3).toString());
        
        filas = selection;
    }//GEN-LAST:event_TablaProductosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCarrito;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton bAnadir;
    private javax.swing.JButton bComprar;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bQuitar;
    private javax.swing.JButton bRegresar;
    private javax.swing.JButton bRegresar2;
    private javax.swing.JTextField fClave;
    private javax.swing.JTextField fCompradas;
    private javax.swing.JTextField fNombre;
    private javax.swing.JTextField fPrecio;
    private javax.swing.JTextField fUnidades;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lClave;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lPrecio;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JLabel lUnidades;
    private javax.swing.JLabel lUnidades1;
    // End of variables declaration//GEN-END:variables
}
