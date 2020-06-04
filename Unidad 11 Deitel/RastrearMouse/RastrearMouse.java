package RastrearMouse;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RastrearMouse extends JFrame
{

    private JPanel panelRaton; // Instanciamos el objeto de tipo JPanel.
    private JLabel barraEstado; // Instanciamos el objeto de tipo JLabel;

    // El constructor de RastrearMouse establece la GUI y registra los manejadores de eventos de ratón.
    public RastrearMouse()
    {

        super("Prueba de los eventos de ratón");
        
        panelRaton = new JPanel();
        panelRaton.setBackground(Color.WHITE);
        add(panelRaton, BorderLayout.CENTER); // Agregamos el panel a JFrame. Aquí utilizamos el esquema predeterminado del panel de contenido de un objeto JFrame: BorderLayout
        // Este administrador de esquemas ordena los componentes en cinco regiones: NORTH, SOUTH, EAST, WEST y CENTER.
        barraEstado = new JLabel("Ratón fuera del panel");
        add(barraEstado, BorderLayout.SOUTH); // Agregamos la etiqueta  JFrame.

        // crea y registra un componente de escucha para los eventos de ratón y de su movimiento
        ManejadorRaton manejador = new ManejadorRaton(); // Se crea una instancia de la clase interna ManejadorRaton llamada manejador, la cual responde a los eventos de ratón. En las líneas 32 y 33 se registra manejador como el componente de escucha para los eventos de ratón de panelRaton.
        panelRaton.addMouseListener(manejador);
        panelRaton.addMouseMotionListener(manejador);

    }

    private class ManejadorRaton implements MouseListener, MouseMotionListener // Heredamos métodos de dos clases abstractas, por lo que entonces el método ManejadorRaton es tanto un MouseListener como MouseMotionListener.
    {

        // Los manejadores de eventos de MouseListener 
    
        public void mouseClicked(MouseEvent evento) // Manejan el evento cuando se suelta el ratón justo después de oprimir el botón
        {

            barraEstado.setText(String.format("Se hizo un click en [%d, %d]", evento.getX(), evento.getY())); // los métodos getX y getY devuelven las coordenadas del mouse en el momento que ocurre el evento.

        }

        public void mousePressed (MouseEvent evento) // Maneja evento cuando se oprime el ratón
        {

            barraEstado.setText(String.format("Se oprimió en [%d, %d]", evento.getX(), evento.getY()));

        }

        
        public void mouseReleased( MouseEvent evento ) // Maneja evento cuando se suelta el botón del ratón después de arrastrarlo
        {

            barraEstado.setText( String.format( "Se solto en [%d, %d]",evento.getX(), evento.getY()));
   
        }

        public void mouseEntered (MouseEvent evento) // Maneja evento cuando el ratón entra al área
        {

            barraEstado.setText(String.format("Ratón entró en [%d, %d]", evento.getX(), evento.getY()));
            panelRaton.setBackground( Color.BLUE);
        }

        public void mouseExited(MouseEvent evento)
        {

            barraEstado.setText("Ratón fuera de JPanel");
            panelRaton.setBackground(Color.WHITE);

        }

        // Los manejadores de eventos de MouseMotionListener manejan el evento cuando el usuario arrastra el ratón con el botón oprimido

        public void mouseDragged(MouseEvent evento)
        {

            barraEstado.setText(String.format("Se arrastró el ratón en [%d, %d]", evento.getX(), evento.getY()));

        }

        public void mouseMoved (MouseEvent evento) // Maneja evento cuando el usuario mueve el ratón
        {

            barraEstado.setText(String.format("Se movió en [%d, %d]", evento.getX(), evento.getY()));

        }


    }
}