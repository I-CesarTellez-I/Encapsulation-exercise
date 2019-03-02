/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;

import Paquete1.Empleados;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class Other {
   
    public static void main(String[] args) {
        String opci0n=JOptionPane.showInputDialog("Bienvenido.\nEste programa permite guardar los datos de 5 empleados.\nElige una opcion:\n1.-Comenzar.\n2.-Salir.");
        if(opci0n.equalsIgnoreCase("uno")||opci0n.equalsIgnoreCase("1")){
        //The constructor is created with its respective object. In addition, the data is requested.
        Empleados emp1 = new Empleados(JOptionPane.showInputDialog("Empleado 1\nIngrese el nombre: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: ")), JOptionPane.showInputDialog("Ingrese la dirección: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese su teléfono: ")));
        Empleados emp2 = new Empleados(JOptionPane.showInputDialog("Empleado 2\nIngrese el nombre: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: ")), JOptionPane.showInputDialog("Ingrese la dirección: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese su teléfono: ")));
        Empleados emp3 = new Empleados(JOptionPane.showInputDialog("Empleado 3\nIngrese el nombre: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: ")), JOptionPane.showInputDialog("Ingrese la dirección: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese su teléfono: ")));
        Empleados emp4 = new Empleados(JOptionPane.showInputDialog("Empleado 4\nIngrese el nombre: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: ")), JOptionPane.showInputDialog("Ingrese la dirección: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese su teléfono: ")));
        Empleados emp5 = new Empleados(JOptionPane.showInputDialog("Empleado 5\nIngrese el nombre: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: ")), JOptionPane.showInputDialog("Ingrese la dirección: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese su teléfono: ")));
        //After the data is already stored in memory, the user is asked if he wants to see the data of an employee. If you type "yes" the respective data will be displayed, otherwise the program will be finalized.
        String opcion =JOptionPane.showInputDialog("Desea ver los datos de un empleado?: ");
        if(opcion.equalsIgnoreCase("si")){
        String opcion3;
        do{
        String opcion2 =JOptionPane.showInputDialog("Elija el Empleado: \nEmpleado 1\nEmpleado 2\nEmpleado 3\nEmpleado 4\nEmpleado 5");
        if(opcion2.equalsIgnoreCase("uno")||opcion2.equals("1")){
         JOptionPane.showMessageDialog(null,"Empleado 1\nNombre: "+emp1.getNombre()+"\nEdad: "+emp1.getEdad()+"\nDirección: "+emp1.getDireccion()+"\nTeléfono: "+emp1.getTelefono());
         }
        if(opcion2.equalsIgnoreCase("dos")||opcion2.equals("2")){
         JOptionPane.showMessageDialog(null,"Empleado 2\nNombre: "+emp2.getNombre()+"\nEdad: "+emp2.getEdad()+"\nDirección: "+emp2.getDireccion()+"\nTeléfono: "+emp2.getTelefono());
         }
        if(opcion2.equalsIgnoreCase("tres")||opcion2.equals("3")){
         JOptionPane.showMessageDialog(null,"Empleado 3\nNombre: "+emp3.getNombre()+"\nEdad: "+emp3.getEdad()+"\nDirección: "+emp3.getDireccion()+"\nTeléfono: "+emp3.getTelefono());
         }
        if(opcion2.equalsIgnoreCase("cuatro")||opcion2.equals("4")){
         JOptionPane.showMessageDialog(null,"Empleado 4\nNombre: "+emp4.getNombre()+"\nEdad: "+emp4.getEdad()+"\nDirección: "+emp4.getDireccion()+"\nTeléfono: "+emp4.getTelefono());
         }
        if(opcion2.equalsIgnoreCase("cinco")||opcion2.equals("5")){
         JOptionPane.showMessageDialog(null,"Empleado 5\nNombre: "+emp5.getNombre()+"\nEdad: "+emp5.getEdad()+"\nDirección: "+emp5.getDireccion()+"\nTeléfono: "+emp5.getTelefono());
         }
        opcion3 = JOptionPane.showInputDialog("Desea ver otro empleado?");
        }while(opcion3.equalsIgnoreCase("si")||opcion3.equalsIgnoreCase("yes"));
        }else
           JOptionPane.showMessageDialog(null,"Gracias por interactuar.\nHasta pronto.");
           System.exit(0);
        }
    }
}
