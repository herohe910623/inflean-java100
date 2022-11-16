public class Test17 {
    public static void main(String[] args) {
        Sample<String> s1 = new Sample<String>("sampling");
        s1.printOf();
        System.out.println(s1.getObj());
        System.out.println("------------------------------");

        Sample<Integer> s2 = new Sample<Integer>(10);
        s2.printOf();
        System.out.println(s2.getObj());
        System.out.println("------------------------------");


    }
}
class Sample<T> {
    private T obj;

    public Sample(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
    void printOf() {
        System.out.println(obj.getClass().getName());
    }
}
