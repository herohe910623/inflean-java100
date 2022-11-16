import java.util.Arrays;

abstract class Car {
    abstract void run();
}
class Ambulance extends Car {

    @Override
    void run() {
        System.out.println("삐뽀삐뽀");
    }
}
class Cultivator extends Car {

    @Override
    void run() {
        System.out.println("경운기 덜컹덜컹");
    }
}
class SportsCar extends Car{

    @Override
    void run() {
        System.out.println("부웅~ 빠르다");
    }
}

public class Test10 {
    public static void main(String[] args) {
        Car c1 = new Ambulance();
        Car c2 = new Cultivator();
        Car c3 = new SportsCar();

        Car cars[] = new Car[]{c1,c2,c3};

        Car cars2[] = {new Ambulance(),new Cultivator(),new SportsCar()};

        for(Car list : cars) {
            list.run();
        }
    }
}
