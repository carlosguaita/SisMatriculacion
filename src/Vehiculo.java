public class Vehiculo {

    private String modelo;
    private String marca;
    private double cilindraje;
    private double torque;
    private String placa;
    private String color;
    private int tipoComustible;  //1. Gasolina, 2. Diesel
    private Duenio duenio;



    public Vehiculo(String modelo, String marca, double cilindraje,
                    double torque, String placa, String color, int tipoCombustible,
                    String nombreDuenio, int cedulaDuenio, String telefonoDuenio){
        this.modelo = modelo;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.torque = torque;
        this.placa = placa;
        this.color = color;
        this.tipoComustible = tipoCombustible;
        this.duenio = new Duenio(nombreDuenio,cedulaDuenio,telefonoDuenio);
    }

    public Vehiculo(String modelo, String marca, double cilindraje,
                    double torque, String placa, String color, int tipoCombustible,
                    Duenio duenio){
        this.modelo = modelo;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.torque = torque;
        this.placa = placa;
        this.color = color;
        this.tipoComustible = tipoCombustible;
        this.duenio = duenio;
    }

    public Vehiculo(){

    }

    double aceleracion(){
        double ac;
        if (tipoComustible == 1){
            ac = torque * cilindraje * 3;
        }else{
            ac = torque * cilindraje;
        }
        return ac;
    }

    double aceleracion(int tipoComustible, float torque, float cilindraje){
        double ac;
        if (tipoComustible == 1){
            ac = torque * cilindraje * 3;
        }else{
            ac = torque * cilindraje;
        }
        return ac;
    }

    double aceleracion(Vehiculo vehiculo){
        double ac;
        if (vehiculo.tipoComustible == 1){
            ac = Math.pow(vehiculo.torque,2);
        }else{
            ac = Math.sqrt(vehiculo.torque);
        }
        return ac;
    }

    @Override
    public String toString(){
        return "El vehículo tiene las placas: " + this.placa;
    }



     public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTipoComustible() {
        return tipoComustible;
    }

    public void setTipoComustible(int tipoComustible) {
        this.tipoComustible = tipoComustible;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
}
