public class Fabricante {
    public void producirModelo(Modelo modelo) {
        System.out.println("\n>>> Iniciando producción del modelo " + modelo.getNombreModelo());
        modelo.fabricarAviones();
    }
}
