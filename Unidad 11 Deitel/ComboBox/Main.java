package ComboBox;

import javax.swing.JFrame;

public class Main 
{

    public static void main (String args[])
    {

        ComboBox comboBox = new ComboBox();
        comboBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        comboBox.setSize (1080, 960);
        comboBox.setVisible(true);

    }
    
}