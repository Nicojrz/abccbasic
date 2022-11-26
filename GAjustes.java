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

public class GAjustes extends JFrame implements Serializable, ActionListener  {
    
    JLabel lTitulo;
    JButton bInfo, bCerrar, bRegresar;
    
     public GAjustes() {
        configurarVentana();
        iniciarComp();
    }
    
    public void configurarVentana() {
        setTitle("Mi usuario");
        setBounds(50, 50, 560, 480);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        this.getContentPane().setBackground(Color.getHSBColor(0.1f, 0.1f, 0.15f));
    }
    
    public void iniciarComp() {
        lTitulo = new JLabel("Ajustes");
        lTitulo.setBounds(180, 90, 300, 60);
        lTitulo.setFont(new Font("Arial", Font.BOLD, 48));
        lTitulo.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        add(lTitulo);
        
        bInfo = new JButton("INFORMACIÓN PERSONAL");
        bInfo.setBounds(100, 220, 320, 50);
        bInfo.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
        bInfo.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.4f));
        bInfo.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        bInfo.setBorderPainted(false);
        bInfo.setFocusable(false);
        bInfo.addActionListener(this);
        add(bInfo);
        
        bCerrar = new JButton("CERRAR SESIÓN");
        bCerrar.setBounds(100, 300, 320, 50);
        bCerrar.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
        bCerrar.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.4f));
        bCerrar.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        bCerrar.setBorderPainted(false);
        bCerrar.setFocusable(false);
        bCerrar.addActionListener(this);
        add(bCerrar);
        
        bRegresar = new JButton("");
        bRegresar.setBounds(100, 100, 40, 40);
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
        
        setVisible(true);
    }
    
    @Override
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("resources/iconapp.png"));
        return retValue;
    }
    
    public void actionPerformed(ActionEvent e) {
        String cadena = e.getActionCommand();
        if(cadena.equals("INFORMACIÓN PERSONAL")) {
            dispose();
            GPersonal infoper = new GPersonal();
        } else
            if(cadena.equals("CERRAR SESIÓN")) {
                dispose();
                GInicio ini = new GInicio();
            } else
                if(cadena.equals("")){
                    dispose();
                    GMenu menu = new GMenu(); 
                } 
    }
}
