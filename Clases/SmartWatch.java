package Clases;

public class SmartWatch extends SmartDevice {
    String colorCorrea;
    boolean camara;

    public SmartWatch(String marca, String modelo, double pulgadasPantalla, int bateria, boolean NFC, boolean bluetooth, int almacenamiento, String colorCorrea, boolean camara) {
        super(marca, modelo, pulgadasPantalla, bateria, NFC, bluetooth, almacenamiento);
        this.colorCorrea = colorCorrea;
        this.camara = camara;
    }

    public SmartWatch(){

    }
}
