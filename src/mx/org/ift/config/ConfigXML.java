package mx.org.ift.config;


import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import mx.org.ift.archivos.ArchivoXML;

/**
 * @author HP
 * @version 1.0
 * @created 03-sep.-2018 04:06:32 p. m.
 */
public class ConfigXML extends ArchivoXML {

	public ConfigXML(String nomArchivo) throws ParserConfigurationException, SAXException, IOException {
		super(nomArchivo);
		// TODO Auto-generated constructor stub
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param Seccion
	 * @param parametro
	 * @param valor
	 */
	public void setValor(String seccion, String parametro, String valor){
		setValor(seccion + "/" + parametro, valor);
	}

	/**
	 * 
	 * @param seccion
	 * @param parametro
	 */
	public String getValor(String seccion, String parametro){
		return getValor(seccion + "/" + parametro);
	}

}