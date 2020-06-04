package ClaseAdaptadora;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.MouseInputAdapter;

public class ClaseAdaptadora extends JFrame
{

    private String detalles; // JLbael que mostrará lo que queramos que muestre.
    private JLabel barraEstado;

    // constructor establece String de la barra de título y registra componente de escucha del ratón
    public ClaseAdaptadora()
    {

        super("Ejemplo de Clase Adaptadora");

        barraEstado = new JLabel ("Haga click en el ratón");
        add(barraEstado, BorderLayout.SOUTH);
        addMouseListener(new ManejadorRaton ());

    }

    // Clase interna para manejar los eventos del ratón

    private class ManejadorRaton extends MouseInputAdapter
    {

        // Maneja evento de clic del ratón y determina cuál botón se oprimió
        public void mouseClicked( MouseEvent evento)
        {

            int xPos = evento.getX();
            int yPos = evento.getY();

            detalles = String.format ("Se hizo click %d vez(veces)", evento.getClickCount());

            if (evento.isMetaDown())
            detalles += "con el boton derecho del ratón";
            else if (evento.isAltDown())
            detalles += "con el botón central del ratón";
            else
            detalles += "con el botón izquierdo del ratón";

            barraEstado.setText(detalles);
        }

    }
}