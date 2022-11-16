import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test11 {

    public static void main(String[] args) {
//        int values[] = {4,13,15,17,-2};
//        int max = values[0];
//        int min = values[0];
        Integer values[] = new Integer[10];
        Integer max = values[0];
        Integer min = values[0];

        //Random 값 넣어주기
        for (int i = 0; i < values.length; i++) {
            values[i] = (int)(Math.random()*100);
            System.out.print(values[i] + " ");
        }
        System.out.println();

        //큰 값 작은값 구해주기
//        for(int i = 0; i < values.length; i++) {
//            if (max < values[i])
//                max = values[i];
//            if (min > values[i])
//                min = values[i];
//        }

        System.out.print("큰 값은 : " + Arrays.stream(values).mapToInt(v -> v).max().getAsInt());
        System.out.println();
        System.out.print("작은 값은 : " + Arrays.stream(values).mapToInt(v -> v).min().getAsInt());
        System.out.println();

        System.out.println("===== 오름차순 배열 정렬하기 =====");
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
        System.out.println("====== 내림차순 배열 정렬하기 =====");
        Arrays.sort(values, Collections.reverseOrder());
        System.out.println(Arrays.toString(values));

    }
}
