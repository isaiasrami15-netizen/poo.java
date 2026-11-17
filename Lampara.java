public class Lampara {

    public boolean encendida;

     
    public void encender() {
        encendida = true;
        System.out.println("La lámpara está encendida.");
    }

    
    public void apagar() {
        encendida = false;
        System.out.println("La lámpara está apagada.");
    }

    
    public void estado() {
        if (encendida) {
            System.out.println("Estado: Encendida");
        } else {
            System.out.println("Estado: Apagada");
        }
    }

    public static void main(String[] args) {
        Lampara Lampara = new Lampara();

        Lampara.estado();
        Lampara.encender();
        Lampara.estado();
        Lampara.apagar();
        Lampara.estado();
    }
}