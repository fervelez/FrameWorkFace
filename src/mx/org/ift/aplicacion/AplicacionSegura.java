package mx.org.ift.aplicacion;

/**
 * @author HP
 * @version 1.0
 * @created 03-sep.-2018 04:08:03 p. m.
 */
public class AplicacionSegura extends AplicacionSimple {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPerfil() {
		return Perfil;
	}

	public void setPerfil(String perfil) {
		Perfil = perfil;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getIdSesion() {
		return idSesion;
	}

	public void setIdSesion(String idSesion) {
		this.idSesion = idSesion;
	}

	public AplicacionSegura(String nomAplicacion, String nomArchConfig) {
		super(nomArchConfig);
		// TODO Auto-generated constructor stub
	}

	private String usuario;
	private String Perfil;
	private String token;
	private String idSesion;

	
	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param usuario
	 * @param contrasenia
	 */
	public void iniSesion(String usuario, String contrasenia){

	}

	public void cierraSesion(){

	}

}