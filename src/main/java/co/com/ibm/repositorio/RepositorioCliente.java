/**
 * Copyright (c) 2019 IBM
 * <br><A HREF="http://www.ibm.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.ibm.repositorio;

import co.com.ibm.dominio.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 * interface que implementa el crud de clientes
 *
 * @version
 * @author juanpbeltran
 * <br><b>Fecha de desarrollo : </b> 25/08/2019
 * <br><b>Fecha de modificación : </b> 00/00/0000
 */
@SuppressWarnings("rawtypes")
public interface RepositorioCliente extends JpaRepository<Cliente, Integer>{
}
