package vehiculos;
import java.util.ArrayList;

public class Fabricante {

    private static ArrayList<Fabricante> listaFabricantes = new ArrayList<Fabricante>();
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        Fabricante.listaFabricantes.add(this);
    }

    public static ArrayList<Fabricante> getListaFabricantes() {
        return Fabricante.listaFabricantes;
    }

    public static Fabricante fabricaMayorVentas() {

        int valorMax =0;
        Fabricante aux = null;

        for (Fabricante i: listaFabricantes) {
            int ctd = 0;
            for (Vehiculo j:Vehiculo.getListaVehiculos()) {
                if (i == j.getFabricante()) {
                    ctd ++;
                }
                if (ctd > valorMax) {
                    valorMax = ctd;
                    aux = i;
                }
            }
        }

        return aux;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
