public class Method2 {

    public static void main(String[] args) {
        final String s = "This is demo";
        System.out.println(s.replace("is", "was"));

        
        final String s1 = "suvendu";
        final String s2 = " chowdhury";

        final String[] favlang = { "Python", "Java", "C++", "C", "Js", "Php", "Django", "React", "Bootstrap", "Laravel",
                "Spring Boot" };

        // Join method is static method
        System.out.println("Favorite Programming language and Framework : " + String.join(" , ", favlang));

        // + Operator and concat Method
        System.out.println(s1 + 20 / 10);// suvendu2
        System.out.println(s1 + s2);// suvendu chowdhury
        System.out.println(s1.concat(s2));// suvendu chowdhury
        System.out.println(s1 + 20 + 22);// suvendu2022
        System.out.println(20 + 22 + s1);// 42suvendu
        System.out.println(20 + s1 + 22);// 20suvendu22
        // System.out.println(20 + s1 - 22);// Through Error

    }
}
