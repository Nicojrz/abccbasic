package ABCCbasic;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *  Autores
 *  Cardoso Hernandez Edith Alejandra
 *  Juarez Barrios Axel Nicolas 
 *  Zuñiga Aguilar Saul
 */

public class GVerCarrito extends javax.swing.JFrame {
    
    MetodosCarrito metodosCarrito = new MetodosCarrito();
    DefaultTableModel modelCarrito;

    public GVerCarrito() {
        initComponents();

        TablaVer.setModel(metodosCarrito.listaCarrito());
        
        this.setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        this.getContentPane().setBackground(Color.getHSBColor(0.0f, 0.0f, 0.8f));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bRegresar = new javax.swing.JButton();
        bComprar = new javax.swing.JButton();
        lTitulo = new javax.swing.JLabel();
        bRegresar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVer = new javax.swing.JTable();

        bRegresar.setBackground(new java.awt.Color(51, 51, 51));
        bRegresar.setForeground(new java.awt.Color(255, 255, 255));
        bRegresar.setText("Regresar");
        bRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegresarActionPerformed(evt);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ver carrito");

        lTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lTitulo.setText("Ver carrito");

        bRegresar1.setBackground(new java.awt.Color(51, 51, 51));
        bRegresar1.setForeground(new java.awt.Color(255, 255, 255));
        bRegresar1.setText("Regresar");
        bRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegresar1ActionPerformed(evt);
            }
        });

        TablaVer.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaVer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                        .addGap(176, 176, 176))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bRegresar1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lTitulo)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(bRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("resources/iconapp.png"));
        return retValue;
    }
    
    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
    }//GEN-LAST:event_bRegresarActionPerformed

    private void bComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprarActionPerformed
    }//GEN-LAST:event_bComprarActionPerformed

    private void bRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresar1ActionPerformed
        dispose();
    }//GEN-LAST:event_bRegresar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVer;
    private javax.swing.JButton bComprar;
    private javax.swing.JButton bRegresar;
    private javax.swing.JButton bRegresar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lTitulo;
    // End of variables declaration//GEN-END:variables
}
