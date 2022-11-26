package ABCCbasic;

/**
 *  Autores
 *  Cardoso Hernandez Edith Alejandra
 *  Juarez Barrios Axel Nicolas 
 *  Zuñiga Aguilar Saul
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GInicio extends JFrame implements Serializable, ActionListener {

    JLabel lTitulo, lTitulo2, Logo;
    JButton bIniciarSesion, bRegistrarse;
    
    public GInicio() {
        configurarVentana();
        iniciarComp();
    }
    
    public void configurarVentana() {
        setTitle("ABCCbasic");
        setBounds(50, 50, 565, 560);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        this.getContentPane().setBackground(Color.getHSBColor(0.1f, 0.1f, 0.15f));
    }
    
    public void iniciarComp() {
        lTitulo = new JLabel("ABCC");
        lTitulo.setBounds(100, 40, 600, 100);
        lTitulo.setFont(new Font("Arial", Font.BOLD, 48));
        lTitulo.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        add(lTitulo);
        
        lTitulo2 = new JLabel("basic");
        lTitulo2.setBounds(100, 80, 600, 100);
        lTitulo2.setFont(new Font("Arial", Font.BOLD, 48));
        lTitulo2.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        add(lTitulo2);
        
        bIniciarSesion = new JButton("INICIAR SESIÓN");
        bIniciarSesion.setBounds(100, 240, 340, 50);
        bIniciarSesion.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
        bIniciarSesion.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.4f));
        bIniciarSesion.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        bIniciarSesion.setBorderPainted(false);
        bIniciarSesion.setFocusable(false);
        bIniciarSesion.addActionListener(this);
        add(bIniciarSesion);
        
        Logo = new JLabel();
        Logo.setBounds(320, 380, 120, 64);
        Logo.setBorder(null);
        ImageIcon iconLogo = new ImageIcon(this.getClass().getResource("/resources/gengram.png"));
        Image imgLogo = iconLogo.getImage();
        ImageIcon logotipo = new ImageIcon(imgLogo);
        Logo.setIcon(logotipo);
        add(Logo);
        
        setVisible(true);
    }
    
    @Override
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("resources/iconapp.png"));
        return retValue;
    }
    
    public void actionPerformed(ActionEvent e) {
        String cadena = e.getActionCommand();
        if(cadena.equals("INICIAR SESIÓN")) {
            dispose();
            GSesion sesion = new GSesion();
        }
    }
}
