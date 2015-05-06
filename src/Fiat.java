/**
 * Created by dabdala on 5/5/15.
 */
public class Fiat extends Auto {

    private int puertas;

    public void encender()
    {
        System.out.println("El Fiat esta encendido");
    }
    public void encender(boolean automatico)
    {
        encender();
    }

    public void setPuertas(int _puertas){
        puertas = _puertas;
    }
    public int getPuertas(){
        return puertas;
    }
}