package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class Tiquete {
	private String codigo;
	private int tarifa;
	private boolean usado;
	
	
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		
	}
	
	public Cliente getCliente() {
		Cliente cliente = getCliente();
		return cliente;
	}
	
	public Vuelo getVuelo() {
		Vuelo vuelo = getVuelo();
		return vuelo;
	}
	
	public String getCodigo() {
		return "Codigo";
	}
	
	public int getTarifa() {
		return 0;
	}
	
	public void marcarComoUsado() {
		
	}
	
	public boolean esUsado() {
		return false;
	}
}
