import controlador.ControladorEjemplo;
import vista.Ventana;

public class Main {
    public static void main(String[] args) {
        Ventana ventana = new Ventana("Ejemplo");
        ControladorEjemplo controladorEjemplo = new ControladorEjemplo(ventana);
    }
}