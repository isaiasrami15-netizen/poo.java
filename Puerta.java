public class Puerta {

    public boolean abierta;

    
    public Puerta() {
        abierta = false; 
    }

    
    public void abrir() {
        abierta = true;
        System.out.println("La puerta está abierta.");
    }

    
    public void cerrar() {
        abierta = false;
        System.out.println("La puerta está cerrada.");
    }

    
    public void estado() {
        if (abierta) {
            System.out.println("Estado: Abierta");
        } else {
            System.out.println("Estado: Cerrada");
        }
    }

    public static void main(String[] args) {
        Puerta Puerta = new Puerta();

        Puerta.estado();
        Puerta.abrir();
        Puerta.estado();
        Puerta.cerrar();
        Puerta.estado();
    }
}
