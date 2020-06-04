import javax.swing.JFrame;

public class Main 
{

    public static void main(String args[]) 
    {

        Etiqueta marcoEtiqueta = new Etiqueta(); //Creamos el objeto "marcoEtiqueta" con el contructor de "Etiqueta".
        marcoEtiqueta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Utilizamos el método de operación por default de ventanas (los cuadros de la esquina superior derecha), además le decimos al programa que termine de ejecutarse cuando la ventana se cierre.
        marcoEtiqueta.setSize (300, 280); //Definimos el tamaño de la ventana.
        marcoEtiqueta.setVisible (true); //Hacemos que la ventana sea visible.

    }
    
}