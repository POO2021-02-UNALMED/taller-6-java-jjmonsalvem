package vehiculos;
import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	private static ArrayList<Pais> listaPaises= new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		Pais.listaPaises.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static ArrayList<Pais> getListaPaises(){
		return Pais.listaPaises;
	}
	
	public static Pais paisMasVendedor() {
		
		int valorMax =0;
		Pais salida=null;
		for (Pais i:listaPaises) {
			int contador =0;
			for (Vehiculo j:Vehiculo.getListaVehiculos()) {
				if (i == j.getFabricante().getPais()) {
					contador +=1;
				}
			if (contador> valorMax) {
				valorMax =contador;
				salida = i;
			}
			}
		}
		return salida;
	}
}