class Mypoint{
	int x,y;

	Mypoint(){
		this.x = 0;
		this.y = 0;
	}
	
	Mypoint(int x, int y){
		this.x = x;
		this.y = y;
	}

	public String getData(){
		return "("+this.x+" , "+this.y+")";
	}

	public static  double linesegment (Mypoint m , Mypoint n){
		double m1 = (double)((m.y - n.y)/(m.x - n.x));
		return m1;
	}
}


class MyTest{
	public static void main(String [] args){
		Mypoint a = new Mypoint(2,8);
		Mypoint b = new Mypoint(3,4);

		System.out.println("Point is : "+a.getData());
		System.out.println("Point is : "+b.getData());

		System.out.println("M = "+Mypoint.linesegment(a,b));
		
	}
}