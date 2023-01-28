import java.util.*;

public class Test{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		//System.out.println("Hello");
		try{
			int [] a = new int [5];
			for(int i=0;i<5;i++){
				System.out.printf("Enter number [%d] : ",(i+1));
				int ele = sc.nextInt();
				if(ele >= 0){
					a[i]=ele;
				}
				else{
					throw new ArrayNegativeElementException("You could not add negative value");
				}
				
				
			}
			
			System.out.println("Array element are : "+Arrays.toString(a));
		}
		catch(ArrayNegativeElementException anee){
			anee.printStackTrace();
		}
		System.out.println("Programme normally terminated ... ");
	}
}

//create uncheck Exception
class ArrayNegativeElementException extends RuntimeException{
	ArrayNegativeElementException(String s){
		super(s);
	}	
}