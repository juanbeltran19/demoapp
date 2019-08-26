/**
 * Copyright (c) 2019 IBM
 * <br><A HREF="http://www.ibm.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.ibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Clase que se encarga de iniciar la aplicación
 *
 * @version
 * @author juanpbeltran
 * <br><b>Fecha de desarrollo : </b> 24/08/2019
 * <br><b>Fecha de modificación : </b> 00/00/0000
 */

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories("co.com.ibm.repositorio")
@ComponentScan(basePackages = "co.com.ibm") 
public class DemoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoappApplication.class, args);
	}

}
