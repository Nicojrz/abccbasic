package ABCCbasic;

/**
 *  Autores
 *  Cardoso Hernandez Edith Alejandra
 *  Juarez Barrios Axel Nicolas 
 *  Zuñiga Aguilar Saul
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GMenu extends JFrame implements Serializable, ActionListener {
    
    JLabel lNomUser, lmsg1, lmsg2, lmsg3;
    JButton bConfig, bNuevo, bEliminar, bModificar, bCarrito, bVer, bBuscar, bSalir;
    
    public GMenu() {
        configurarVentana();
        iniciarComp();
    }
    
    public void configurarVentana() {
        setTitle("ABCCbasic");
        setBounds(50, 50, 1440, 800);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        this.getContentPane().setBackground(Color.getHSBColor(0.1f, 0.1f, 0.15f));
    }
    
    public void iniciarComp() {
        bConfig = new JButton("");
        bConfig.setBounds(60, 60, 40, 40);
        bConfig.addActionListener(this);
        bConfig.setIcon(new ImageIcon());
        bConfig.setBorderPainted(false);
        bConfig.setFocusable(false);
        bConfig.setBackground(Color.getHSBColor(0.1f, 0.1f, 0.15f));
        ImageIcon iconReg = new ImageIcon(this.getClass().getResource("/resources/ajustes.png"));
        Image imgReg = iconReg.getImage();
        ImageIcon regresar = new ImageIcon(imgReg);
        bConfig.setIcon(regresar);
        add(bConfig);
        
        lNomUser = new JLabel("Ajustes");
        lNomUser.setBounds(120, 70, 200, 20);
        lNomUser.setFont(new Font("Arial", Font.PLAIN, 16));
        lNomUser.setForeground(Color.getHSBColor(0.0f, 0.0f, 0.5f));
        add(lNomUser);
        
        bNuevo = new JButton("Nuevo producto");
        bNuevo.setBounds(60, 220, 280, 60);
        bNuevo.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        bNuevo.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.4f));
        bNuevo.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        bNuevo.setBorderPainted(false);
        bNuevo.setFocusable(false);
        bNuevo.addActionListener(this);
        add(bNuevo);
        
        bModificar = new JButton("Modificar producto");
        bModificar.setBounds(60, 300, 280, 60);
        bModificar.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        bModificar.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.4f));
        bModificar.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        bModificar.setBorderPainted(false);
        bModificar.setFocusable(false);
        bModificar.addActionListener(this);
        add(bModificar);
        
        bBuscar = new JButton("Buscar producto");
        bBuscar.setBounds(60, 380, 280, 60);
        bBuscar.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        bBuscar.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.4f));
        bBuscar.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        bBuscar.setBorderPainted(false);
        bBuscar.setFocusable(false);
        bBuscar.addActionListener(this);
        add(bBuscar);
        
        bEliminar = new JButton("Eliminar producto");
        bEliminar.setBounds(60, 460, 280, 60);
        bEliminar.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        bEliminar.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.4f));
        bEliminar.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        bEliminar.setBorderPainted(false);
        bEliminar.setFocusable(false);
        bEliminar.addActionListener(this);
        add(bEliminar);
        
        bCarrito = new JButton("Mi carrito");
        bCarrito.setBounds(60, 540, 280, 60);
        bCarrito.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        bCarrito.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.4f));
        bCarrito.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        bCarrito.setBorderPainted(false);
        bCarrito.setFocusable(false);
        bCarrito.addActionListener(this);
        add(bCarrito);
        
        bVer = new JButton("Ver carrito");
        bVer.setBounds(60, 620, 280, 60);
        bVer.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        bVer.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.4f));
        bVer.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        bVer.setBorderPainted(false);
        bVer.setFocusable(false);
        bVer.addActionListener(this);
        add(bVer);
        
        lmsg1 = new JLabel("Bienvenido,");
        lmsg1.setBounds(420, 40, 500, 80);
        lmsg1.setFont(new Font("Arial", Font.BOLD, 36));
        lmsg1.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        add(lmsg1);
        
        lmsg2 = new JLabel("administrador");
        lmsg2.setBounds(420, 80, 500, 80);
        lmsg2.setFont(new Font("Arial", Font.BOLD, 24));
        lmsg2.setForeground(Color.getHSBColor(0.0f, 0.0f, 0.4f));
        add(lmsg2);
        
        lmsg3 = new JLabel("¿Qué desea hacer?");
        lmsg3.setBounds(420, 190, 500, 80);
        lmsg3.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        lmsg3.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        add(lmsg3);
        
        bSalir = new JButton("Salir");
        bSalir.setBounds(1080, 640, 280, 60);
        bSalir.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
        bSalir.setBackground(Color.getHSBColor(0.1f, 0.1f, 0.15f));
        bSalir.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        bSalir.setFocusable(false);
        bSalir.addActionListener(this);
        add(bSalir);
        
        setVisible(true);
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("resources/iconapp.png"));
        return retValue;
    }
    
    public void actionPerformed(ActionEvent e) {
        String cadena = e.getActionCommand();
        if(cadena.equals("")) {
            dispose();
            GAjustes usr = new GAjustes();
        } else
            if(cadena.equals("Salir")) {
                dispose();
            } else
                if(cadena.equals("Nuevo producto")) {
                    GNuevo nuevo = new GNuevo();
                    nuevo.setVisible(true);
                } else
                    if(cadena.equals("Modificar producto")) {
                        GModificar modificar = new GModificar();
                        modificar.setVisible(true);
                    } else
                        if(cadena.equals("Buscar producto")) {
                            GBuscar buscar = new GBuscar();
                            buscar.setVisible(true);
                        } else
                            if(cadena.equals("Eliminar producto")) {
                                GEliminar eliminar = new GEliminar();
                                eliminar.setVisible(true);
                            } else
                                if(cadena.equals("Mi carrito")) {
                                    GCarrito carrito = new GCarrito();
                                    carrito.setVisible(true);
                                } else
                                    if(cadena.equals("Ver carrito")) {
                                        GVerCarrito ver = new GVerCarrito();
                                        ver.setVisible(true);
                                    }
    }
}
