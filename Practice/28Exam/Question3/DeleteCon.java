class Test{
	public static void main(String [] Suvendu){
		String sen = "abcdefghij";
		String ns = "";
		for(int i=0;i<sen.length();i++){
			if(sen.charAt(i)=='a' || sen.charAt(i)=='A' || sen.charAt(i)=='e' || sen.charAt(i)=='E' || sen.charAt(i)=='i' || sen.charAt(i)=='I' || sen.charAt(i)=='o' || sen.charAt(i)=='O' || sen.charAt(i)=='u' || sen.charAt(i)=='U'){
				//ns+=sen.charAt(i);
				continue;
			}else{
				ns+=sen.charAt(i);
			}
		}
		System.out.println("New String is : "+ns);
		
	}
}