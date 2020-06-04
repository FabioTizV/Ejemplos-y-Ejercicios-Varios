package RadioBotones;

import javax.swing.JFrame;

import Botones.MarcoBoton;

public class Main 
{

    public static void main (String args[])
    {

        RadioBotones radioBotones = new RadioBotones();
        radioBotones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        radioBotones.setSize(400,300);
        radioBotones.setVisible(true);

    }
    
}