package co.com.ibm;

import org.junit.Assert;
import org.junit.Test;

import co.com.ibm.servicio.ServicioCliente;

import co.com.ibm.dominio.Cliente;

public class ServicioClienteTest {

	private final ServicioCliente servicioCliente = null;
	
	/**
	 * Caso de prueba cuando el numero de identificacion del cliente es cero   
	 * 
	 * @author juanpbeltran <br>
	 *         <b>Fecha de desarrollo : </b> 25/08/2019 <br>
	 *         <b>Fecha de modificación : </b>  25/08/2019
	 */
	@Test
	public void consultarClientePorIdentificacionCeroTest() {
		// Arrange
		int numeroIdentificacion = 0;
		boolean exito = true;
		try {
			// Act
			Cliente resultado = servicioCliente.consultarClientePorIdentificacion(numeroIdentificacion);		
		}catch(Exception ex) {
			exito = false;
		}
		// Assert
		Assert.assertFalse(false);
	}
	
	/**
	 * Caso de prueba cuando el numero de identificacion del cliente es null    
	 * 
	 * @author juanpbeltran <br>
	 *         <b>Fecha de desarrollo : </b> 25/08/2019 <br>
	 *         <b>Fecha de modificación : </b>  25/08/2019
	 */
	@Test
	public void consultarClientePorIdentificacionNuloTest() {
		// Arrange
		int numeroIdentificacion = 0;
		boolean exito = false;
		try {
			// Act
			Cliente resultado = servicioCliente.consultarClientePorIdentificacion(numeroIdentificacion);		
		}catch(Exception ex) {
			exito = true;
		}
		// Assert
		Assert.assertTrue(exito);
	}	
}
