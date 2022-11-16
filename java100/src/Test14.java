public class Test14 {

    public static void main(String[] args) {

        int sum;

        out:for (int i = 0 ; i < 4 ; i++) {
            in:for (int j = 0 ; j < 10 ; j++) {
                int wave = i*10 + j;

                if (j%2 != 0) {
//                    if (j==1){
//                        System.out.println();
//                        continue out;
//                    }
                    continue;
                }
                System.out.print(wave + " ");
            }
            System.out.println();
        }


        //TODO
        //0     2       4       6       8       => 0
        //10    12      14      16      18      => 10 countinue label 을 사용하여 출력
        //20    22      24      26      28
        //30    32      34      36      38
    }
}
