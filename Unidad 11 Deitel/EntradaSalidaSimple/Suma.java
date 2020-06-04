package EntradaSalidaSimple;

import javax.swing.JOptionPane; //Importamos JOptionPane para que pueda ser usado en la clase.


public class Suma
{

    public static void main (String args[])
    {

        String primerNum = JOptionPane.showInputDialog("introduzca el primer numero:"); //Usamos JoptionPane para adquirir desde el teclado un a cadena de caracteres y damos un mensaje al usuario.
        String segundoNum = JOptionPane.showInputDialog("Introduzca el segundo numero:"); //Usamos JoptionPane para adquirir desde el teclado un a cadena de caracteres y damos un mensaje al usuario.

        //NOTA: Un InputDialog sólo puede admitir datos de tipo String.

        int numero1 = Integer.parseInt(primerNum); //Se convierte la cadena de caracteres a un entero y se le asigna a una nueva variable.
        int numero2 = Integer.parseInt(segundoNum); //Se convierte la cadena de caracteres a un entero y se le asigna a una nueva variable.

        int suma = numero1 + numero2;

        JOptionPane.showMessageDialog (null, "La suma es: " + suma, "Suma de 2 enteros",JOptionPane.PLAIN_MESSAGE); //JOptionPane.showMessageDialog(¿Dónde se muestra el diálogo?, mensaje de la ventana, título, tipo de mensaje);

    }

}