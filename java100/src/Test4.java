public class Test4 {

    public static void main(String[] args) {
        DtoClass gildong = new DtoClass(20, "홍길동");
        System.out.println(gildong.toString());
    }
}

class DtoClass {
    private int age;
    private String name;

    public DtoClass(int age, String name) {
        this.age = age;
        this.name = name;
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

    @Override
    public String toString() {
        return "DtoClass{" +
                "나이=" + age +
                ", 이름='" + name + '\'' +
                '}';
    }
}
