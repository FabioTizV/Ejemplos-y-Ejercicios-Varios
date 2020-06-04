package ManejoDeEventos;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

//Importamos todas las clases que necesitaremos apra el programa.

public class CampoTextoMarco extends JFrame //Creamos la clase y ahcemos que herede de JFrame.
{

    private JTextField campoTexto1; // Creamos el objeto de campoTexto1 con la clase JTextField.
    private JTextField campoTexto2; // Creamos el objeto de campoTexto2 con la clase JTextField.
    private JTextField campoTexto3; // Creamos el objeto de campoTexto3 con la clase JTextField.
    private JPasswordField campoContra; // Creamos el objeto de campoContra con la clase JPasswordField.

    public CampoTextoMarco ()
    {

        super("Prueba de JTextField y JPasswordField"); //Título de la ventana GUI.
        setLayout(new FlowLayout()); //Tipo de acomodo que le pondremos, en este caso FlowLayout.

        campoTexto1 = new JTextField(10); //Construye un campo de texto con 10 columnas.
        add (campoTexto1); //Agrega el campo de texto a JFrame.

        campoTexto2 = new JTextField("Escriba el texto aquí"); //Construye un campo de texto con una leyenda predeterminada.
        add (campoTexto2); //Agrega el campo de texto a JFrame.

        campoTexto3 = new JTextField("Campo de texto no editable", 20); //Construye un campo de texto con una leyenda predeterminada y 20 columnas.
        campoTexto3.setEditable(false); //Método para setear si el campo será editable o no, en este caso con "False" es NO editable.
        add (campoTexto3); //Agrega el campo de texto a JFrame.

        campoContra = new JPasswordField ("Texto Oculto"); //Construye un campo de contraseña con una leyenda predeterminada.
        add (campoContra); //Agrega el campo de contraseña a JFrame.

        //Registra los manejadores de texto de tal manera que se crea un esuchador para cada camp de texto y el contraseña. El escuchador es el mismo y ghará diferentes acciones según suceda el evento.
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();

        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
        campoContra.addActionListener(manejador);

    }

    private class ManejadorCampoTexto implements ActionListener //Creamos la clase privada para el manejo de evento, implementando la clase abstracta ActionListener.
    {

        public void actionPerformed(ActionEvent evento) //Este método procesa los evenrtps de cada cam´po de texto y contraseña dento de la GUI.
        {

            String cadena = ""; //Creamos un objeto que contendrá el mensaje a mostrar, este cambiará de acuerdo al evento.

            //Se crea el if para, dependiendo del evento, este haga diferentes acciones, que básicamente es asignarle al objeto "cadena", lo que contenga el campo de texto o contraseña que esté "enfocado" y se le de "enter".
            if (evento.getSource() == campoTexto1)
                cadena = String.format("Quizo decir: %s",evento.getActionCommand());
            
            else if (evento.getSource() == campoTexto2)
                cadena = String.format("Usted introdujo: %s",evento.getActionCommand());
            
            else if (evento.getSource() == campoTexto3)
                cadena = String.format("El campo dice: %s",evento.getActionCommand());

            else if (evento.getSource() == campoContra)
                cadena = String.format("La contraseña es: %s",new String (campoContra.getPassword()));

            JOptionPane.showMessageDialog (null, cadena); //Muestra un mensaje en pantalla con lo que se encuentra en el objeto "cadena".

        }

    }

}