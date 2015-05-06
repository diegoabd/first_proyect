/**
 * Created by dabdala on 5/5/15.
 */
public class Uno extends  Fiat {
    int asientos;

    Uno(){
        asientos = 2;
    }
    Uno(String _color, boolean _nafta){
        this();
        super.color = _color;
        super.nafta = _nafta;
    }
}
