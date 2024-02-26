package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Vuelo;


public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {
	static int COSTO_POR_KM = 1000;
	
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return 0;
	}
	
	public double calcularPorcentajeDescuento(Cliente cliente) {
		return 0;
	}
}
