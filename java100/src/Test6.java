public class Test6 {
    public static void main(String[] args) {
        Monster zombie = new Monster("좀비", 10, 180, 80, 1, 1, 100);
        zombie.printMonster();
        zombie.walk();
        System.out.println("===========");

        Monster doggabie = new Monster("도깨비", 11, 190, 100, 5, 5, 80);
        doggabie.printMonster();
        doggabie.walk();
        System.out.println("============");
    }
}

class Monster extends Information {
    //field
    private int number;
    private int weapon;
    private double power;

    //construct
    public Monster(){}
    public Monster(String name, int age, int height, int weight, int number, int weapon, double power){
        super(name,age,height,weight);
        this.number = number;
        this.weapon = weapon;
        this.power = power;
    }

    //getter,setter
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public int getWeapon() {
        return weapon;
    }
    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }

    //method
    public void printMonster() {
        System.out.println("이름 : " + getName());
        System.out.println("나이 : " + getAge());
        System.out.println("키 : " + getHeight());
        System.out.println("체중 : " + getWeight());
        System.out.println("넘버 : " + getNumber());
        System.out.println("무기 : " + getWeaponName(getWeapon()));
        System.out.println("파워 : " + getPower());
    }

    public String getWeaponName(int num) {
        String weapon;
        switch (num) {
            case 1:
                weapon = "칼";
                break;
            case 2:
                weapon = "총";
                break;
            case 3:
                weapon = "방패";
                break;
            default:
                weapon = "----";
                break;
        }
        return weapon;
    }

    void walk() {
        System.out.println(getName() + " 이동 중");
    }
}

class Information {
    //feild
    private String name;
    private int age;
    private int height;
    private int weight;

    //construct
    public Information() {}
    public Information(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    //getter,setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    //method
}


