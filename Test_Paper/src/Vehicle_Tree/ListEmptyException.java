/**
* @Developer : Sagar_Pokale
* 04-Nov-2022 2:27:45 PM
**/

package Vehicle_Tree;
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
