/**
 * Created by dabdala on 4/5/15.
 */
public abstract class Auto implements Vehiculo{
    public String color;
    public boolean nafta;

    Auto(){
        color = "";
        nafta = false;
    }
    Auto(String _color, boolean _nafta){
        color = _color;
        nafta = _nafta;
    }
   public void encender()
    {
        System.out.println("El auto esta encendido");
    }

    public void apagar(int puertas){
        if (puertas == 0)
            System.out.println("El auto no tiene puertas");
        else
            System.out.println("El auto tiene " + puertas + " puertas");

    }

    public void apagar(String version){
        System.out.println("El auto version " + version + " esta apagado");
    }
}
