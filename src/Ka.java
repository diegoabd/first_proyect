/**
 * Created by dabdala on 4/5/15.
 */
public class Ka extends Ford{
    int asientos;
    private static int ka_disponibles=0;
    final String version = "fly";

    Ka(){
        asientos = 4;
        ka_disponibles++;
    }

    Ka(String _color, boolean _nafta){
        this();
        super.color = _color;
        super.nafta = _nafta;
        //super(_color,_nafta);
    }

    public int disponibles(){
        return ka_disponibles;
    }
    void eliminar(){
        ka_disponibles--;
    }

    public void acelerar(){
        System.out.println("el auto esta acelerando");
    }
}

