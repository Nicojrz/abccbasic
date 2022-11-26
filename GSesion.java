package ABCCbasic;

/**
 *  Autores
 *  Cardoso Hernandez Edith Alejandra
 *  Juarez Barrios Axel Nicolas 
 *  Zuñiga Aguilar Saul
 */

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class GSesion extends JFrame implements Serializable, ActionListener {
    private Component confirmation;
    private String usuario, password;
    
    JLabel lTitulo, lUser, lPassword;
    JButton bIniciarS, bRegresar;
    JTextField fUser;
    JPasswordField fPassword;
    
    public GSesion() {
        configurarVentana();
        iniciarComp();
    }
    
    public void datosUsuario(String us, String pw) {
        usuario = "admin";
        password = "password";
    }
    
    public void configurarVentana() {
        setTitle("Iniciar sesión");
        setBounds(50, 50, 720, 720);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        this.getContentPane().setBackground(Color.getHSBColor(0.1f, 0.1f, 0.15f));
    }
    
    public void iniciarComp() {
        bRegresar = new JButton("");
        bRegresar.setBounds(100, 120, 40, 40);
        bRegresar.addActionListener(this);
        bRegresar.setIcon(new ImageIcon());
        bRegresar.setBorderPainted(false);
        bRegresar.setFocusable(false);
        bRegresar.setBackground(Color.getHSBColor(0.1f, 0.1f, 0.15f));
        ImageIcon iconReg = new ImageIcon(this.getClass().getResource("/resources/regresar.png"));
        Image imgReg = iconReg.getImage();
        ImageIcon regresar = new ImageIcon(imgReg);
        bRegresar.setIcon(regresar);
        add(bRegresar);
        
        lTitulo = new JLabel("Iniciar sesión");
        lTitulo.setBounds(180, 40, 600, 200);
        lTitulo.setFont(new Font("Arial", Font.BOLD, 48));
        lTitulo.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        add(lTitulo);
        
        lUser = new JLabel("Usuario");
        lUser.setBounds(100, 180, 600, 100);
        lUser.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
        lUser.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        add(lUser);
        
        fUser = new JTextField("");
        fUser.setBounds(100, 260, 480, 36);
        fUser.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
        fUser.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.2f));
        fUser.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        add(fUser);
        
        lPassword = new JLabel("Contraseña");
        lPassword.setBounds(100, 300, 600, 100);
        lPassword.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
        lPassword.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        add(lPassword);
        
        fPassword = new JPasswordField("");
        fPassword.setBounds(100, 380, 480, 36);
        fPassword.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
        fPassword.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.2f));
        fPassword.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        add(fPassword);
        
        bIniciarS = new JButton("INICIAR SESIÓN");
        bIniciarS.setBounds(100, 480, 300, 50);
        bIniciarS.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
        bIniciarS.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.4f));
        bIniciarS.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        bIniciarS.setBorderPainted(false);
        bIniciarS.setFocusable(false);
        bIniciarS.addActionListener(this);
        add(bIniciarS);
        
        setVisible(true);
    }
    
    @Override
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("resources/iconapp.png"));
        return retValue;
    }
    
    public void actionPerformed(ActionEvent e) {
        String cadena = e.getActionCommand();
        datosUsuario(usuario, password);
        
        if(cadena.equals("INICIAR SESIÓN")) {
            if(usuario.equals(fUser.getText()) && password.equals(fPassword.getText())) {
                JOptionPane.showMessageDialog(null, "Acceso exitoso.");
                GMenu menu = new GMenu();
                dispose(); 
            } else
                JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña incorrectos");
            
        } else
            if(cadena.equals("")) {
                dispose();
                GInicio inicio = new GInicio();
            }
    }
}
