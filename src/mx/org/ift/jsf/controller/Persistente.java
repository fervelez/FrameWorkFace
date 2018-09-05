package mx.org.ift.jsf.controller; 
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;


/**
 * @author HP
 * @version 1.0
 * @created 03-sep.-2018 04:09:31 p. m.
 */
public abstract class Persistente implements PhaseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Persistente(){

	}

	public void finalize() throws Throwable {

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

}