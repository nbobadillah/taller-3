package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {
	static int COSTO_POR_KM_NATURAL = 600;
	static int COSTO_POR_KM_CORPORATIVO = 900;
	static double DESCUENTO_PEQ = 0.02;
	static double DESCUENTO_MEDIANAS = 0.1;
	static double DESCUENTO_GRANDES = 0.2;

	
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return 0;
	}
	
	public double calcularPorcentajeDescuento(Cliente cliente) {
		return 0;
	}
}
