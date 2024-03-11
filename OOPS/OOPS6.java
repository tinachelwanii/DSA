//inheritance
public class OOPS6 {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }

    // Base class
    static class Animal {
        String color;

        void eat() {
            System.out.println("eats");
        }

        void breathe() {
            System.out.println("breathes");
        }
    }

    // Derived class
    static class Fish extends Animal {
        int Fins;

        void swim() {
            System.out.println("swims in water");
        }
    }
}
