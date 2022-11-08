package User_Expection;

public class ListEmptyException extends Exception{

	private static final long serialVersionUID = -5424877103829717645L;

	String msg;
	
	public ListEmptyException(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
	
}
