import java.util.ArrayList;

//TODO

/**
 * ArrayList<String> 의 입력,삭제,수정 과정 학습
 */
public class Test20 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("을지문덕");
        list.add("징기스칸");
        for (String lists : list) {
            System.out.println(lists);
        }
        System.out.println("================삭제 후 출력");

        // list의 인덱스 전부 삭제
        list.removeAll(list);

        list.add("홍길동");
        list.add("이순신");
        list.add("강감찬");
        list.add("김유신");
//        String hong = list.get(0); // 형변환 없이 바로 사용 --> 타입안정성 좋다.
        list.set(0,"홍길둥2");
        for (String lists : list) {
            System.out.println(lists);
        }
        System.out.println("================입력,수정 후 출력");

    }
}
