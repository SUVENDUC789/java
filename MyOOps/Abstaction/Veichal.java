abstract class Veichal extends Object {
    abstract void start();
}

final class Car extends Veichal {
    @Override
    void start() {
        System.out.println("Car starts with key");
    }

}

final class Scooter extends Veichal {
    @Override
    void start() {
        System.out.println("Starts with kick");
    }
}

abstract class Test extends Veichal {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();

        Scooter sc = new Scooter();
        sc.start();

    }
}
