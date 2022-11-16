import java.util.Arrays;

class Volunteer {
    private int number;
    private int age;
    private String name;

    public Volunteer() {
    }

    public Volunteer(int number, int age) {
        this.number = number;
        this.age = age;
    }

    public Volunteer(int number, int age, String name) {
        this.number = number;
        this.age = age;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Test7 {
    public static void main(String[] args) {
        int num = 0;
        int age = 20;
        Volunteer volunteer = new Volunteer(num, age);
        int volunteerNumber = volunteer.getNumber();
        int volunteerAge = volunteer.getAge();
        for (int i = 0; i < 10; i++) {
            System.out.println(volunteerNumber++ + "번 후보자 --> 나이" + volunteerAge++);
        }
        System.out.println("=============");

        Volunteer[] volunteers = new Volunteer[5];
        volunteers[0] = new Volunteer(1, 20, "홍길동");
        volunteers[1] = new Volunteer(2, 21, "길동");
        volunteers[2] = new Volunteer(3, 22, "홍길");
        volunteers[3] = new Volunteer(4, 23, "홍동");
        volunteers[4] = new Volunteer(5, 24, "홍길동2");
        for (int i = 0; i < volunteers.length; i++) {
            System.out.println(i + "번 후보자 --> 나이:" + volunteers[i].getAge() + " 이름:" + volunteers[i].getName());
        }

        Volunteer[] volunteers2 = new Volunteer[5];
        for (int i = 0; i < volunteers2.length; i++) {
            volunteers2[i] = new Volunteer(i, i + 20);
            System.out.println(volunteers2[i].getAge());
        }

    }
}
