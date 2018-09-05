package mx.org.ift.archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @author HP
 * @version 1.0
 * @created 03-sep.-2018 03:57:14 p. m.
 */
public class Bitacora {

	private String tipoBitacora;
	private String ruta;
	private String nomAplicacion;

	final static String TIPO_BITACORA_ARCHIVO = "FILE";
	final static String TIPO_BITACORA_WEB_SERVICE = "WS";
	
	public Bitacora(){

	}

	public void finalize() throws Throwable {

	}

	public void setTipoBitacora(String tipoBitacora) {
		this.tipoBitacora = tipoBitacora;
	}
	
	public String getTipoBitacora() {
		return tipoBitacora;
	}
	
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	public String getRuta() {
		return ruta;
	}
	
	public void setNomAplicacion(String nomAplicacion) {
		this.nomAplicacion = nomAplicacion;
		
	}
	
	public String getNomAplicacion() {
		return nomAplicacion;
	}
	
	/**
	 * 
	 * @param tipoAplicacion
	 * @param nomAplicacion
	 * @param ruta
	 */
	public Bitacora(String tipoBitacora, String nomAplicacion, String ruta){
		setTipoBitacora(tipoBitacora);
		setNomAplicacion(nomAplicacion);
		setRuta(ruta);
	}

	/**
	 * 
	 * @param modulo
	 * @param componente
	 * @param evento
	 * @param descripcion
	 * @param registroAfectado
	 */
	public void registraEvento(String modulo, String componente, String evento, String descripcion, String registroAfectado){
		Date fecha = new Date();
		
		String Registro = fecha + "\\t" + nomAplicacion + "\\t" + modulo + 
				"\\t" + componente + "\\t" + evento + "\\t" + descripcion + "\\t" + registroAfectado;
		if (tipoBitacora == TIPO_BITACORA_ARCHIVO) {
			try {
				File archivo = new File(ruta);
				String encabezado = "";
				if (archivo.exists())
					encabezado = "Fecha y Hora\\tNom. Aplicacion\\tMódulo\\tComponente\\tEvento\\tDescripción\\tRegistroAfectado";
				FileWriter fw = new FileWriter(ruta, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw);
			    if (!encabezado.equals(""))
			    	out.println(encabezado);
				out.println(Registro);
			    out.close();
			} catch (Exception e) {
			    e.printStackTrace();
			}
		}
	}

}