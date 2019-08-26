/**
 * Copyright (c) 2019 IBM
 * <br><A HREF="http://www.ibm.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.ibm.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import co.com.ibm.dominio.Cliente;
import co.com.ibm.servicio.ServicioCliente;

/**
 * Clase que se encarga de proveer los servicios rest con los datos del cliente
 *
 * @version
 * @author juanpbeltran
 * <br><b>Fecha de desarrollo : </b> 24/08/2019
 * <br><b>Fecha de modificación : </b> 00/00/0000
 */

@RestController
@RequestMapping("v1")
public class ServicioClienteRest {
	
	private final Logger LOOGER = LoggerFactory.getLogger(ServicioClienteRest.class);	
	
	@Autowired
	ServicioCliente servicioCliente;
	
	@GetMapping("/clientes")
	private List<Cliente> listarClientes(){
		return servicioCliente.obtenerListaClientes();
	}
	
	@GetMapping("/clientes/{id}")
	private Cliente consultarCliente(@PathVariable("id") int id){
		return servicioCliente.consultarClientePorIdentificacion(id);
	}
	
	@DeleteMapping("/clientes/{id}")
	private void eliminarCliente(@PathVariable("id") int id) {
		servicioCliente.eliminarClientePorIdentificacion(id);
	}
	
	@PostMapping("/clientes")
	private int guardarCliente(@RequestBody Cliente cliente) {
		servicioCliente.guardarCliente(cliente);
		return cliente.getNumeroIdentificacion();
	}
}
