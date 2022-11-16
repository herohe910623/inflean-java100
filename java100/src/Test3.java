import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test3 {

    public static String[] testMethod() {
        String char1 = "korea";
        String char2 = "USA";
        return new String[]{char1,char2};
    }

    public static void main(String[] args) {
        String[] result = testMethod();
        String upperResult = Arrays.toString(result).toUpperCase();

        System.out.println(Arrays.toString(result));
        System.out.println(upperResult);

    }
}
