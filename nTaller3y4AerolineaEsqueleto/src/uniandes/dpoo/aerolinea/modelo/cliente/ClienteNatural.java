package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente {
	public static String NATURAL = "Natural";
	private String nombre;
	
	
	public ClienteNatural(String nombre) {
		
	}
	
	public String getIdentificador() {
		return "identificador";
	}
	
	public String getTipoCliente() {
		return "tipo de cliente";
	}
}
