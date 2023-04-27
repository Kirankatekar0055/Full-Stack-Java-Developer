
public class LowGradeException extends Exception {
	private String msg;
	
	
	
	public LowGradeException(String msg)
	{
		this.msg=msg;
	}
	public void printmsg()
	{
		System.out.println(msg);
	}

}
