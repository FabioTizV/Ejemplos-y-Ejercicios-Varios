package Listas;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

// Importamos las clases para poder usar sus métodos y atributos.
public class Listas extends JFrame
{

    private JList listaJListColores; // Instanciamos el objeto de clase JList.
    private final String nombresColores [] = // Creamos un arreglo de cadenas de caracteres y agregamos los nobres de los colores que queramos que aparezcan en nuestra JList.
    {

        "Negro",
        "Azul",
        "Cyan",
        "Gris Obscuro",
        "Gris",
        "Verde",
        "Gris Claro",
        "Magenta",
        "Naranja",
        "Rosa",
        "Rojo",
        "Blanco",
        "Amarillo"

    };

    private final Color colores [] = // Creamos un arreglo de objeto de tipo Color y agregamos los colores que el sistema tiene por defecto asociados a esa clase, de la misma manera que con el arreglo de cadenas de caracteres.
    {

        Color.BLACK,
        Color.BLUE,
        Color.CYAN,
        Color.DARK_GRAY,
        Color.GRAY,
        Color.GREEN,
        Color.LIGHT_GRAY,
        Color.MAGENTA,
        Color.ORANGE,
        Color.PINK,
        Color.RED,
        Color.WHITE,
        Color.YELLOW

    };

    public Listas() // Instanciamos el construcotr de la clase para crear el objeto de tipo JList.
    {

        super("Prueba de JList"); // Agregamos el título a la ventana.
        setLayout(new FlowLayout()); // //Se establece la manera de acomodo de la GUI.

        listaJListColores = new JList (nombresColores); // Crea la lista con los nombres de los colores tomando como argumento el arreglo de cadenas de caracteres antes instanciada.
        listaJListColores.setVisibleRowCount(5); // Muestra 5 filas a la vez.

        // Con este método será únicamente posible la selección de un objeto de la lista.
        listaJListColores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        add(new JScrollPane(listaJListColores)); // Agrega a la ventana un objeto de clase JScrollPane que contendrá la JList. // A diferencia de un objeto JComboBox, un objeto JList no proporciona una barra de desplazamiento si hay más elementos en la lista que el número de fi las visibles. En este caso se utiliza un objeto JScrollPane para proporcionar la capacidad de desplazamiento. El constructor de JScrollPane recibe como argumento el objeto JComponent que necesita funcionalidad de desplazamiento

        listaJListColores.addListSelectionListener // Instanciamos el escuchador de la lista.
        (

            new ListSelectionListener() // Inicio de la clase interna anónima.
            {

                public void valueChanged (ListSelectionEvent evento) // Maneja los eventos de selección de la lista
                {

                    getContentPane().setBackground(colores [listaJListColores.getSelectedIndex()]);
                    // Cada objeto JFrame en realidad consiste de tres niveles: el fondo, el panel de contenido y el panel de vidrio. El panel de contenido aparece en frente del fondo, y es en donde se muestran los componentes de la GUI en el objeto JFrame. El panel de vidrio se utiliza para mostrar cuadros de información sobre herramientas y otros elementos que deben aparecer enfrente de los componentes de la GUI en la pantalla. El panel de contenido oculta por completo el fondo del objeto JFrame; por ende, para cambiar el color de fondo detrás de los componentes de la GUI, debe cambiar el color de fondo del panel de contenido.

                }

            }

        );
        

    }


}