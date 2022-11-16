import java.util.ArrayList;
import java.util.Arrays;

//TODO
/**
 * ArrayList 2차원 배열
 *    // list2.get(0).size() --> 컬렉션 프레임워크 타입의 길이를 알고 싶을 때 사용
 *    // list2.get(0).length() --> 문자열의 길이를 알고 싶을 때 사용
 *    // list2.get(0).length --> 배열(int[], Integer[], String[]) 의 길이를 알고 싶을 때 사용
 */

public class Test21 {

    public static void main(String[] args) {

        System.out.println("=======list========");
        ArrayList<Integer> list[] = new ArrayList[3];
        for (int i = 0 ; i<list.length ; i++) {
            list[i] = new ArrayList<>();       // 3개의 리스트 배열이 생성
            for (int j = 0 ; j<4 ; j++) {       // 리스트 배열에 값을 넣어주는 과정
                list[i].add(j+(i*10));      // add 해줌
                System.out.print(list[i].get(j)+ " ");      // get 해줌
            }
            System.out.println();
            System.out.print(list[i] + " ");
            System.out.println();
        }
        System.out.println("=======list2========");

        ArrayList<Integer[]> list2 = new ArrayList<Integer[]>();        // list2 안에 배열이 있다.
        list2.add(new Integer[]{11,12,13,14});
        list2.add(new Integer[]{21,22,23,24});
        list2.add(new Integer[]{31,32,33,34});
        for (int i = 0 ; i< list2.size() ; i++){
            System.out.print(list2.get(i)[0] + " "); // 11 (0번째 배열의 첫번째 값), 21 (1번째 배열의 첫번째 값), 31(2번째 배열의 첫번째 값)   , 변수[0] = 똑같은 의미.
        }
        System.out.println();
        System.out.println("--전체 출력--");
        // 전체 요소 출력 --> 이중 반복문 --> 그런데, 그전에 안쪽 배열의 사이즈를 미리 체크 --> 여기서 약간 주의!
        // list2.get(0).size() --> 컬렉션 프레임워크 타입의 길이를 알고 싶을 때 사용
        // list2.get(0).length() --> 문자열의 길이를 알고 싶을 때 사용
        // list2.get(0).length --> 배열(int[], Integer[], String[]) 의 길이를 알고 싶을 때 사용
        for (int i=0 ; i < list2.size() ; i++) {                // 컬렉션 프레임워크 ArrayList 길이
            for (int j=0 ; j < list2.get(i).length ; j++) {     // 배열 길이인 length
                System.out.print(list2.get(i)[j] + " ");
            }
            System.out.println();
        }
    }
}
