package superClass;

public class SuperSuper {
	String msg;
	
	SuperSuper(){
		this.msg = "Hello from the super class!";
	}
	SuperSuper(String s){
		this.msg = s + "\nSET BY SUPER\n";
	}
	
	public void printMsg() {
		System.out.println(this.msg);
	}
}
