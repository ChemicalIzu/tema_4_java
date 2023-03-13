package Clases;

public class Main {
    public static void main(String[] args) {
        //creamos primero el objeto SmartPhone

        SmartPhone Iphone = new SmartPhone("Iphone", "12", 6.1d, 7000, true, true, 256, true, "azul", 3, true);
        System.out.println(Iphone.marca);
        System.out.println(Iphone.modelo);
        System.out.println(Iphone.pulgadasPantalla);
        System.out.println(Iphone.bateria);
        System.out.println(Iphone.NFC);
        System.out.println(Iphone.bluetooth);
        System.out.println(Iphone.almacenamiento);
        System.out.println(Iphone.funda);
        System.out.println(Iphone.colorFunda);
        System.out.println(Iphone.camaras);
        System.out.println(Iphone.huella);

        System.out.println(" ");
        System.out.println(" ");

        //creamos el objeto SmartWatch
        SmartWatch xiaomi = new SmartWatch("Xiaomi", "S1", 1.43d,470, true, true, 12, "negro", false);
        System.out.println(xiaomi.marca);
        System.out.println(xiaomi.modelo);
        System.out.println(xiaomi.pulgadasPantalla);
        System.out.println(xiaomi.bateria);
        System.out.println(xiaomi.NFC);
        System.out.println(xiaomi.bluetooth);
        System.out.println(xiaomi.almacenamiento);
        System.out.println(xiaomi.colorCorrea);
        System.out.println(xiaomi.camara);
    }
}