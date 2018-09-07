package mx.org.ift.archivos;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
	private boolean habilitado = true;

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	final static String TIPO_BITACORA_ARCHIVO = "FILE";
	final static String TIPO_BITACORA_WEB_SERVICE = "WS";
	final static String SI = "SI";
	final static String NO = "NO";
	
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
	public Bitacora(String nomAplicacion, String tipoBitacora, String ruta, String habilitado){
		setTipoBitacora(tipoBitacora);
		setNomAplicacion(nomAplicacion);
		setRuta(ruta);
		setHabilitado(habilitado.equals(SI));
	
	}

	/**
	 * 
	 * @param modulo
	 * @param componente
	 * @param evento
	 * @param descripcion
	 * @param registroAfectado
	 * @throws IOException 
	 */
	public void registraEvento(String modulo, String componente, String evento, String descripcion, String registroAfectado) throws IOException{
		
		if (!habilitado)
			return;
		Date fecha = new Date();
		SimpleDateFormat frmArchivo = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat frmFechaCorta = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		char tab = (char)9;
		
		String Registro = frmFechaCorta.format(fecha) + tab + nomAplicacion + tab + modulo + 
				tab + componente + tab + evento + tab + descripcion + tab + registroAfectado;
		if (tipoBitacora.equals(TIPO_BITACORA_ARCHIVO)) {
			File dir = new File(ruta);
			
			if (!dir.exists()) {
				dir.mkdir();
			}
				
			
			String nomArchivo = nomAplicacion + "_" + frmArchivo.format(fecha) + ".log";
			File archivo = new File(ruta + nomArchivo);
			
			String encabezado = "";
			if (!archivo.exists()) {
				encabezado = "Fecha y Hora" + tab + "Nom. Aplicacion" + tab + "Módulo" + tab + 
						"Componente" + tab + "Evento" + tab + "Descripción" + tab + "RegistroAfectado";
				archivo.createNewFile();
			}
			/*
			PrintWriter writer = new PrintWriter(archivo, "UTF-8");
			if (!encabezado.equals(""))
	    		writer.println(encabezado);
			writer.append(Registro);
			writer.close();
			*/
			
			FileWriter  fw = new FileWriter(archivo.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			if (!encabezado.equals("")) {
				bw.write(encabezado);
				bw.newLine();
				bw.flush();
			}
			bw.write(Registro);
			bw.newLine();
			bw.flush();
			if (bw != null)
				bw.close();

			if (fw != null)
				fw.close();
		}
	}

}