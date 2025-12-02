public class Motor {
    String tipo;
    int potencia;
    String ubicacion;

    public void instalar(String ubicacion, String tipoAeronave) {
        this.ubicacion = ubicacion;

        if(tipoAeronave.equals("Alta capacidad")) { tipo = "TurboFan High-Thrust"; potencia = 90000; }
        else if(tipoAeronave.equals("Gran volumen")) { tipo = "TurboFan Efficient"; potencia = 85000; }
        else { tipo = "TurboFan Balanced"; potencia = 70000; }

        System.out.println("Instalando " + ubicacion + " - Tipo: " + tipo);

        for(int c=1; c<=3; c++) System.out.println("Calibración " + c);
        for(int p=1; p<=3; p++) System.out.println("Prueba " + p);

        System.out.println(ubicacion + " instalado correctamente\n");
    }
}
