/**
 * Copyright (c) 2019 IBM
 * <br><A HREF="http://www.ibm.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.ibm.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

/**
 * Clase que se encarga persistir los datos de tarjetas
 *
 * @version
 * @author juanpbeltran
 * <br><b>Fecha de desarrollo : </b> 25/08/2019
 * <br><b>Fecha de modificación : </b> 00/00/0000
 */
@Entity
public class Tarjeta {

	@Id
	@Column(name="nmtarjeta")
	private int numeroTarjeta;
	
	@Column(name="nmccv")
	private int numeroCcvTarjeta;
	
	@Column(name="dstipotarjeta")
	private String descripcionTarjeta;

	public Tarjeta() {
	}
	
	/**
	 * @return the numeroTarjeta
	 */
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * @param numeroTarjeta the numeroTarjeta to set
	 */
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * @return the numeroCcvTarjeta
	 */
	public int getNumeroCcvTarjeta() {
		return numeroCcvTarjeta;
	}

	/**
	 * @param numeroCcvTarjeta the numeroCcvTarjeta to set
	 */
	public void setNumeroCcvTarjeta(int numeroCcvTarjeta) {
		this.numeroCcvTarjeta = numeroCcvTarjeta;
	}

	/**
	 * @return the descripcionTarjeta
	 */
	public String getDescripcionTarjeta() {
		return descripcionTarjeta;
	}

	/**
	 * @param descripcionTarjeta the descripcionTarjeta to set
	 */
	public void setDescripcionTarjeta(String descripcionTarjeta) {
		this.descripcionTarjeta = descripcionTarjeta;
	}
}
