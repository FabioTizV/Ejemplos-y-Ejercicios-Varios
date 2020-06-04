package RadioBotones;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioBotones extends JFrame
{

    private JTextField campoTexto; // Instanciamos un objeto que vamos a utilizar para mostrar los cambios en el tipo de letra
    private Font letrasSimple; 
    private Font letraNegrita;
    private Font letraCursiva;
    private Font letraNegritaCursiva;

    // Creamos los tipos de letra que vamos a utilizar.

    private JRadioButton simpleJRadioButton;
    private JRadioButton negritaJRadioButton;
    private JRadioButton cursivaJRadioButton;
    private JRadioButton negritaCursivaJRadioButton;
    private ButtonGroup grupoOpciones; // Instanciamos el grupo de botones que contednrá los botones de opción.

    // Instanciamos los botones que nos ayduarán a seleccioanr el tipo de letra en la GUI.
    
    // Instanciamos el consctructor de la clase superior.
    public RadioBotones ()
    {

        super("Prueba de RadioButton"); // Le agregamos un título a la ventana.
        setLayout(new FlowLayout()); // Determinamos la disposición de la ventana.

        campoTexto = new JTextField ("Observa como cambia el texto al seleccionar un botón diferente", 35); //Creamos un objeto de la clase JTextField con su debido constructor y le asignamos una leyenda y un ancho de columna.
        add (campoTexto); // Añadimos el objeto a la ventana.
        
        //Creamos los objetos JRadioButton y los añadimos a la ventana.

        simpleJRadioButton = new JRadioButton ("Simple", true); // El priemr parametro es la leyenda o etiqueta que tendrá el bot+on, la segunda, es el estado en el que se encontrará "Seleccionado" o "No seleccionado". En este caso, si ponemos todos en true, se quedará con la primera opción que determinamos como "True".
        negritaJRadioButton = new JRadioButton ("Negrita", true);
        cursivaJRadioButton = new JRadioButton ("Cursiva", true);
        negritaCursivaJRadioButton = new JRadioButton ("Negrita y Cursiva", true);
        add (simpleJRadioButton);
        add (negritaJRadioButton);
        add (cursivaJRadioButton);
        add (negritaCursivaJRadioButton);

        // Creamos una relación lógica entre todos los objetos de JRadioButton y agregamos cada botón al grupo para que de esta manera sólo pueda seleccioanrse uno por vez.
        
        grupoOpciones = new ButtonGroup();
        grupoOpciones.add (simpleJRadioButton); // Agregamos el botón al grupo.
        grupoOpciones.add (negritaJRadioButton); // Agregamos el botón al grupo.
        grupoOpciones.add (cursivaJRadioButton); // Agregamos el botón al grupo.
        grupoOpciones.add (negritaCursivaJRadioButton); // Agregamos el botón al grupo.

        // Creamos los tipos de letra.

    
        letrasSimple = new Font("Serif", Font.PLAIN, 14);
        letraNegrita = new Font("Serif", Font.BOLD, 14);
        letraCursiva = new Font ("Serif", Font.ITALIC, 14);
        letraNegritaCursiva = new Font ("Serif", Font.BOLD + Font.ITALIC, 14);
        campoTexto.setFont(letrasSimple);

        // Añadimos el escuchador de eventos para los objetos de tipo JRadioButton.
        simpleJRadioButton.addItemListener(new ManejadorBotonOpcion (letrasSimple));
        negritaJRadioButton.addItemListener(new ManejadorBotonOpcion(letraNegrita));
        cursivaJRadioButton.addItemListener(new ManejadorBotonOpcion(letraCursiva));
        negritaCursivaJRadioButton.addItemListener(new ManejadorBotonOpcion(letraNegritaCursiva));
    }

    //Creamos la clase para manejar los eventos de botones de opción.

    //La clase ManejadorBotonOpcion implementa la interfaz ItemListener para poder manejar los eventos ItemEvent generados por los objetos JRadioButton.

    private class ManejadorBotonOpcion implements ItemListener
    {

        private Font tipoLetra; // Objeto de tipo Font que se asociará con el componente de escucha de eventos.
        
        // El constructor almacena el objeto Font que recibe como un argumento en la variable de instancia tipoLetra del objeto componente de escucha de eventos.
        public ManejadorBotonOpcion(Font f) // Podemos notar que en esta línea se le asigna el Manejador de evento con su fuente predeterminada de las líneas 70 a 73, entonces "f" será igual al objeto de tipo Font que se le asigna en esas líneas.
        {

            tipoLetra = f; // "Tipo de letra" será igual a "f" y "f" será igual a lo que se explica en la líena 83.

        }

        public void itemStateChanged (ItemEvent evento) // Este método implementará alguna acción cuando un elemento sea selecionado o deseleccinado por el usuario.
        {

            campoTexto.setFont(tipoLetra);

        }
    }

}