package DibujoRaton;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main
{

    public static void main (String args[])
    {

        JFrame aplicación = new JFrame("Programa para dibujar");

        DibujoRaton dibujoRaton = new DibujoRaton();
        aplicación.add(dibujoRaton, BorderLayout.CENTER);

        aplicación.add(new JLabel("Arrastra el ratón para dibujars"), BorderLayout.SOUTH);

        aplicación.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicación.setSize(400,200);
        aplicación.setVisible(true);

    }
    
}