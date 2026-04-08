//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Sistema sis = new Sistema();
        Vehiculo v1 = new Vehiculo();
        int opc = Sistema.menu();

        switch (opc){
            case 1:
                v1 = sis.crearVehiculo();
                break;
            case 2:
                sis.actualizarVehiculo(v1);
                break;
            case 3:
                sis.imprimirInformacionVehiculo(v1);
                break;
            case 4:
                sis.imprimirAceleracionVehiculo(v1);
                break;
        }

    }
}