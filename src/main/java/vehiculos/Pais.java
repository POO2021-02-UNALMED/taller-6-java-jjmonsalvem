package vehiculos;
import java.util.ArrayList;

public class Pais {

    private static ArrayList<Pais> listaPaises= new ArrayList<Pais>();
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
        Pais.listaPaises.add(this);
    }

    public static Pais paisMasVendedor() {

        int valorMax =0;
        Pais aux = null;

        for (Pais i:listaPaises) {
            int ctd = 0;
            for (Vehiculo j:Vehiculo.getListaVehiculos()) {
                if (i == j.getFabricante().getPais()) {
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

    public static ArrayList<Pais> getListaPaises() {
        return listaPaises;
    }
    
}
