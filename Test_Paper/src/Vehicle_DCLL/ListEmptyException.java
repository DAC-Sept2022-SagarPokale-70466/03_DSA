/**
* @Developer : Sagar_Pokale
* 03-Nov-2022 10:33:50 PM
**/

package Vehicle_DCLL;
public class ListEmptyException extends Exception{
	private static final long serialVersionUID = 8518382662880327739L;
	String msg;
	
	public ListEmptyException(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
