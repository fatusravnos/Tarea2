public class Aeronave {
    String tipoConfiguracion;
    String estadoProduccion;

    public void producir(String marca, String modelo, String configuracion) {
        this.tipoConfiguracion = configuracion;
        System.out.println("Produciendo: " + marca + " " + modelo + " - " + configuracion);

        if(configuracion.equals("Version Pasajeros")) estadoProduccion = "Alta capacidad";
        else if(configuracion.equals("Version Carga")) estadoProduccion = "Gran volumen";
        else estadoProduccion = "Flexible";

        for(int motor = 1; motor <= 2; motor++) {
            Motor nuevoMotor = new Motor();
            nuevoMotor.instalar((motor==1) ? "Motor izquierdo" : "Motor derecho", estadoProduccion);
        }

        System.out.println("Instalando asientos:");
        Asiento asiento = new Asiento();
        asiento.instalar(estadoProduccion, "Cabina principal");
    }
}
