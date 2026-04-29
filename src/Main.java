import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Sistema sis = new Sistema();


        //Vehiculo v1 = new Vehiculo();

        Scanner sc = new Scanner(System.in);

        //Vehiculo[] vehiculos = new Vehiculo[5];

        List<Vehiculo> listaVehiculos = new ArrayList<>();


        int cont=0, indice = 0, opc2=0;

        do {

            int opc = Sistema.menu();

            switch (opc) {
                case 1:
                    //vehiculos[cont] = sis.crearVehiculo();
                    //cont++;
                    listaVehiculos.add(sis.crearVehiculo());
                    break;
                case 2:
                    //indice = sis.seleccionarVehiculo(vehiculos, cont);
                    indice = sis.seleccionarVehiculo(listaVehiculos);
                    //sis.actualizarVehiculo(vehiculos[indice]);
                    sis.actualizarVehiculo(listaVehiculos.get(indice));
                    break;
                case 3:
                    //indice = sis.seleccionarVehiculo(vehiculos, cont);
                    //sis.imprimirInformacionVehiculo(vehiculos[indice]);
                    indice = sis.seleccionarVehiculo(listaVehiculos);
                    sis.imprimirInformacionVehiculo(listaVehiculos.get(indice));
                    break;
                case 4:
                    //indice = sis.seleccionarVehiculo(vehiculos, cont);
                    //sis.imprimirAceleracionVehiculo(vehiculos[indice]);
                    indice = sis.seleccionarVehiculo(listaVehiculos);
                    sis.imprimirAceleracionVehiculo(listaVehiculos.get(indice));
                    break;
            }
            System.out.println("Desea seleccionar otra opción 1.Si/2.No: ");
            opc2 = sc.nextInt();
        }while(opc2 == 1);

    }
}