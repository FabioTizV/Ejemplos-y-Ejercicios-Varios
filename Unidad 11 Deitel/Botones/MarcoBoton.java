package Botones;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//Importamos todas las clases que necesitaremos para uzar sus métodos, atributos y poder crear obejtos de estas características.
public class MarcoBoton extends JFrame //Creamos la clase MarcoBoton que será una GUI, por lo que usaremos métodos y atributos de JFrame.
{

    private JButton botonSimple; 
    private JButton botonCool;
    //Instanciamos 2 objetos de tipo JButton.

    public MarcoBoton () //Creamos el constructor de la clase MarcoBoton.
    {

        super("Prueba de Botones"); //Se agrega el título a la ventana de la GUI.
        setLayout(new FlowLayout()); //Se establece la manera de acomodo de la GUI.

        botonSimple = new JButton("Boton Simple"); //Se crea el objeto botonSimple con el constructor de JButton y añadimos una etiqueta de texto a él.
        add(botonSimple); //Lo agregamos a la GUI.

        Icon leon1 = new ImageIcon("desktop/descarga.png"); 
        Icon leon2 = new ImageIcon("desktop/descarga2.png");
        //Creamos 2 objetos de clase Icon con su constructor y les ponemos su respectiva imagen.

        botonCool = new JButton("Boton Cool", leon1); //Creamos un objeto con el constructor de la clase botón, pero esta vez copn más parámetros, agregando uno de los icono antes creados.

        botonCool.setRolloverIcon(leon2); //establece la imagen de sustitución.

        add(botonCool); //Lo agregamos a la GUI.


        ManejadorBoton manejador = new ManejadorBoton(); //Creamos nuevo ManejadorBoton para manejar los eventos de botón
        botonSimple.addActionListener(manejador); 
        botonCool.addActionListener(manejador);
        //Asignamos un manejador de eventos para cada boton.

    }

    //Clase interna para manejar eventos de botón
    private class ManejadorBoton implements ActionListener
    {

        public void actionPerformed (ActionEvent evento) //Maneja evento de botón
        {

            JOptionPane.showMessageDialog(MarcoBoton.this, String.format ("Usted oprimió: %s", evento.getActionCommand())); //Cuando se presiona alguno de los botones mostrará un panel de dialogo donde a partir del origen del evento dará información de este mediante el objeto del evento, que encapsulará la información de lo que se hizo. getActionCommand devuelve la etiqueta del botón.

        }

    }

}

