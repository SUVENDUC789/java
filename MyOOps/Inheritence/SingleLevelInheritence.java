/* Dog [is-a] Animal */

class Animal {
    public void eat() {
        System.out.println("It Work ! Daily eating is nessasary ");
    }
}

class Dog extends Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}