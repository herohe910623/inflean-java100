import java.util.Locale;
import java.util.Scanner;

class Test2_1 {
    int a;
    public Test2_1(int a) {
        this.a=a;
    }
}

public class Test2 {
    public static void main(String[] args) {
        int num1 = 2 ,num2 = 3;
        plus(num1,num2);
        int sum = plus2(num1, num2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 소문자 : ");
        String str = scanner.nextLine();
        System.out.println(upperCase(str));

        Test2 test2 = new Test2();
        test2.notStatic();

        int a = 100;
        sum(a);
        System.out.println(a);

    }
    public static void plus(int num1,int num2){
        System.out.printf("%d + %d" ,num1,num2);
        int sum = num1 + num2;
        System.out.println("를 더한 값 : "+ sum);
    }
    public static int plus2(int num1, int num2) {
        System.out.printf("%d + %d", num1,num2);
        int sum = num1 + num2;
        System.out.println("를 더한 값 : " + sum);
        return sum;
    }
    public static String upperCase(String str) {
        String upperStr = str.toUpperCase();
        return upperStr;
    }
    public void notStatic() {
        System.out.println("not Static Method");
    }

    public static void sum(int a) {
        System.out.println(a);
    }


}
