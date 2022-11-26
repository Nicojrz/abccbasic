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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GPersonal extends JFrame implements Serializable, ActionListener  {
    
    ImageIcon iconEdit = new ImageIcon(this.getClass().getResource("/resources/editar.png"));
    Image imgEdit = iconEdit.getImage();
    ImageIcon edit = new ImageIcon(imgEdit);
    
    ImageIcon iconSave = new ImageIcon(this.getClass().getResource("/resources/guardar.png"));
    Image imgSave = iconSave.getImage();
    ImageIcon save = new ImageIcon(imgSave);
    
    JLabel lTitulo, lUser, lPassword, lNueva;
    JButton bRegresar;
    JTextField fUser, fPassword;
    
     public GPersonal() {
        configurarVentana();
        iniciarComp();
    }
    
    public void configurarVentana() {
        setTitle("Mi información personal");
        setBounds(50, 50, 720, 560);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        this.getContentPane().setBackground(Color.getHSBColor(0.1f, 0.1f, 0.15f));
    }
    
    public void iniciarComp() {
        
        
        lTitulo = new JLabel("Mi información");
        lTitulo.setBounds(180, 80, 500, 60);
        lTitulo.setFont(new Font("Arial", Font.BOLD, 48));
        lTitulo.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        add(lTitulo);
        
        lUser = new JLabel("Usuario:");
        lUser.setBounds(100, 160, 600, 100);
        lUser.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
        lUser.setForeground(Color.getHSBColor(0.0f, 0.0f, 0.4f));
        add(lUser);
        
        fUser = new JTextField("admin");
        fUser.setBounds(100, 240, 400, 36);
        fUser.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
        fUser.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.2f));
        fUser.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        fUser.setDisabledTextColor(Color.getHSBColor(0.0f, 0.0f, 0.4f));
        fUser.setEnabled(false);
        add(fUser);
        
        lPassword = new JLabel("Contraseña:");
        lPassword.setBounds(100, 280, 600, 100);
        lPassword.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
        lPassword.setForeground(Color.getHSBColor(0.0f, 0.0f, 0.4f));
        add(lPassword);
        
        fPassword = new JTextField("password");
        fPassword.setBounds(100, 360, 400, 36);
        fPassword.setFont(new Font("Bahnschrift", Font.BOLD, 18));
        fPassword.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.2f));
        fPassword.setForeground(Color.getHSBColor(0.0f, 0.0f, 1.0f));
        fPassword.setDisabledTextColor(Color.getHSBColor(0.0f, 0.0f, 0.4f));
        fPassword.setEnabled(false);
        add(fPassword);
        
        bRegresar = new JButton("");
        bRegresar.setBounds(100, 90, 40, 40);
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
        
        ImageIcon iconSave = new ImageIcon(this.getClass().getResource("/resources/guardar.png"));
        Image imgSave = iconSave.getImage();
        ImageIcon save = new ImageIcon(imgSave);
        
        String cadena = e.getActionCommand();
        if(cadena.equals("")) {
            GAjustes usr = new GAjustes();
            dispose();
        }
    }
}
