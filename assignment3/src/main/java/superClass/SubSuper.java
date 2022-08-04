package superClass;

public class SubSuper extends SuperSuper{
	String msg;
	
	SubSuper(){
		this.msg = "Hello from the sub class!";
	}
	SubSuper(String s){
		super(s);
		this.msg = "sub-message: " + super.msg;
	}
	
	public String getMsg() {
		return this.msg;
	}
	
	public String getSuperMsg() {
		return super.msg;
	}
	
	public void callSuper() {
		super.printMsg();
	}
		
}
