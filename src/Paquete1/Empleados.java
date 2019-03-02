
package Paquete1;

//import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class Empleados {
   //Global variables are created.
   private String nombre;
   private int edad;
   private String direccion;
   private long telefono;
   
   public Empleados(String nombre,int edad,String direccion,long telefono){
     //The variables are initialized.
     this.nombre=nombre;
     this.edad=edad;
     this.direccion=direccion;
     this.telefono=telefono;
     
   }

    /**
     * @return the nombre
     */
   //Encapsulate: Feature of POO. Attributes are protected, in this case the data hosted in the global variables.
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public long getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}
