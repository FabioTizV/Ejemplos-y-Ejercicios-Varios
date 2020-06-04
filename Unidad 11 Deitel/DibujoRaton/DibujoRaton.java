package DibujoRaton;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

import sun.font.GraphicComponent;

public class DibujoRaton extends JPanel
{

    private int cuentaPuntos = 0;

    // Arreglo de 10,000 referencias a java.awt.Point.
    private Point puntos [] = new Point[ 10000 ];

    // Establece la GUI y registra el manejador de eventos del ratón.
    public DibujoRaton()
    {

        // Maneja evento de movimiento del ratón en el marco.
        addMouseMotionListener
        (

            new MouseMotionAdapter()
            {
                public void mouseDragged (MouseEvent evento)
                {

                    if (cuentaPuntos < puntos.length)
                    {

                        puntos[cuentaPuntos] = evento.getPoint(); // Busca el punto
                        cuentaPuntos ++; // Incrementa el número de puntos en el arreglo
                        repaint(); // vuelve a dibujar JFrame

                    }
                
                }
            }
        
        );

    }

    public void paintComponent (Graphics g)
    {

        super.paintComponent(g); // Borra el área de dibujo.

        // Dibuja todos los puntos en el arreglo.
        for ( int i = 0; i < cuentaPuntos; i++)
            g.fillOval (puntos[i].x, puntos[i].y,4,4);

    }
    
}