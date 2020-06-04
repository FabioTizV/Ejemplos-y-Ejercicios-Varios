package MarcarCasillas;

import javax.swing.JFrame;

public class Main 
{

    public static void main (String args[])
    {

        BotonesDeVerificación botonesDeVerificación = new BotonesDeVerificación();
        botonesDeVerificación.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        botonesDeVerificación.setSize (300, 200);
        botonesDeVerificación.setVisible (true);

    }
    
}