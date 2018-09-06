package mx.org.ift.jsf.controller;

import mx.org.ift.aplicacion.AplicacionSimple;
import mx.org.ift.jsf.bean.AplicacionBean;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;


/**
 * @author HP
 * @version 1.0
 * @created 03-sep.-2018 04:09:43 p. m.
 */
public class ControladorAplicacion extends Persistente {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AplicacionBean aplicacionBean;
	private String cargaConfig = "";

	public ControladorAplicacion(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param pe
	 */
	public void beforePhase(PhaseEvent pe){

	}

	/**
	 * 
	 * @param pe
	 */
	public void afterPhase(PhaseEvent pe){

	}

	public PhaseId getPhaseId(){
		return null;
	}
	
	public void setAplicacionBean(AplicacionBean aplicacionBean) {
		this.aplicacionBean = aplicacionBean;
	}

	public AplicacionBean getAplicacionBean() {
		return aplicacionBean;
	}
	public String getCargaConfig() {
		try {
			AplicacionSimple apli = aplicacionBean.getAplicacion();
			if (apli == null) {
				cargaConfig = "Error: No se identifico el tipo de aplicacion " + aplicacionBean.getTipoAplicacion();
			}
			else {
				aplicacionBean.getAplicacion().cargaConfig();
				cargaConfig = "OK";
			}
			
		}catch(Exception e) {
			cargaConfig = "Error: " + e.getMessage();
			e.printStackTrace();
		}
		return cargaConfig;
	}
}