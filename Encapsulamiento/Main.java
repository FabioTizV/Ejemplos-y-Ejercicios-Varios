import clasesyobjetos.Alumno;
import clasesyobjetos.Persona;
import clasesyobjetos.Profesor;
import clasesyobjetos.Animal;
import clasesyobjetos.Gato;
import clasesyobjetos.Conejo;
import clasesyobjetos.Reptil;
import clasesyobjetos.Calculadora;
import clasesyobjetos.Pokemon;
import clasesyobjetos.Automovil;

public class Main 
{

    public static void main(String[] args) 
    { 

        Persona p1 = new Persona();

        p1.setNombre("Fabio");

        String Nombre1 = p1.getNombre();

        System.out.println(Nombre1);

        Alumno a1 = new Alumno();

        Profesor pr1 = new Profesor();

        Animal an1 = new Animal();

        Gato g1 = new Gato();

        Conejo c1 = new Conejo();

        Reptil r1 = new Reptil();

        Calculadora cal1 = new Calculadora();

        Pokemon pok1 = new Pokemon();

        Automovil au1 = new Automovil();

        System.out.println();
        System.out.println();

    }

}