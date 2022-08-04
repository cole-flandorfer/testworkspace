package superClass;

public class SuperClass {

	public static void main(String[] args) {
		SubSuper class1 = new SubSuper();
		System.out.println(class1.getMsg() + "\n" + class1.getSuperMsg()); //super.variable
		
		class1.callSuper(); //super.method
		
		SubSuper class2 = new SubSuper("Message passed in");//super constructor
		System.out.println(class2.getSuperMsg() + "\n" + class2.getMsg());

	}

}
