/**
 * Created by dabdala on 4/5/15.
 */
public class Ford extends Auto {

    protected int puertas;

    public void encender()
    {
        System.out.println("El Ford esta encendido");
    }
    public void encender(boolean automatico)
    {
        encender();
        if (automatico)
            System.out.println(" de forma automatica");
        else
            System.out.println(" de forma manual");
    }
}
