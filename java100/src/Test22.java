import java.util.ArrayList;
import java.util.Iterator;
//TODO
/**
 * Iterator 개념
 * 사전적 의미 --> '반복자' 라는 의미에서 어느정도 유추할 수 있듯이 Collection에 대한 '반복자' 이다.
 * 컬렉션 프레임워크내에는 다양한 컬렉션들이 있는데 요소(=원소)를 읽어올 때 Iterator 인터페이스로 표준화 하고 있다.
 * 보통 for 반복문을 사용하여 순회할 때 --> index 로 각 요소를 순회하거나 --> Iterator(반복자)를 이용하면 조금 더 편리하게 할 수 있다.
 * Iterator(반복자)는 인터페이스다 --> 그래서, 인터페이스내 선언된 메서드들이 있다 --> 주요 메서드 암기
 * hasNext(), next(), remove() --> 반환타입은 --> boolean, Object(제네릭), void
 * hasNext() --> 다음 요소가 있는지를 검사하여 true 를 리턴
 * next() --> 다음 요소를 리턴 --> 그런 후 다음 위치로 커서가 이동 --> Iterator 에서는 삭제하지 않고, 커서만 이동
 * remove() --> 제거
 *
 * next() 메서드의 경우 --> 배열에 값이 없을 때 사용하면 오류
 * 따라서 사전에 hasNext() 메서드를 사용하여 다음 요소가 있는지 확인 후에 next() 메서드로 안전하게 요소를 가져온다.
 *
 * Collection 인터페이스 --> iterator() 메소드를 정의하고 있고 --> 이를 상속받는게 List,Set 인터페이스이므로,
 * List,Set 인터페이스를 상속받아 구현한 클래스들 객체를 통해서 iterator() 메서드를 사용할 수 있음.
 *
 * Iterator(반복자) 를 쓰는 이유에 대해서 설명해보시오.
 * 컬렉션 프레임워크를 쓸 때 한번 이상은 꼭 만나게 되는 에러 메세지 --> java.util.ConcurrentModificationException
 * 이 오류 메세지는 보통 컬렉션 list 요소를 반복문 안에서 돌리면서 값을 삭제하고자 할 때 발생
 * 보통 반복문 안에서 remove() 메서드를 호출 할 때 발생
 * 그 외에도 , Iterator(반복자) 객체의 생성 순서에 따라서도 발생 --> 다양하다.
 *
 * 한 행씩 삭제하는 경우에는 별 문제가 없으나 --> 반복문 안에서 순회하면서 삭제시에는..
 * 반복문 들어가기 전의 기존 list 배열의 size(length) 나 index 정보 등이 변경되면서 --> 순회시 정보가 맞지 않아 오류가 발생.
 * 이를 해결하기 위해서는 --> Iterator(반복자)를 사용하여 순회하고 --> 그때 , iterator.remove() 메서드로 처리해야 한다.
 *
 */
public class Test22 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alligator");
        list.add("Hippo");
        list.add("Ostrich");
        list.add("Donkey");

        Iterator<String> iterator = list.iterator();

        System.out.println(iterator.hasNext());     //  true
        System.out.println(iterator.next());        //  Alligator
        System.out.println("=============");

        while(iterator.hasNext()) {
//            String str = iterator.next();
//            System.out.println(str);
            System.out.println(iterator.next());
        }
    }
}
