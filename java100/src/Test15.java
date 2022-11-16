public class Test15 {
    public static void main(String[] args) {
        int row[] = new int[5];
        int column[] = new int[5];
//        int star[][] = new int[5][5];

        for (int i = 0 ; i<row.length ; i++) {
            for (int j = 0 ; j<column.length ; j++) {
                if (i==2 && j==2) {
                    System.out.print("별");
                }else {
                    System.out.print("ㅁ");
                }
            }
            System.out.println();
        }
    }

    //TODO
    /**
     * ㅁ   ㅁ   ㅁ   ㅁ   ㅁ
     * ㅁ   ㅁ   ㅁ   ㅁ   ㅁ
     * ㅁ   ㅁ   별   ㅁ   ㅁ
     * ㅁ   ㅁ   ㅁ   ㅁ   ㅁ
     * ㅁ   ㅁ   ㅁ   ㅁ   ㅁ
     */
}
