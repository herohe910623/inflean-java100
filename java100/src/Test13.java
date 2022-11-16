public class Test13 {

    public static void main(String[] args) {

//        for (int i=0 ; i<=30 ; i++) {
//            while(i%2==0){
//                System.out.println(i);
//                i++;
//
//            }
//        }

//        int i = 0;
//        while (i<30) {
//            i++;
//            if (i%2 == 0) {
//                System.out.println(i);
//                continue;
//            }
//        }

        int i = 0;
        while (i<30) {
            i++;
            if (i%2 != 0) {
                continue;       // continue 를 거치면 while문 처음으로 돌아간다.
            }
            System.out.println(i);
        }
    }
}
