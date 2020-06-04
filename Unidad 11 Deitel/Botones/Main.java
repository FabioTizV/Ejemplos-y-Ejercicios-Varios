package Botones;
import javax.swing.JFrame;

//Importamos la clase para poder usarla.

public class Main 
{

    public static void main (String args[])
    {

        MarcoBoton marcoBoton = new MarcoBoton(); // Creamos un objeto de tipó MarcoBoton con su debido constructor.
        marcoBoton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Asignamos el tipo de operación que tendrá el programa y la GUI.
        marcoBoton.setSize(300,200); // Asignamos los valores de tamaño para la ventana
        marcoBoton.setVisible(true); // Hacemos que la ventana sea visible.
        
    }
    
}