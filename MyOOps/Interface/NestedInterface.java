public class NestedInterface implements Person.Students {
    public void show() {
        System.out.println("I am a Students");
    }

    public static void main(String[] args) {
        NestedInterface a = new NestedInterface();
        a.show();

    }
}
interface Person {
    interface Students {
        void show();
    }
}

