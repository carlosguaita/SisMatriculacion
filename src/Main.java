//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Sistema sis = new Sistema();

        Vehiculo v1 = sis.crearVehiculo();
        //sis.imprimirInformacionVehiculo(v1);
        //sis.imprimirAceleracionVehiculo(v1);
        //sis.imprirEdadDuenio(v1);

        System.out.println(v1);

        sis.actualizarVehiculo(v1);
        System.out.println("----------------Vehículo Actualizado-----------------");
        sis.imprimirInformacionVehiculo(v1);


        Vehiculo v2 = sis.crearVehiculo();
        sis.imprimirInformacionVehiculo(v2);
        sis.imprimirAceleracionVehiculo(v2);

    }
}