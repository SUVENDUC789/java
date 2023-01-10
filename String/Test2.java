// Object class is the all class parent class in the java 

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("Suvendu");
        String s2 = new String("Suvendu");

        System.out.println("Pointing address same or not : "+(s1 == s2));// False
        System.out.println("Check both content are same or not : "+s1.equals(s2));

        String s3 = "Rahul";
        String s4 = "Rahul";

        System.out.println("Pointing address same or not : "+(s3 == s4));// True
        System.out.println("Check both content are same or not : "+s3.equals(s4));

    }
}
