public class Modelo {
    String marca;
    String nombreModelo;
    String paisOrigen;

    public void configurar(String marca, String modelo, String pais) {
        this.marca = marca;
        this.nombreModelo = modelo;
        this.paisOrigen = pais;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void fabricarAviones() {
        System.out.println("Iniciando fabricación del modelo: " + marca + " " + nombreModelo);

        for(int version = 1; version <= 3; version++) {
            String tipoVersion = (version==1) ? "Version Pasajeros" :
                                 (version==2) ? "Version Carga" : "Version Mixta";

            System.out.println("Configurando " + tipoVersion);

            Aeronave aeronave = new Aeronave();
            aeronave.producir(marca, nombreModelo, tipoVersion);
        }

        int etapa = 1;
        while(etapa <= 3) {
            System.out.println("Certificación etapa " + etapa);
            etapa++;
        }

        System.out.println("Modelo " + marca + " " + nombreModelo + " certificado completamente\n");
    }
}
