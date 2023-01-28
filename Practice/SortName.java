import java.util.Arrays;

class SortNameFriend{
    public static void main(String[] a)
    {
        String [] ab= {"Suvendu","Supratim","Hritik","Debarpan","Debojit","Alapon"};
      
        System.out.println("Before sort : "+Arrays.toString(ab));
        Arrays.sort(ab);
        System.out.println("After sort : "+Arrays.toString(ab));

    }
}