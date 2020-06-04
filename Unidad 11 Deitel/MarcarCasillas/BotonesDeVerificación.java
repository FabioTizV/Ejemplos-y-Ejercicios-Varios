package MarcarCasillas;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class BotonesDeVerificación extends JFrame 
{

    private JTextField campoTexto; // Muestra el texto en tipos de letra cambiantes.
    private JCheckBox negritaJCheckBox; // Para seleccionar/deseleccionar negrita.
    private JCheckBox cursivaJCheckBox; // Para seleccionar/deseleccionar cursiva.

    // Instanciamos el constructor de la clase.
    public BotonesDeVerificación ()
    {

        super("Prueba de JCheckBox"); //Ponemos título a la ventana de GUI.
        setLayout( new FlowLayout()); // Determinamos la disposiciónd e la GUI.

        // Creamos el objeto establecemos el tipo de letra de JTextField.
        campoTexto = new JTextField ("Wacha como cambia el estilo de letra", 20); //Agregamos texto al JTextField y determinamos el ancho de la columna.
        campoTexto.setFont(new Font("Serif", Font.PLAIN, 14)); //Determinamos el nombre de la fuente, su estilo y el número de puntos.
        add (campoTexto); //Lo agregamos a la GUI/JFrame.

        negritaJCheckBox = new JCheckBox ("Blacky"); //Creamos la casilla de verificación y le asignamos el texto "Blacky".
        cursivaJCheckBox = new JCheckBox ("Cursiva"); //Creamos la casilla de verificación y le asignamos el texto "Cursiva".
        add (negritaJCheckBox); // La agregamos a la GUI/JFrame.
        add (cursivaJCheckBox); // La agregamos a la GUI/JFrame.

        ManejadorCheckBox manejador = new ManejadorCheckBox(); //Creamos nuevo ManejadorCheckBox para manejar los eventos de los JCheckBox.
        negritaJCheckBox.addItemListener(manejador); //Asignamos el mismo manejador para cada objeto.
        cursivaJCheckBox.addItemListener(manejador); //Asignamos el mismo manejador para cada objeto.


    }

    // Creamos la clase privada que responderá a los eventos sobre los objetos que añadimos a JFrame.
    private class ManejadorCheckBox implements ItemListener
    {

        private int valNegrita = Font.PLAIN; // Creamos un objeto de clase entero que manejará el tipo de letra negrita.
        private int valCursiva = Font.PLAIN; // Creamos un objeto de clase entero que manejará el tipo de letra cursiva.

        // Responde a los eventos de las casillas de verifiación
        public void itemStateChanged (ItemEvent evento) // El método itemStateChanged es llamado cuando el usuario hace clic en el objeto JCheckBox negrita o cursiva. Este método utiliza evento.getSource() para determinar en cuál de los objetos JCheckBox se hizo clic.
        {

            if (evento.getSource() == negritaJCheckBox)
            valNegrita = negritaJCheckBox.isSelected() ? Font.BOLD : Font.PLAIN; // Si fue en la casilla negritaJCheckBox,  se utiliza el método isSelected de JCheckBox para determinar si el botón está seleccionado (es decir, marcado).
            // Si es así, a la variable local valNegrita se le asigna Font.BOLD; en caso contrario, se le asigna Font.PLAIN.
            if (evento.getSource() == cursivaJCheckBox)
            valCursiva = cursivaJCheckBox.isSelected() ? Font.ITALIC : Font.PLAIN; // Si fue en la casilla negritaJCheckBox,  se utiliza el método isSelected de JCheckBox para determinar si el botón está seleccionado (es decir, marcado).
            // Si es así, a la variable local valCursiva se le asigna Font.ITALIC; en caso contrario, se le asigna Font.PLAIN.
            campoTexto.setFont (new Font("Serif", valNegrita + valCursiva, 14)); // Se cambia el tipo de letra del objeto JTextField, usandoel mismo nombre de tipo de letra y tamaño de punto. La suma de valNegrita y valCursiva representa el nuevoestilo de tipo de letra del objeto JTextField. Cada una de las constantes de Font representa un valor único. Font.PLAIN tiene el valor 0, por lo que si tanto valNegrita como valCursiva se establecen en Font.PLAIN, el tipo de letra tendrá el estilo simple. Si uno de los valores es Font.BOLD o Font.ITALIC, el tipo de letra estará en negrita o en cursiva, respectivamente. Si uno es BOLD y el otro es ITALIC, el tipo de letra estará en negrita y en cursiva
            
        }
    }

}