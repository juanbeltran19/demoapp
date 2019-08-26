/**
 * Copyright (c) 2019 IBM
 * <br><A HREF="http://www.ibm.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.ibm.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que se encarga persistir los datos cliente
 *
 * @version
 * @author juanpbeltran
 * <br><b>Fecha de desarrollo : </b> 24/08/2019
 * <br><b>Fecha de modificación : </b> 00/00/0000
 */

@Entity
public class Cliente {

	@Id
	@Column(name="nmidentificacion")
	private int numeroIdentificacion;
	
	@Column(name="dsnombre")
	private String nombre;
	
	@Column(name="dsdireccion")
	private String direccion;
	
	@Column(name="dsciudad")
	private String ciudad;
	
	@Column(name="nmtelefono")
	private int numeroTelefono;
	
	public Cliente() {
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * @return the numeroTelefono
	 */
	public int getNumeroTelefono() {
		return numeroTelefono;
	}
	/**
	 * @param numeroTelefono the numeroTelefono to set
	 */
	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}		
}
