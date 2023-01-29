/*
1) 400
2) 4 and 100 not
*/


class LeapYear{
	public static void main(String [] args){
		int y = 2020;
		if(y % 4 == 0){
			if(y % 100 == 0){
				if(y % 400 == 0){
					System.out.println(y + " is leap year");
				}
				else{
					System.out.println(y + " is not leap year");
				}
			}
			else{
				System.out.println(y + " is  leap year");
			}
		}else{
			System.out.println(y + " is not leap year");
		}
	}
}