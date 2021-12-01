package vehiculos;
import java.util.ArrayList;

public class Vehiculo {

    protected static int cantidadvehiculos;
    protected String placa;
    protected int puertas;
    protected double velocidadMaxima;
    protected String nombre;
    protected int precio;
    protected int peso;
    protected String traccion;
    protected Fabricante fabricante;
    private static ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
    

    public Vehiculo(String placa, int puertas, double velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        Vehiculo.listaVehiculos.add(this);
        Vehiculo.cantidadvehiculos += 1;
    }

    public Vehiculo(String placa2, String nombre2, int precio2, int peso2, Fabricante fabricante2, int puertas2) {
    }

    public Vehiculo(String string, int i, String string2, int j, int k, Fabricante f, boolean b) {
    }

    public static String veiculosPorTipo() {
        return "Automoviles: "+ Automovil.getCantidadAutomoviles()+"\nCamionetas: "+Camioneta.getCantidadCamionetas()+"\nCamion: "+Camion.getCantidadCamiones(); 

    }



    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public static int getCantidadVehiculos() {
		return Vehiculo.cantidadvehiculos;
	}


    public static void setCantidadvehiculos(int cantidadvehiculos) {
        Vehiculo.cantidadvehiculos = cantidadvehiculos;
    }

    public static ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public static void setCantidadVehiculos(int i) {
    }
    
}
