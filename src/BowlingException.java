
public class BowlingException extends Exception {
	private String errmsg;
	
	public BowlingException() {
		errmsg = "";
	}
	
	public BowlingException(String str) {
		errmsg = str;
	}
	
	public String getMessage() {
		return errmsg;
	}
}
