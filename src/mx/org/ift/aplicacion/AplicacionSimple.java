package mx.org.ift.aplicacion;
import mx.org.ift.config.ConfigXML;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import mx.org.ift.archivos.Bitacora;
import mx.org.ift.jsf.controller.Persistente;

/**
 * @author HP
 * @version 1.0
 * @created 03-sep.-2018 04:07:58 p. m.
 */
public class AplicacionSimple extends Persistente {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipoAplicacion;
	private String nomAplicacion;
	private String version;
	private String entorno;
	private String url;

	private ConfigXML config;
	private String nomArchConfig;
	private Bitacora bitacora;

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void setNomAplicacion(String nomAplicacion) {
		this.nomAplicacion = nomAplicacion;
	}
	
	public void setNomArchConfig(String nomArchConfig) {
		this.nomArchConfig = nomArchConfig;
	}
	
	public void setTipoAplicacion(String tipoAplicacion) {
		this.tipoAplicacion = tipoAplicacion;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public void setURL(String url) {
		this.url = url;
	}
	
	public void setEntorno(String entorno) {
		this.entorno = entorno;
	}
	
	/**
	 * 
	 * @param nomAplicacion
	 * @param nomArchConfig
	 */
	public AplicacionSimple(String nomArchConfig){
		setNomArchConfig(nomArchConfig);
	}
	
	public void cargaConfig() throws ParserConfigurationException, SAXException, IOException {
		if (config == null)
			config = new ConfigXML(nomArchConfig);
		setNomAplicacion(config.getValor("aplicacion/General", "nomAplicacion"));
		setVersion(config.getValor("aplicacion/General", "version"));
		setURL(config.getValor("aplicacion/General", "urlAplicacion"));
		setEntorno(config.getValor("aplicacion/General", "entorno"));
	}

	public String getTipoAplicacion() {
		return tipoAplicacion;
	}
	
	public String getNomAplicacion(){
		return nomAplicacion;
	}

	public ConfigXML getConfig(){
		return config;
	}

	public String getEntorno(){
		return entorno;
	}

	public String getURL(){
		return url;
	}

	public String getVersion() {
		return version;
	}
	
	public Bitacora getBitacora(){
		return bitacora;
	}
	public void cargaBitacora() throws ParserConfigurationException, SAXException, IOException {
		if (config == null)
			config = new ConfigXML(nomArchConfig);
		String tipoBitacora = config.getValor("aplicacion/Bitacora", "tipoBitacora");
		String ruta = config.getValor("aplicacion/Bitacora", "rutaBitacora");
		String habilitado = config.getValor("aplicacion/Bitacora", "habilitado");
		bitacora = new Bitacora(nomAplicacion, tipoBitacora, ruta, habilitado);
	}

}