package Clases;


//generamos las dos clases hijas con su atributos propios
public class SmartPhone extends SmartDevice {
    boolean funda;
    String colorFunda;
    int camaras;
    boolean huella;

    public SmartPhone(String marca, String modelo, double pulgadasPantalla, int bateria, boolean NFC, boolean bluetooth, int almacenamiento, boolean funda, String colorFunda, int camaras, boolean huella) {
        super(marca, modelo, pulgadasPantalla, bateria, NFC, bluetooth, almacenamiento);
        this.funda = funda;
        this.colorFunda = colorFunda;
        this.camaras = camaras;
        this.huella = huella;
    }

    public SmartPhone() {


    }



}
