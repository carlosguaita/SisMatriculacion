public class Vehiculo {

    private String modelo;
    private String marca;
    private double cilindraje;
    private double torque;
    private String placa;
    private String color;
    private int tipoComustible;  //1. Gasolina, 2. Diesel

    public Vehiculo(String modelo, String marca, double cilindraje,
                    double torque, String placa, String color, int tipoCombustible){
        this.modelo = modelo;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.torque = torque;
        this.placa = placa;
        this.color = color;
        this.tipoComustible = tipoCombustible;
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

    void informacion(){
        System.out.println("Información Vehículo");
        System.out.println("Placa: "+placa);
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca: "+marca);
        System.out.println("Color: "+color);
    }
}
