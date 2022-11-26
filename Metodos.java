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

public class Metodos {
    
    Vector vPrincipal = new Vector();
    
    public void guardarProducto(CProducto uProducto) {
        vPrincipal.add(uProducto);
    }
    
    public void guardarArchivo(CProducto Producto) {
        try {
            FileWriter fw = new FileWriter("Productos.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(Producto.getClave());
            pw.print("|" + Producto.getNombre());
            pw.print("|" + Producto.getUnidades());
            pw.println("|" + Producto.getPrecio());
            pw.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public DefaultTableModel listaProductos() {
        Vector headers = new Vector();
        headers.addElement("Clave");
        headers.addElement("Nombre");
        headers.addElement("Unidades");
        headers.addElement("Precio");
        
        DefaultTableModel modelTable = new DefaultTableModel(headers, 0);
        
        try {
            FileReader fr = new FileReader("Productos.txt");
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
