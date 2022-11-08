/**
* @Developer : Sagar_Pokale
* 03-Nov-2022 11:20:23 PM
**/

package Book_Stack;

public class stackFullException extends Exception {

	private static final long serialVersionUID = -7876885072389923490L;
	String error;

	public stackFullException(String error) {
		this.error = error;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}

class stackEmptyException extends Exception {

	private static final long serialVersionUID = 8864413095057854686L;
	String error;

	public stackEmptyException(String error) {
		this.error = error;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
