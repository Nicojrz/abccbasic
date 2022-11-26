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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.*;

public class GBuscar extends javax.swing.JFrame {

    Metodos metodos = new Metodos();
    DefaultTableModel modelTable;
    TableRowSorter<DefaultTableModel> sorter; 
    
    public GBuscar() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        TablaBuscar.setModel(metodos.listaProductos());
        this.modelTable = (DefaultTableModel) TablaBuscar.getModel();
        
        TablaBuscar.setAutoCreateRowSorter(true);
        sorter = new TableRowSorter<>(modelTable);
        TablaBuscar.setRowSorter(sorter); 
        
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
        TablaBuscar = new javax.swing.JTable();
        lClave = new javax.swing.JLabel();
        fClave = new javax.swing.JTextField();
        bRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscar Producto");
        setBackground(new java.awt.Color(153, 153, 153));

        lTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lTitulo.setText("Buscar producto");

        TablaBuscar.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaBuscar.setEnabled(false);
        jScrollPane1.setViewportView(TablaBuscar);

        lClave.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lClave.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lClave.setText("Clave:");
        lClave.setToolTipText("");

        fClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fClaveActionPerformed(evt);
            }
        });
        fClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fClaveKeyReleased(evt);
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
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bRegresar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lClave, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fClave, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE))
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lTitulo)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lClave)
                    .addComponent(fClave, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(bRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("resources/iconapp.png"));
        return retValue;
    }
     
    private void fClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fClaveActionPerformed
    }//GEN-LAST:event_fClaveActionPerformed

    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_bRegresarActionPerformed

    private void fClaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fClaveKeyReleased
        try {
            sorter.setRowFilter(RowFilter.regexFilter(fClave.getText(), 0));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_fClaveKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaBuscar;
    private javax.swing.JButton bRegresar;
    private javax.swing.JTextField fClave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lClave;
    private javax.swing.JLabel lTitulo;
    // End of variables declaration//GEN-END:variables
}
