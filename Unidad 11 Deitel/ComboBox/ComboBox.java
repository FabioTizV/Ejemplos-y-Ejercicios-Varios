package ComboBox;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBox extends JFrame
{

    private JComboBox imagenesJComboBox; // Cuadro combinado con los nombres de las imagenes.
    private JLabel etiqueta; // En esta etiqueta se mostrará la iamgen seleccionada.

    private String nombres[] = {"C:/Users/casa/Desktop/descarga", "C:/Users/casa/Desktop/descarga2", "C:/Users/casa/Desktop/descarga3", "C:/Users/casa/Desktop/descarga4"}; // Arreglo de cadenas donde estarán las direcciones de cada una de las imagenes que se usarán.

    private Icon iconos [] = //Creamos un arreglo de objetos Icon cuyas direcciones serán los objetos del arreglo de Strings del objeto "nombres".
    {
        // Creamos los objetos y les asignamos las direcciones de las imagenes.
        new ImageIcon(nombres[0]), 
        new ImageIcon(nombres[1]),
        new ImageIcon(nombres[2]),
        new ImageIcon(nombres[3])

    };

    public ComboBox()
    {

        super("Prueba de JComboBox"); // Título de la ventana.
        setLayout(new FlowLayout()); //Determinamos la relación del aspecto de la ventana.
        
        imagenesJComboBox = new JComboBox(nombres); // Establecemos el JComboBox.
        imagenesJComboBox.setMaximumRowCount(3); // Determinamos el máximo de filas posibles para el JComboBox.

        imagenesJComboBox.addItemListener
        (
            new ItemListener() //clase interna anonima.
            {

                public void itemStateChanged (ItemEvent evento)
                {

                    if (evento.getStateChange() == ItemEvent.SELECTED)
                    etiqueta.setIcon(iconos[imagenesJComboBox.getSelectedIndex()]);

                }
                
            } // Fin de la clase interna anonima que sirva como la implementaci+ón de una clase abstracta.
        
        );

        add (imagenesJComboBox); // Se agrega el componente a JFrame.
        etiqueta = new JLabel (iconos[0]); // Creamos el objeto y determinamos que empiece con la imagen de la posición 0.
        add (etiqueta); // Se agrega el componente a JFrame.
    }


}