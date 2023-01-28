class Thread1 extends Thread{
	String greet;

	Thread1(String greet){
		this.greet=greet;
	}

	@Override
	public void run(){
		System.out.println(this.greet);
	}
}

class Test{
	public static void main(String [] args){
		Thread1 t1 = new Thread1("Hello");
		t1.start();

		Thread1 t2 = new Thread1("Hi");
		t2.start();
		
	}
}