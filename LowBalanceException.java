
public class LowBalanceException extends Exception {
	
	private String msg;
	
	
	public LowBalanceException(String msg)
	{
		this.msg=msg;
	}
	public void printmsg()
	{
		System.out.println(msg);
	}


}
