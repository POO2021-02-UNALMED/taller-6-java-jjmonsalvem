package vehiculos;
import java.util.ArrayList;

public class Fabricante {

	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> listaFabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricante.listaFabricantes.add(this);
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
	
	public static ArrayList<Fabricante> getListaFabricantes(){
		return Fabricante.listaFabricantes;
	}
	
	public static Fabricante fabricaMayorVentas() {
		int valorMax =0;
		Fabricante salida=null;
		for (Fabricante i:listaFabricantes) {
			int contador =0;
			for (Vehiculo j:Vehiculo.getListaVehiculos()) {
				if (i == j.getFabricante()) {
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
