package entidades;

public class Alumno extends Persona
{

    private String matricula;
    private boolean edoacademico;
    private Materia[] materias;

    public Alumno (int nMaterias)
    {

        this.matricula = "";
        this.edoacademico = true;
        this.materias = new Materia[nMaterias];

    }

    public Alumno (String matricula, boolean edoacademico, Materia[] materias)
    {

        this.matricula = matricula;
        this.edoacademico = edoacademico;
        this.materias = materias;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isEdoacademico() {
        return edoacademico;
    }

    public void setEdoacademico(boolean edoacademico) {
        this.edoacademico = edoacademico;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    

}