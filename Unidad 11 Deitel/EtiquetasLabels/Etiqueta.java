import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

//Importamos todas las clases para su uso, cada una con métodos y atributos quizás iguales, pero con otros específicos, dado que casi todas vienen de Swing.
public class Etiqueta extends JFrame //Hacemos que la clase "Etiqueta" herede de la clase JFrame, de manera que obtnga sus métodos y atributos.
{

    private JLabel etiqueta1; 
    private JLabel etiqueta2;
    private JLabel etiqueta3;

    //Creamos Variables.

    public Etiqueta() //Creamos el constructor de la clase Etiqueta.
    {

        super("Prueba de JLabel"); //Agregamos el títuto a la GUI.
        setLayout(new FlowLayout()); //Establecemos el marco con el que vamos a trabajar en la GUI.

        //Construimos la primer etiqueta con únicamente valores o argumentos de tipo String.

        etiqueta1  = new JLabel ("Etiqueta con texto"); //Con este constructor agregamos unicamente texto a la etiqueta.
        etiqueta1.setToolTipText("Esta es la etiqueta 1"); //Agregamos algún texto que queramos que muestre al estar el puntero encima de la etiqueta.
        add(etiqueta1); //La añadimos a Labelframe

        //Construimos la segunda  etiqueta, esta vez utilizando un icono, String y alineación.

        Icon insecto = new ImageIcon("C:/Users/casa/Desktop/descarga.png"); //Creamos una variable que contenga el "Icono" o "Imagen" que mostrará la etiqueta.
        etiqueta2 = new JLabel ("Etiqueta con texto e icono", insecto, SwingConstants.LEFT); //Esta vez, usamos un contructor diferente, en el cual el primer campo es apra texto, el siguiente para el icono/imagen y finalmente la alineación.
        etiqueta1.setToolTipText("Esta es la etiqueta 2"); //Agregamos algún texto que queramos que muestre al estar el puntero encima de la etiqueta.
        add(etiqueta2); //La añadimos a Labelframe

        etiqueta3 = new JLabel(); //Creamos la etiqueta con un constructor diferente.
        etiqueta3.setText ("Etiqueta con icono y texto en la parte superior"); //Definimos el texto para la etiqueta.
        etiqueta3.setIcon (insecto); //Seleccionamos el "icono" para la etiqueta.
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER); //Seleccionamos la posición o alineación del texto respecto a la imagen.
        etiqueta3.setVerticalTextPosition(SwingConstants.TOP); //Seleccionamos la posición del texto respecto a la imagen.
        etiqueta3.setToolTipText("Esta es la etiqueta 3");  //Agregamos algún texto que queramos que muestre al estar el puntero encima de la etiqueta.
        add(etiqueta3); //La añadimos a Labelframe


    }

}