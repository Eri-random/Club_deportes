package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor{
	
	private Integer kilometrosEntrenados;
	private Integer distanciaPreferida;

	public Corredor(Integer numeroSocio, String nombre, Integer distanciaPreferida) {
		super(numeroSocio, nombre);
		this.distanciaPreferida=distanciaPreferida;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.kilometrosEntrenados=km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.kilometrosEntrenados;
	}

	public Integer getDistanciaPreferida() {
		return this.distanciaPreferida;
	}

}
