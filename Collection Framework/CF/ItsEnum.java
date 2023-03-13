
public class ItsEnum {
    enum Week {
        Sunday,
        Monday,
        Tuesday,
        Wednusday,
        Thrusday,
        Friday,
        Saturday
    }

    public static void main(String[] args) {
        for (Week day : Week.values()) {
            System.out.println(day);
        }

        Week week = Week.Monday;
        System.out.println(week);
        System.out.println(week.ordinal());


    }
}
