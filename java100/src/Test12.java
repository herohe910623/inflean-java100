import java.util.Arrays;

public class Test12 {

    public static void main(String[] args) {
        int values[] = {1,3,2,2,1,3,1,1,8,0};
        int input[] = new int[10];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < values.length ; j++) {
                if ((values[j])==i) {
                     input[i]+=1;
                }
            }
            System.out.println(i + " 의 횟수는 "  + input[i] + " 번 " );
        }
    }
}
