public class Main {

    public static void main(String[] args) {

        Ka auto1 = new Ka();
        auto1.color = "negro";
        auto1.puertas = 3;
        auto1.asientos = 4;

        System.out.println("Hay disponibles: " + auto1.disponibles() + " version: " + auto1.version);


        Ka auto2 = new Ka("rojo", true);

        auto1.encender();
        auto2.encender(true);

        System.out.println("Hay disponibles: " + auto1.disponibles() + " al menos 1 de color: " + auto2.color);

        auto1.eliminar();

        System.out.println("Hay disponibles: " + auto2.disponibles());

        Uno auto3 = new Uno();
        auto3.encender();
        auto3.setPuertas(5);

        auto2.apagar(auto2.version);
        auto3.apagar(auto3.getPuertas());

    }


}
