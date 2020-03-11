package entidades;

public class Persona
{
    private String nombre;
    private double edad;
    private double altura;
    private double peso;

    public Persona ()
    {

        this.nombre = "";
        this.edad = 0;
        this.altura = 0;
        this.peso = 0;

    }

    public Persona (String nombre, double edad, double altura, double peso)
    {

        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;

    }

    public String getNombre ()
    {

        return nombre;

    }

    public void setNombre (String nombre)
    {

        this.nombre = nombre;

    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    



}