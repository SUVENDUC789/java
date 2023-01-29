class Box{
	int length,breath,height;

	Box(int length , int breath, int height){
		this.length = length;
		this.breath = breath;
		this.height = height;
	}

	Box(Box b){
		this.length = b.length;
		this.breath = b.breath;
		this.height = b.height;
	}
	
	public int Volume(){
		return this.length * this.breath * this.height;
	}
}

class Driver{
	public static void main(String [] args){
		Box b = new Box (10,20,30);
		Box b1 = new Box (b);

		System.out.println("Get volume = "+b.Volume());
		System.out.println("Get volume = "+b1.Volume());
	}
}