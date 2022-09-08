package bctjavafeatures;

interface myFuninterface {
	default void addMethod() {
		System.out.println("Another example");
		System.out.println("Interface is mainly develop");
	}
	public void method1(String message);
}
public class Funinterface implements myFuninterface{
	public void method1(String message)
	{
		System.out.println("Message is: "+message);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funinterface in=new Funinterface();
		in.addMethod();
		in.method1("Good Afternoon Guys,");
		

	}

}
