/**
 * Copyright (c) 2019 IBM
 * <br><A HREF="http://www.ibm.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.ibm.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

/**
 * Clase que se encarga persistir los datos de asesores
 *
 * @version
 * @author juanpbeltran
 * <br><b>Fecha de desarrollo : </b> 25/08/2019
 * <br><b>Fecha de modificación : </b> 00/00/0000
 */
@Entity
public class Asesor {
	
	@Id
	@Column(name="nmidentificacion")
	private int numeroIdentificacion;
	
	@Column(name="dsnombre")
	private String nombre;
	
	@Column(name="dsespecialidad")
	private String especialidad;
	
	public Asesor() {
	}
	
	/**
	 * @return the numeroIdentificacion
	 */
	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	/**
	 * @param numeroIdentificacion the numeroIdentificacion to set
	 */
	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the especialidad
	 */
	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * @param especialidad the especialidad to set
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}	
}
