package mx.org.ift.archivos;

import java.io.File;
//import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.xml.parsers.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author HP
 * @version 1.0
 * @created 03-sep.-2018 03:57:15 p. m.
 */
public class ArchivoXML {

	private String nomArchivo;
	Document doc;

	public void finalize() throws Throwable {
		
	}

	public void setNomArchivo(String nomArchivo) throws 
					ParserConfigurationException, SAXException, IOException {
		this.nomArchivo = nomArchivo;
		DocumentBuilderFactory domFactory = DocumentBuilderFactory
                .newInstance();
		domFactory.setNamespaceAware(true);
		DocumentBuilder builder = domFactory.newDocumentBuilder();
		//doc = builder.parse(new File(nomArchivo));
		
        ClassLoader ccl = Thread.currentThread().getContextClassLoader();
        URL resource = ccl.getResource(nomArchivo);
        
        doc = builder.parse(new File(resource.getPath().substring(1)));
	}
	
	public String getNomArchivo() {
		return nomArchivo;
	}

	/**
	 * 
	 * @param nomArchivo
	 */
	public ArchivoXML(String nomArchivo) throws 
	ParserConfigurationException, SAXException, IOException{
		setNomArchivo(nomArchivo);
	}

	public Node getNodo(NodeList nodo, String ruta) {
		String[] cadenas = ruta.split("/");
		if (cadenas.length >= 1 && !cadenas[0].equals("")) {
			String nuevaRuta = "";
			if (ruta.indexOf("/") > 0)
				nuevaRuta = ruta.substring(ruta.indexOf("/") + 1);
			int i = 0;
			boolean encontrado = false;
			while (!encontrado && i < nodo.getLength()) {
				if (nodo.item(i).getNodeName().equals(cadenas[0])) {
					encontrado = true;
				}else
				  i++;
			}
			if (encontrado) {
				NodeList nodos = nodo.item(i).getChildNodes();
				if (nodos != null && nodos.getLength() >= 1)
					return getNodo(nodos, nuevaRuta);
				}
			return null;
		}else {
			return nodo.item(0);
		}				
	}
	/**
	 * 
	 * @param ruta
	 */
	public String getValor(String ruta){
		String[] cadenas = ruta.split("/");
		
		if (cadenas.length >= 1) {
			String nuevaRuta = "";
			if (ruta.indexOf("/") > 0)
				nuevaRuta = ruta.substring(ruta.indexOf("/") + 1);
			NodeList nodos = doc.getElementsByTagName(cadenas[0]);
			Node nodo = getNodo(nodos.item(0).getChildNodes(), nuevaRuta);
			if (nodo != null )
				return nodo.getNodeValue();
			
		}
		return "";
	}

	/**
	 * 
	 * @param ruta
	 * @param Valor
	 */
	public void setValor(String ruta, String valor){
		String[] cadenas = ruta.split("/");
		
		if (cadenas.length >= 1) {
			String nuevaRuta = "";
			if (ruta.indexOf("/") > 0)
				nuevaRuta = ruta.substring(ruta.indexOf("/") + 1);
			NodeList nodos = doc.getElementsByTagName(cadenas[0]);
			Node nodo = getNodo(nodos.item(0).getChildNodes(), nuevaRuta);
			if (nodo != null )
				nodo.setNodeValue(valor);
			
		}
	}
	
}