package entidades;

public class Docente extends Persona
{

    private double salario;
    private Materia materias;
    private Horario horario;

    public Docente ()
    {

        this.salario = 0;
        this.materias = null;
        this.horario = new Horario ();


    }



}