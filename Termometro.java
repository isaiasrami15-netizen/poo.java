public class Termometro {

    public double temperatura;

    
    public Termometro() {
        temperatura = 38.0; 
    }

    
    public void subir(double grados) {
        temperatura += grados;
        System.out.println("La temperatura aumentó " + grados + " grados.");
    }

    
    public void bajar(double grados) {
        temperatura -= grados;
        System.out.println("La temperatura disminuyó " + grados + " grados.");
    }

    
    public void mostrarTemperatura() {
        System.out.println("Temperatura actual: " + temperatura + "°C");
    }

    public static void main(String[] args) {
        Termometro Termometro = new Termometro();

        Termometro.mostrarTemperatura();

        Termometro.subir(8);
        Termometro.mostrarTemperatura();

        Termometro.bajar(10);
        Termometro.mostrarTemperatura();
    }
}