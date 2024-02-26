package uniandes.dpoo.aerolinea.modelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import java.util.Collection;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.tarifas.CalculadoraTarifas;
public class Vuelo {
	private String fecha;
	
	public Vuelo (Ruta ruta, String fecha, Avion avion) {
		
	}
	
	public Ruta getRuta() {
		Ruta ruta = getRuta();
		return ruta;
	}
	
	public String getFecha() {
		return "Fecha";
	}
	
	public Avion getAvion() {
		Avion avion = getAvion();
		return avion;
	}
	
	public Collection<Tiquete> getTiquete(){
		Collection<Tiquete> lista = getTiquete();
		return lista;
	}
	
	public int venderTiquetes(Cliente cliente, Calculadora Tarifas calculadora, int cantidad) {
		return 0;
	}
	public boolean equals(Object obj) {
		return false;
	}
	
}
