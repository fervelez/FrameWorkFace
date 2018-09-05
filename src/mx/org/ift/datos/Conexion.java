package mx.org.ift.datos;
import java.sql.ResultSet;
import java.sql.Statement;

import mx.org.ift.archivos.ArchivoXML;
import mx.org.ift.config.ConfigXML;

/**
 * @author HP
 * @version 1.0
 * @created 04-sep.-2018 09:30:45 a. m.
 */
public class Conexion {

	private String usuario;
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getControlador() {
		return controlador;
	}

	public void setControlador(String controlador) {
		this.controlador = controlador;
	}

	public String getServidor() {
		return servidor;
	}

	public void setServidor(String servidor) {
		this.servidor = servidor;
	}

	public ArchivoXML getConfig() {
		return config;
	}

	public void setConfig(ArchivoXML config) {
		this.config = config;
	}

	public String getNomBaseDatos() {
		return nomBaseDatos;
	}

	public void setNomBaseDatos(String nomBaseDatos) {
		this.nomBaseDatos = nomBaseDatos;
	}

	public String getEsquema() {
		return esquema;
	}

	public void setEsquema(String esquema) {
		this.esquema = esquema;
	}

	private String url;
	private String controlador;
	private String servidor;
	private ArchivoXML config;
	private String nomBaseDatos;
	private String esquema;

	public Conexion(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param usuario
	 * @param contrasenia
	 * @param cofig
	 */
	public Conexion(String usuario, String contrasenia, ConfigXML cofig){

	}

	/**
	 * 
	 * @param sql
	 */
	public int ejecutaSentencia(String sql){
		return 0;
	}

	/**
	 * 
	 * @param sql
	 */
	public ResultSet ejecutaConsulta(String sql){
		return null;
	}

	public Statement getStatment(){
		return null;
	}

}