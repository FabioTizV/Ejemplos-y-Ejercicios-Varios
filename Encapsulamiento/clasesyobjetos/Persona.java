package clasesyobjetos;

public class Persona
{

    //Antes de los métodos, como l son los contructores, se colocan los atributos de la clase.
    // Recordar poner los acceso en tipo "Public" para que se pueda acceder desde el main.
    private String nombre;
    private double masa;
    private double altura;
    private int edad;

    //Métodos

        //Get y Set son métodos universales para conseguir los atributos de un objeto y el otro para establecerlos respectivamente.
        //Estos se utilizan cuando encapsulamos una clase y queremos acceder a los atributos desde otra.
        //Debemos codificar los métodos en la clase con tipo de acceso público para pode utilziarlos en otras clases.
        //De esta manera, por ejemplo, podemos establecer los valores de uno o más atributos de esta clase desde la clase Main.
        //Y de la misma manera, podemos obtener el valor de un atributo de umn objeto y asignarselo a una variable en otra clase.

        //Los métodos son acciones posibles a realizar de cada clase, get, set y los contructores son métodos.
        //Los métodos son partes de las clases y a su vez, las clases pueden interactuar entre sí, pero depende del tipo de acceso de cada una de ellas.
        //El encapsulamiento sirve para tener una manera más hérmetico nuestro espacio y cuando las variables o atributos tienen tipos de acceso "private" o "protected" se usan los métodos Set y Get para poder 1) Establcer nuevows valores a los atributos o variables y 2) Obtenr los valores de dichas variables o atributos respectivamente.
    public void setNombre(String nombre) // Las variables dentro de los parametros de los métodos set son utilizadas UNICAMENTE dentro del método SET.
    {

        this.nombre = nombre; //Con "THIS" se refiere a la variable global "edad" aunque tenga el mismo identificador.

    }

    public String getNombre ()
    {

        return this.nombre;

    }
    
    public void setMasa (double masa)
    {

        this.masa = masa;

    }

    public double getMasa ()
    {

        return this.masa;

    }

    public void setAltura (double altura)
    {

        this.altura = altura;

    }

    public double getAltura()
    {

        return this.altura;

    }

    public Persona ()
    {

    }

}
