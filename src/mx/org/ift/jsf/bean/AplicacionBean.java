package mx.org.ift.jsf.bean;
import mx.org.ift.aplicacion.AplicacionSimple;

/**
 * @author HP
 * @version 1.0
 * @created 03-sep.-2018 04:18:40 p. m.
 */

public class AplicacionBean {

	private String nomArchConfig;
	private AplicacionSimple aplicacion;

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
		/*
		try {
			aplicacion = new AplicacionSimple(nomArchivo);
			aplicacion.cargaConfig();
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
	}

	public String getNomArchConfig(){
		return nomArchConfig;
	}
	
	public void setAplicacion(AplicacionSimple aplicacion) {
		this.aplicacion = aplicacion;
	}
	
	public AplicacionSimple getAplicacion() {
		return aplicacion;
	}

}