package co.com.ibm.servicio;

import co.com.ibm.dominio.Cliente;
import co.com.ibm.repositorio.RepositorioCliente;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Clase que se encarga de gestionar los datos del cliente
 *
 * @version
 * @author juanpbeltran
 * <br><b>Fecha de desarrollo : </b> 24/08/2019
 * <br><b>Fecha de modificación : </b> 00/00/0000
 */

@Service
@Component
public class ServicioCliente{

	@Autowired
	RepositorioCliente repositorioCliente;

	public ServicioCliente() {
	}

	/**
	 * Metodo que se encarga de retornar una lista de clientes
	 * 
	 * @author juanpbeltran <br>
	 *         <b>Fecha de desarrollo : </b> 24/08/2019 <br>
	 *         <b>Fecha de modificación : </b>  25/08/2019
	 * 
	 * @return listaCliente lista registros de los clientes
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<Cliente> obtenerListaClientes(){
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		repositorioCliente.findAll().forEach(cliente->listaCliente.add((Cliente) cliente));
		return listaCliente;
	}

	/**
	 * Metodo que se encarga de consultar registros de un cliente
	 * 
	 * @author juanpbeltran <br>
	 *         <b>Fecha de desarrollo : </b> 24/08/2019 <br>
	 *         <b>Fecha de modificación : </b>  25/08/2019
	 * 
	 * @param numeroIdentificacion numero de identificacion del cliente
	 * @return cliente objeto de tipo cliente
	 */
	public Cliente consultarClientePorIdentificacion(int numeroIdentificacion) {
		return repositorioCliente.findById( numeroIdentificacion ).get();
	}

	/**
	 * Metodo que se encarga de guardar registros de un cliente
	 * 
	 * @author juanpbeltran <br>
	 *         <b>Fecha de desarrollo : </b> 24/08/2019 <br>
	 *         <b>Fecha de modificación : </b>  25/08/2019
	 * 
	 * @param cliente objeto de tipo cliente
	 * 
	 */
	public void guardarCliente(Cliente cliente) {
		repositorioCliente.save(cliente);
	}

	/**
	 * Metodo que se encarga de eliminar registros de un cliente
	 * 
	 * @author juanpbeltran <br>
	 *         <b>Fecha de desarrollo : </b> 24/08/2019 <br>
	 *         <b>Fecha de modificación : </b>  25/08/2019
	 * 
	 * @param numeroIdentificacion numero de identificacion del cliente
	 * 
	 */
	public void eliminarClientePorIdentificacion(int numeroIdentificacion) {
		repositorioCliente.deleteById(numeroIdentificacion );
	}
}
