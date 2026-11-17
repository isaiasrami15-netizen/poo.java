public class reproductor {

    public String cancionActual;
    public boolean reproduciendo;

    
    public void reproducir(String cancion) {
        cancionActual = cancion;
        reproduciendo = true;
        System.out.println("Reproduciendo: " + cancionActual);
    }

    
    public void pausar() {
        reproduciendo = false;
        System.out.println("La reproducción está pausada.");
    }

    
    public void estado() {
        if (cancionActual == null) {
            System.out.println("No hay ninguna canción seleccionada.");
        } else if (reproduciendo) {
            System.out.println("Estado: Reproduciendo \"" + cancionActual + "\"");
        } else {
            System.out.println("Estado: Pausado en \"" + cancionActual + "\"");
        }
    }

    public static void main(String[] args) {
        reproductor reproductor = new reproductor();

        reproductor.estado();
        reproductor.reproducir("LA CHONAAAA XD ");
        reproductor.estado();
        reproductor.pausar();
        reproductor.estado();
    }
}