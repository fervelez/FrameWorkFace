package mx.org.ift.jsf.bean;
import mx.org.ift.aplicacion.AplicacionBD;
import mx.org.ift.aplicacion.AplicacionSegura;
import mx.org.ift.aplicacion.AplicacionSimple;

/**
 * @author HP
 * @version 1.0
 * @created 03-sep.-2018 04:18:40 p. m.
 */

public class AplicacionBean {

	private String nomArchConfig;
	private AplicacionSimple aplicacion;
	private String tipoAplicacion = "";
	
	
	public String getTipoAplicacion() {
		return tipoAplicacion;
	}

	public void setTipoAplicacion(String tipoAplicacion) {
		this.tipoAplicacion = tipoAplicacion;
	}

	public AplicacionBean(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param nomArchivo
	 */
	public void setNomArchConfig(String nomArchivo){
		this.nomArchConfig = nomArchivo;
	}

	public String getNomArchConfig(){
		return nomArchConfig;
	}
	
	public void setAplicacion(AplicacionSimple aplicacion) {
		this.aplicacion = aplicacion;
	}
	
	public AplicacionSimple getAplicacion() {
		if (tipoAplicacion.equals("DB"))
			aplicacion = new AplicacionBD(nomArchConfig);
		else if (tipoAplicacion.equals("Segura"))
			aplicacion = new AplicacionSegura(nomArchConfig);
		else if (tipoAplicacion.equals("Simple"))
			aplicacion = new AplicacionSimple(nomArchConfig);
		else
			aplicacion = null;
		return aplicacion;
	}

}