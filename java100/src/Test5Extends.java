public class Test5Extends {
    public static void main(String[] args) {
        Person person = new Person();
        Hero hero = new Hero();
        person.walk();
        hero.walk();
        Hero gijin = new Hero(10, "gijin", 100);
        System.out.println(gijin.age);
    }
}

class Person {
    String name;
    int age;

    Person() {}
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void walk() {
        System.out.println("걸어가고 있습니다.");
    }
    void eat() {
        System.out.println("먹고 있습니다.");
    }
}

class Hero extends Person{
    private int power;
    Hero() {}
    Hero(int power) {
        this.power = power;
    }
    Hero(int age, String name, int power) {
         super.age = age;
        super.name = name;
        this.power = power;
    }
    void fly() {
        System.out.println("날아가고 있습니다.");
    }
    void save() {
        System.out.println("구하고 있습니다.");
    }
    @Override
    void walk() {
        System.out.println("2배로 걸어가고 있습니다.");
    }
}

