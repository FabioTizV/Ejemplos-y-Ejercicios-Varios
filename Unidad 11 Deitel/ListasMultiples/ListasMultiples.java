package ListasMultiples;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class ListasMultiples extends JFrame
{

    private JList listaJListColores; // Lista para almacenar los nombres de los colores.
    private JList listaJListCopia; // Lista en la que se copiarán los nombres de los colores.
    private JButton botonJButtonCopiar; // Botón para copiar los nombres seleccionados.
    private final String nombresColores[] =
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

    // Método constructor de ListasMultiples
    public ListasMultiples()
    {

        super("Prueba de JList Selección Múltiple"); // Título de la ventana.
        setLayout(new FlowLayout()); // Disposición de la ventana.

        listaJListColores = new JList (nombresColores); // Creamos la lista con los nombres de los colores del arreglo de cadenas de caracteres como argumento.
        listaJListColores.setVisibleRowCount(5); // Hacemos que muestre únicamente 5 elementos.
        listaJListColores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Seleccionamos el métodod e selección de la lista.
        add (new JScrollPane(listaJListColores)); //Agrega la lista con un panel de desplazamiento.

        botonJButtonCopiar = new JButton ("COPIAR >>>"); // Creamos el botón para copiar.
        botonJButtonCopiar.addActionListener
        (

            new ActionListener() // Clase interna anónima.
            {

                // Manejo evento de botón.
                public void actionPerformed (ActionEvent evento)
                {

                    // Coloca los valores seleccionados en la listaJListCopia
                    listaJListCopia.setListData(listaJListColores.getSelectedValues()); // Cuando el usuario hace clic en botonJButtonCopiar, el método actionPerformed utiliza el método setListData de JList para establecer los elementos mostrados en listaJListCopia
                    // se hace una llamada al método getSelectedValues de listaJListColores, el cual devuelve un arreglo de objetos Object que representan los elementos seleccionados en listaJListColores.
                }

            }

        );

        add(botonJButtonCopiar); // Agreag el botón copiar a JFrame.

        listaJListCopia = new JList(); // Creamos lista para guardar nombres de colores copiados.
        listaJListCopia.setVisibleRowCount(5); // Muestra 5 filas.
        listaJListCopia.setFixedCellWidth(100); // Se utiliza el método setFixedCellWidth de JList para establecer la anchura de listaJListCopia en 100 píxeles.
        listaJListCopia.setFixedCellHeight(15); // Se utiliza el método setFixedCellHeight de JList para establecer la altura de cada elemento en el objeto JList a 15 píxeles.
        listaJListCopia.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(listaJListCopia));

    }
    // Una lista de selección múltiple no tiene eventos para indicar que un usuario ha realizado varias selecciones. Normalmente, un evento generado por otro componente de la GUI (lo que se conoce como un evento externo) especifica cuándo deben procesarse las selecciones múltiples en un objeto JList. En este ejemplo, el usuario hace clic en el objeto JButton llamado botonJButtonCopiar para desencadenar el evento que copia los elementos seleccionados en listaJListColores a listaJListCopia.

}