public class ModeloFactory {
    public static Modelo crearModelo(int tipo) {
        Modelo m = new Modelo();
        if(tipo == 1) m.configurar("Boeing", "747", "Estados Unidos");
        else if(tipo == 2) m.configurar("Airbus", "A380", "Francia");
        else m.configurar("Embraer", "E190", "Brasil");
        return m;
    }
}
