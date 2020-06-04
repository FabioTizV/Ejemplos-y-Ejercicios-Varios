package RastrearMouse;

import javax.swing.JFrame;

public class Main 
{

    public static void main (String args[])
    {

        RastrearMouse rastrearMouse = new RastrearMouse();
        rastrearMouse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rastrearMouse.setSize(300,100);
        rastrearMouse.setVisible(true);

    }

    
}