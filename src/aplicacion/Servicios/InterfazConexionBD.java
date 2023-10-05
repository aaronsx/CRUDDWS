package aplicacion.Servicios;

import java.sql.Connection;

/**
 * Clase que realiza la conexión a PostgreSQL de forma parametrizada.
 * @author ASMP-28/09/2023
 */
public interface InterfazConexionBD {
	/**
	 * Método que genera la conexión a partir de la configuración guardada en 
	 * .properties
	 * @return Conexión con la BBDD abierta.
	 * @author ASMP-28/09/2023
	 */
	public Connection AbrirConexionConBBDD();
	
	/**
	 * Método para cerrar la conexion con la bbdd.
	 * @param Connection y cierra La coneccion de la bbdd.
	 * @author ASMP-28/09/2023
	 */
	public void CerrarConexionConBBDD(Connection conexion);
}
