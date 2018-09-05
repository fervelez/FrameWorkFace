package mx.org.ift.archivos;

/**
 * @author HP
 * @version 1.0
 * @created 03-sep.-2018 03:57:11 p. m.
 */
public class Repositorio {

	private String ruta;
	private String nomRepositorio;

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getNomRepositorio() {
		return nomRepositorio;
	}

	public void setNomRepositorio(String nomRepositorio) {
		this.nomRepositorio = nomRepositorio;
	}

	public Repositorio(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param ruta
	 * @param nomRepositorio
	 */
	public Repositorio(String ruta, String nomRepositorio){

	}

	/**
	 * 
	 * @param nomArchivo
	 * @param tipoArchivo
	 */
	public String iniCarga(String nomArchivo, int tipoArchivo){
		return "";
	}

	/**
	 * 
	 * @param idCarga
	 * @param bloque
	 */
	public void cargaTexto(String idCarga, String bloque){

	}

	/**
	 * 
	 * @param idCarga
	 * @param bloque
	 */
	public void cargaBinario(String idCarga, byte[] bloque){

	}

	/**
	 * 
	 * @param nomArchivo
	 */
	public byte[] descarga(String nomArchivo){
		return null;
	}

}