package ABCCbasic;

/**
 *  Autores
 *  Cardoso Hernandez Edith Alejandra
 *  Juarez Barrios Axel Nicolas 
 *  Zuñiga Aguilar Saul
 */

public class CCarrito {
    
    int clave;
    String nombre;
    int compradas;

    public CCarrito(int clave, String nombre, int compradas) {
        this.clave = clave;
        this.nombre = nombre;
        this.compradas = compradas;
    }
    
    CCarrito() {
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCompradas() {
        return compradas;
    }

    public void setCompradas(int compradas) {
        this.compradas = compradas;
    }
}
