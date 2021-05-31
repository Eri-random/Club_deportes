package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club {

	private String nombre;
	private List<Deportista> socios;
	private List<Evento> competencias;

	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new ArrayList<>();
		this.competencias = new ArrayList<>();
	}

	public void agregarDeportista(Deportista deportista) {
		if(!this.buscarDeportista(deportista)) {
			this.socios.add(deportista);
		}
	}

	public Integer getCantidadSocios() {
		return this.socios.size();
	}

	public void crearEvento(TipoDeEvento tipo, String nombre) {
		Evento nuevoEvento = new Evento(tipo, nombre);
		this.competencias.add(nuevoEvento);
	}

	public Integer inscribirEnEvento(String nombre, Deportista deportista) {
		Evento nuevoEvento = this.buscarEvento(nombre);

		if (nuevoEvento != null) {
			switch (nuevoEvento.getTipo()) {
			case CARRERA_5K:
			case CARRERA_10K:
			case CARRERA_21K:
			case CARRERA_42K:
				if (deportista instanceof ICorredor) {
					nuevoEvento.agregarParticipante(deportista);
					return 1;
				}

				break;
			case DUATLON:
				if (deportista instanceof ICorredor && deportista instanceof ICiclista) {
					nuevoEvento.agregarParticipante(deportista);
					return 1;
				}
				break;

			case CARRERA_NATACION_EN_PICINA:
			case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
				if (deportista instanceof INadador) {
					nuevoEvento.agregarParticipante(deportista);
					return 1;
				}
				break;
			case TRIATLON_IRONMAN:
			case TRIATLON_MEDIO:
			case TRIATLON_OLIMPICO:
			case TRIATLON_SHORT:
				if (deportista instanceof ICorredor && deportista instanceof ICiclista
						&& deportista instanceof INadador) {
					nuevoEvento.agregarParticipante(deportista);
					return 1;
				}
				break;

			}
		}
		return -1;
	}

	private Evento buscarEvento(String nombre) {
		for (Evento evento : competencias) {
			if (evento.getNombre().equals(nombre)) {
				return evento;
			}
		}
		return null;
	}

	private Boolean buscarDeportista(Deportista deportista) {
		for (Deportista deportistas : socios) {
			if (deportistas.getNumeroDeSocio().equals(deportista.getNumeroDeSocio())) {
				return true;
			}

		}
		return false;
	}

}
