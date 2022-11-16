class Dog extends Animal{
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}
class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("야옹");
    }
}
abstract class Animal {
    private int number;

    public Animal(){}
    public Animal(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    abstract void cry();
}

public class Test8 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();
        Dog dog = new Dog();
        dog.cry();

    }
}
