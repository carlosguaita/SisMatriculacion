public class Duenio {

    private String nombre;
    private int cedula;
    private String telefono;
    private int anio;
    private int mes;
    private int dia;

    public Duenio(String nombre, int cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }


    public Duenio(Duenio duenio){
        this.nombre = duenio.nombre;
        this.cedula = duenio.cedula;
        this.telefono = duenio.telefono;
    }

    public int calcularEdad(){
        int anioActual = 2026;
        int mesActual = 4;
        int diaActual = 6;
        int fechaActualDias = anioActual * 365 + mesActual * 30 + diaActual;
        int fechaNacimientoDias = this.anio * 365 + this.mes * 30 + this.dia;
        int edadDias = fechaActualDias - fechaNacimientoDias;
        int edad = edadDias / 365;
        return edad;
    }

    public int calcularEdad(int anioActual, int mesActual, int diaActual){
        int fechaActualDias = anioActual * 365 + mesActual * 30 + diaActual;
        int fechaNacimientoDias = this.anio * 365 + this.mes * 30 + this.dia;
        int edadDias = fechaActualDias - fechaNacimientoDias;
        int edad = edadDias / 365;
        return edad;
    }

    public void setEdad(int anio, int mes, int dia){
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
