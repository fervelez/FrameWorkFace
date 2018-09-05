package mx.org.ift.datos;

import java.util.Vector;

/**
 * @author HP
 * @version 1.0
 * @created 04-sep.-2018 09:30:49 a. m.
 */
public class Procedimiento {

	private Conexion conexion;

	public Conexion getConexion() {
		return conexion;
	}

	public void setConexion(Conexion conexion) {
		this.conexion = conexion;
	}

	public Procedimiento(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param esquema
	 * @param nomProcedimeinto
	 * @param parametros
	 */
	public void ejecutaSP(String esquema, String nomProcedimeinto, Vector<Object> parametros){

	}

}