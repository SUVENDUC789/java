import java.util.*;

public class Word{
	public static int countWord(String s){
		s=s.trim();
		int c=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				c++;
			}
		}
		return c+1;
	}
	
	private static String reverse(String s){
		String ns = "";
		for(int i=s.length()-1;i>=0;i--){
			ns+=s.charAt(i);
		}
		return ns;
	}

	public static String reverseWord(String s){
		String []sp=s.split(" ");
		//System.out.println(Arrays.toString(sp));
		
		for(int i=0; i<sp.length; i++){
			sp[i]=reverse(sp[i]);
		}
		
		//System.out.println(Arrays.toString(sp));

		return String.join(" ",sp);
	}

	public static void main(String [] args){
		String sen = "Hi how are you Tony stark";
		System.out.println("Number of words are : "+countWord(sen));
		System.out.println("Reverse word in String are : "+reverseWord(sen));		
		
	}
}