class Test{
	public static void main(String [] args){
		Cube c = new Cube(10);
		System.out.println("Cube volume are : "+c.getVolume( ));

		Cylinder ch = new Cylinder(10,20);
		System.out.printf("Cylinder volume are : %.2f",ch.getVolume( ));
		
	}
}

class Cube{
	double side;
	Cube(double side){
		this.side = side;
	}

	public double getVolume( ){
		return (this.side * this.side * this.side);
	}
}

class Cylinder extends Cube{
	double height ;
	Cylinder(double side,double height){
		super(side);
		this.height=height;
	}

	@Override
	public double getVolume( ){
		return Math.PI * this.side * this.side * this.height;
	}
	
}

