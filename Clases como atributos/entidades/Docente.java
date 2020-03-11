package entidades;

public class Docente extends Persona
{

    private double salario;
    private Materia[] materias;
    private Horario horario;

    public Docente ()
    {

        this.salario = 0;
        this.materias = null;
        this.horario = new Horario ();


    }

    public Docente (double salario, Materia[] materias, Horario horario)
    {

        this.salario = salario;
        this.materias = materias;
        this.horario = horario;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    


}