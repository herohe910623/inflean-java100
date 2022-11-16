interface Allowance {
    public static final String aaa = "코리아";
    int bbb = 100;

//Abstract Method
    public abstract void in(int price,String name);
    void out(int price,String name);
}
interface Train{
    void train(int training_pay,String name);
}
class Student extends Person10 implements Allowance,Train {

    void sss() {
        System.out.println("sss");
    }

    void method1() {
        System.out.println("Student Method");
        super.method1();
    }
    Student() {}
    public Student(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void in(int price, String name) {
        System.out.printf("%s 에게서 %d원 용돈 받았습니다.%n",name,price);
    }
    @Override
    public void out(int price, String name) {
        System.out.printf("%d 원 금액을 지출하였습니다.[지출용도 --> %s]%n",price,name);
    }
    @Override
    public void train(int training_pay, String name) {
        System.out.printf("[%s --> %d 원 입금완료]%n", name,training_pay);
    }
}
class Person10 {
    String name;
    int age;
    int weight;

    Person10() {}
    public Person10(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void method1(){
        System.out.println("Person Method");
    }
    void ppp() {
        System.out.println("ppp");
    }
    void wash(){
        System.out.println("씻다");
    }
    void study() {
        System.out.println("공부하다");
    }
    void play() {
        System.out.println("놀다");
    }
}
public class Test9 {
    public static void main(String[] args) {
        Student s1 = new Student("홍길동", 20, 85);
        s1.wash();
        s1.study();
        s1.play();
        s1.in(10000,"엄마");
        s1.out(10000,"편의점");
        s1.train(5000,"아빠");

        System.out.println(Allowance.aaa);
        System.out.println(Allowance.bbb);

        Student s2 = new Student();
        Person10 p1 = new Student();
        Person10 p2 = new Person10();
//        Student s3 = (Student) new Person10();

        p1.method1();
        p2.method1();
        s2.method1();

        System.out.println("-1.super--2.Cast---------");
        p1.method1();
        ((Student)p1).method1();

    }
}
