public class ProduccionAeronaves {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE FABRICACIÓN DE AERONAVES ===\n");

        Fabricante fabricante = new Fabricante();

        Modelo boeing = ModeloFactory.crearModelo(1);
        Modelo airbus = ModeloFactory.crearModelo(2);
        Modelo embraer = ModeloFactory.crearModelo(3);

        fabricante.producirModelo(boeing);
        fabricante.producirModelo(airbus);
        fabricante.producirModelo(embraer);

        System.out.println("\n=== PROCESO FINALIZADO ===");
    }
}
