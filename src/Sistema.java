import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private Scanner sc;
    private BufferedReader br;

    public Sistema(){
        sc = new Scanner(System.in);
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public static int menu(){
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("Seleccione una opción:");
        System.out.println("1.Crear vehículo");
        System.out.println("2.Actualizar vehículo");
        System.out.println("3.Imprimir información");
        System.out.println("4.Imprimir aceleración");
        System.out.print(">> ");
        opc = sc.nextInt();
        return opc;
    }

    public int seleccionarVehiculo(Vehiculo[] vehiculos, int cont){
        int indice = 0;
        System.out.println("Seleccione un vehículo: ");
        for (int i = 0; i < cont; i++){
            System.out.println(i + ". " + vehiculos[i].getPlaca());
        }
        System.out.println(">> ");
        indice = sc.nextInt();
        return indice;
    }

    public int seleccionarVehiculo(List<Vehiculo> listaVehiculos){
        int indice = 0;
        int i = 0;
        System.out.println("Seleccione un vehículo: ");
        for (Vehiculo vehiculo : listaVehiculos){
            System.out.println(i + ". " + vehiculo.getPlaca());
            i++;
        }
        System.out.println(">> ");
        indice = sc.nextInt();
        return indice;
    }


    void imprimirInformacionVehiculo(Vehiculo vehiculo){
        System.out.println("Información Vehículo");
        System.out.println("Placa: "+vehiculo.getPlaca());
        System.out.println("Modelo: "+vehiculo.getModelo());
        System.out.println("Marca: "+vehiculo.getMarca());
        System.out.println("Color: "+vehiculo.getColor());
        this.imprimirInformacionDuenio(vehiculo.getDuenio());
    }

    void imprimirInformacionDuenio(Duenio duenio){
        System.out.println("Información Dueño:");
        System.out.println("Nombre: " + duenio.getNombre());
        System.out.println("Cedula: " + duenio.getCedula());
        System.out.println("Telefono: " + duenio.getTelefono());
    }

    public Vehiculo crearVehiculo(){
        System.out.println("Ingrese los datos del vehículo:");
        System.out.print("Modelo: ");
        String modelo = sc.next();
        System.out.print("Marca: ");
        String marca = sc.next();
        System.out.print("Cilindraje: ");
        double cilindraje = sc.nextDouble();
        System.out.print("Torque: ");
        double torque = sc.nextDouble();
        System.out.print("Placa: ");
        String placa = sc.next();
        System.out.print("Color: ");
        String color = sc.next();
        System.out.print("Tipo combustible 1.Gasolina/2.Diesel: ");
        int tipoComustible = sc.nextInt();
        Duenio duenio = this.crearDuenio();
        Vehiculo vi = new Vehiculo(modelo,marca,cilindraje,torque,
                                    placa,color,tipoComustible,duenio);
        return vi;
    }

    public Duenio crearDuenio(){
        System.out.println("Ingrese los datos del dueño:");
        System.out.print("Nombre: ");
        String nombre = null;
        try {
            nombre = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.print("Cedula ");
        int cedula = sc.nextInt();
        System.out.print("Teléfono: ");
        String telefono = sc.next();
        System.out.println("Fecha nacimiento ");
        System.out.print("Año: ");
        int anio = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Día: ");
        int dia = sc.nextInt();
        Duenio du = new Duenio(nombre,cedula,telefono);
        du.setEdad(anio,mes,dia);
        //Duenio du = new Duenio(nombre,cedula,telefono,anio,mes,dia);
        return du;
    }

    public void imprimirAceleracionVehiculo(Vehiculo vehiculo){
        double acv = vehiculo.aceleracion();
        System.out.println("La aceleracion de V2 es: "+acv);
    }

    public void actualizarVehiculo(Vehiculo vehiculo){
        System.out.println("Actualizar Información del Vehículo");
        System.out.println("Placa (" + vehiculo.getPlaca() + "): ");
        String placa = sc.next();
        vehiculo.setPlaca(placa);
        System.out.println("Modelo (" + vehiculo.getModelo() + "): ");
        String modelo = sc.next();
        vehiculo.setModelo(modelo);
        System.out.println("Marca (" + vehiculo.getMarca() + "): ");
        String marca = sc.next();
        vehiculo.setMarca(marca);
        System.out.println("Color (" + vehiculo.getColor() + "): ");
        String color = sc.next();
        vehiculo.setColor(color);
    }

    public void imprirEdadDuenio(Vehiculo vehiculo){
        System.out.println("La edad del dueño del vehiculo de placas: " +
                            vehiculo.getPlaca() +
                            " es:" + vehiculo.getDuenio().calcularEdad());
    }


}
