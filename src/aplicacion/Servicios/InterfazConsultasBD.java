package aplicacion.Servicios;

import java.util.ArrayList;

import aplicacion.Entidades.LibrosDto;

/**
 * Interfaz que define los métodos de consulta a la base de datos.
 * @author ASMP-28/09/2023
 */
public interface InterfazConsultasBD {
	/**
	 * Método que realiza consulta sobre la bbdd.
	 *  @param saberPedir para controlar el select
	 * @author ASMP-28/09/2023
	 */
	public ArrayList<LibrosDto> SeleccionarEnBBDD(boolean saberPedir);
	/**
	 * Método que realiza consulta que no te devuelven nada.
	 * @param indiceFormato indicar si quieres eliminar actualizar o borrar.
	 * @author ASMP-28/09/2023
	 */
	public void ModificarEnBBDD(Integer indiceFormato);
	
	
}
