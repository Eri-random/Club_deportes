package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private String nombre;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	public Evento(TipoDeEvento tipo, String nombre) {
		this.tipo = tipo;
		this.nombre=nombre;
		this.numeroDeInscripcion = 0;
		participantes = new HashMap<Integer, Deportista>();
	}
	
	public Integer agregarParticipante(Deportista nuevo) {
		participantes.put(++this.numeroDeInscripcion, nuevo);
		return this.numeroDeInscripcion;
	}
	
	public TipoDeEvento getTipo() {
		return tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
