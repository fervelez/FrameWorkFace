package mx.org.ift.aplicacion;
import mx.org.ift.datos.Conexion;

/**
 * @author HP
 * @version 1.0
 * @created 03-sep.-2018 04:08:02 p. m.
 */
public class AplicacionBD extends AplicacionSegura {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AplicacionBD(String nomAplicacion, String nomArchConfig) {
		super(nomAplicacion, nomArchConfig);
		// TODO Auto-generated constructor stub
	}

	private Conexion conexion;

	public Conexion getConexion() {
		return conexion;
	}

	public void setConexion(Conexion conexion) {
		this.conexion = conexion;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}