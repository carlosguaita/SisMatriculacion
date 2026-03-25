//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo("Captiva","Chevrolet",
                            1500,100,"PDU1234",
                                "rojo",1,
                "Juan",123456789,"0987456321");
        Vehiculo v2 = new Vehiculo("Blazer","Chevrolet",
                            1500,100,"PDU4321",
                                "blanco",2,
                "Luis",147852369,"0985214736");




        v1.informacion();
        double acv1 = v1.aceleracion();
        System.out.println("La aceleracion de V1 es: "+acv1);
        v1.informacionDuenio();

        v2.informacion();
        double acv2 = v2.aceleracion();
        System.out.println("La aceleracion de V2 es: "+acv2);
        v2.informacionDuenio();

    }
}