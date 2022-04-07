public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("meow");
    }

    public static void main(String[] args) {
        Animal obj = new Cat();
        Animal obj2 = new Horse();
        obj.sound();
        obj2.sound();
    }
}
