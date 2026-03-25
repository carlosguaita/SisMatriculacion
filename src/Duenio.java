public class Duenio {

    private String nombre;
    private int cedula;
    private String telefono;

    public Duenio(String nombre, int cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    void informacion(){
        System.out.println("Información Dueño:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Telefono: " + telefono);
    }
}
