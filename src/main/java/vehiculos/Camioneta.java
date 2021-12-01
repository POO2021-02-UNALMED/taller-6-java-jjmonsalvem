package vehiculos;

public class Camioneta extends Vehiculo {

    private static int cantidadCamionetas;
    protected boolean volco;

    /*
    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
    }
*/
    

    public Camioneta(String string, String string2, int i, int j, Fabricante f, int k) {
        super(string, string2, i, j, f, k);
        this.velocidadMaxima = 90;
        this.traccion = "4X4";

    }



    public static int getCantidadCamionetas() {
        return Camioneta.cantidadCamionetas;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
    
}
