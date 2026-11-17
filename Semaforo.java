public class Semaforo {

    public String color;

    
    public Semaforo() {
        color = "Rojo";
    }

    
    public void cambiarRojo() {
        color = "Rojo";
    }

    
    public void cambiarAmarillo() {
        color = "Amarillo";
    }

    
    public void cambiarVerde() {
        color = "Verde";
    }

    
    public void mostrarColor() {
        System.out.println("El semáforo está en color: " + color);
    }

    public static void main(String[] args) {
        Semaforo Semaforo = new Semaforo();

        Semaforo.mostrarColor();

        Semaforo.cambiarVerde();
        Semaforo.mostrarColor();

        Semaforo.cambiarAmarillo();
        Semaforo.mostrarColor();

        Semaforo.cambiarRojo();
        Semaforo.mostrarColor();
    }
}



