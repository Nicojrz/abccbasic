package ABCCbasic;

/**
 *  Autores
 *  Cardoso Hernandez Edith Alejandra
 *  Juarez Barrios Axel Nicolas 
 *  Zuñiga Aguilar Saul
 */

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class MetodosCarrito {
    
    Vector vCarrito = new Vector();
    
    public void guardarCarrito(CCarrito uCarrito) {
        vCarrito.add(uCarrito);
    }
    
    public void guardarArchivoCarrito(CCarrito Carrito) {
        try {
            FileWriter fw = new FileWriter("Carrito.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(Carrito.getClave());
            pw.print("|" + Carrito.getNombre());
            pw.println("|" + Carrito.getCompradas());
            pw.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public DefaultTableModel listaCarrito() {
        Vector headersC = new Vector();
        headersC.addElement("Clave");
        headersC.addElement("Nombre");
        headersC.addElement("Unidades compradas");
        
        DefaultTableModel modelTable = new DefaultTableModel(headersC, 0);
        
        try {
            FileReader fr = new FileReader("Carrito.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d = br.readLine())!=null) {
                StringTokenizer dato = new StringTokenizer(d, "|");
                Vector x = new Vector();
                while(dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                modelTable.addRow(x);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return modelTable;
    }
}
