public class Asiento {
    String clase;
    int cantidad;
    String ubicacion;

    public void instalar(String tipoAeronave, String area) {
        this.ubicacion = area;
        System.out.println("Instalando asientos en: " + area);

        for(int t=1; t<=3; t++) {
            if(t==1) { clase="Primera Clase"; cantidad = tipoAeronave.equals("Alta capacidad") ? 20 : 10; }
            else if(t==2) { clase="Ejecutiva"; cantidad=50; }
            else { clase="Económica"; cantidad = tipoAeronave.equals("Alta capacidad") ? 330 : 140; }

            System.out.println("Asientos instalados: " + cantidad + " - " + clase);
        }

        for(int v=1; v<=3; v++) System.out.println("Verificación " + v);

        System.out.println("Asientos instalados completamente en: " + area + "\n");
    }
}
