package clasesyobjetos;

public class Profesor
{

    private String nombre;
    private String materia;
    private int matricula;
    private String escuela;

    public void setNombre(String nombre) 
    {

        this.nombre = nombre;

    }

    public String getNombre ()
    {

        return this.nombre;

    }

    public void setMatricula (int matricula)
    {

        this.matricula = matricula;

    }

    public double getMatricula ()
    {

        return this.matricula;

    }

    public void setEscuela (String escuela)
    {

        this.escuela = escuela;

    }

    public String getEscuela()
    {

        return this.escuela;

    }

    public Profesor()
    {


    }

}
