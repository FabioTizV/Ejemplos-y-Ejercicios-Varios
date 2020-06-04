package ClaseAdaptadora;

import javax.swing.JFrame;

public class Main 
{

    public static void main (String args[])
    {

        ClaseAdaptadora claseAdaptadora = new ClaseAdaptadora();
        claseAdaptadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        claseAdaptadora.setSize(500,500);
        claseAdaptadora.setVisible(true);

    }
}