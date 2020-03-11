package entidades;

public class Horario
{

    private String hentrada;
    private String hsalida;

    public Horario ()
    {

        this.hentrada = "00:00";
        this.hsalida = "00:00";

    }

    public Horario (String hentrada, String hsalida)
    {

        this.hentrada = hentrada;
        this.hsalida = hsalida;

    }

    public String getHentrada ()
    {

        return hentrada;

    }

    public void setHentrada (String hentrada)
    {

        this.hentrada = hentrada;

    }

    public String getHsalida() {
        return hsalida;
    }

    public void setHsalida(String hsalida) {
        this.hsalida = hsalida;
    }

    




}