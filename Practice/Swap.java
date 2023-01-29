public class Swap{
	public static void main(String [] args){
		int a = 10 , b= 20;
		System.out.println("Before swap two number ....");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("After swap two number ....");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}