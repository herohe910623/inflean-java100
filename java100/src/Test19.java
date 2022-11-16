//TODO

import java.util.ArrayList;

/**
 * ArrayList 를 구현해보시오.
 * ClassCastException 은 Compile 할때가 아니라 실행할때 발생한다.
 */
public class Test19 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("arrayList");
        list.add(100);
        list.add("GJ");
        list.add(200);

        for(Object list1:list) {
            System.out.println(list1.getClass());
            System.out.println(list1);
            System.out.println("===================");
        }

        /**
         * 결론
         * 이상으로 봤을때, 제네릭 문법을 사용하지 않으면 ArrayList는 내부적으로 Object 타입으로 처리됨을 알 수 있다.
         * 이렇게 get() 메서드를 사용할 때는 형변환을 주의해야 한다.
         *
         * 배열의 크기(size) --> 객체명.size()
        */

    }
}
