package vehiculos;

public class Camion extends Vehiculo{

    private static int cantidadCamiones;
    protected int ejes;

    /*
    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
    }*/

    public Camion(String string, int i, String string2, int j, int k, Fabricante f, boolean b) {
        super(string, i, string2, j, k, f, b);
        this.puertas = 2; 
        this.velocidadMaxima = 80;
        this.traccion = "4X2";
    }

    public static int getCantidadCamiones() {
        return Camion.cantidadCamiones;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
    
}
