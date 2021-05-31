package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.*;

public class Triatleta extends Deportista implements ICorredor, ICiclista, INadador {

	private String estiloPreferido;
	private String distanciaPreferida;
	private Integer kilometrosEntrenado;
	private TipoDeBicicleta tipoDeBicicleta;
	
	public Triatleta(Integer numeroDeSocio, String nombre, String distanciaPreferida,TipoDeBicicleta tipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida=distanciaPreferida;
		this.tipoDeBicicleta=tipoDeBicicleta;
	}

	@Override
	public String getEstiloPreferido() {
		return this.estiloPreferido;
	}

	@Override
	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido=estiloPreferido;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.kilometrosEntrenado=km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.kilometrosEntrenado;
	}

	public String getDistanciaPreferida() {
		return this.distanciaPreferida;
	}


	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

}
