package Clases;

public class SmartDevice {
    //con la clase creada generamos primero los atributos

    String marca;
    String modelo;
    double pulgadasPantalla;
    int bateria;
    boolean NFC;
    boolean bluetooth;
    int almacenamiento;

    //creamos un constructor vacio y uno con los parametros

    public SmartDevice(String marca, String modelo, double pulgadasPantalla, int bateria, boolean NFC, boolean bluetooth, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadasPantalla = pulgadasPantalla;
        this.bateria = bateria;
        this.NFC = NFC;
        this.bluetooth = bluetooth;
        this.almacenamiento = almacenamiento;
    }

    public SmartDevice() {
    }
}




