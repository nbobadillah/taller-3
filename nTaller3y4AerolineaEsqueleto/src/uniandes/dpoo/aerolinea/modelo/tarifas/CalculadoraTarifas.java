package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.Ruta;

public abstract class CalculadoraTarifas {
	static double IMPUESTO = 0.28;
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		return 0;
	}
	
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return 0;
	}
	
	public double calcularPorcentajeDescuento(Cliente cliente) {
		return 0;
	}
	
	public int calcularDistanciaVuelo(Ruta ruta) {
		return 0;
	}
	
	public int calcularValorImpuestos(int costoBase) {
		return 0;
	}
}
