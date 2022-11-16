import java.util.Arrays;
import java.util.Scanner;

public class TestJava {

    public static void main(String[] args) {
        System.out.println("Hello world");
        TestJava.threeOper();
        TestJava.loop();

        System.out.println((int)'A');
        TestJava.evenLoop();
        TestJava.arrayTest();
    }

    private static void threeOper() {
        int hour = 11;
        int test = hour <= 10? hour*100 : hour;
        System.out.println(test);

        String str = hour < 12? "오전" : "오후";
        System.out.println(str);
    }
    private static void loop() {
        for(int value = 1 ; value <= 3; value++) {
            System.out.print(value+" ");
        }
        System.out.println();
    }
    //1~ 30 까지의 짝수만
    private static void evenLoop() {
        int number = 1;
        while(number <= 30) {
            if (number%2 ==0)
                System.out.print(number + " ");
            number++;
        }
        System.out.println();
    }

    private static void arrayTest() {
        int array[] = new int[10];
        int[] array2 = new int[20];
        int[] array3;
        array3 = new int[5];

        System.out.println(array.length);

        array = new int[]{1, 2, 3, 4, 5, 6};
        for (int i : array) {
            System.out.printf(i+ " ");
        }
        System.out.println();

        array3[0] = 3;
        array3[1] = 11;
        array3[2] = 22;
        array3[3] = 33;
        array3[4] = 44;
        for (int i3 : array3) {
            System.out.print(i3 + " ");
        }
        System.out.println(array3[array3.length-1]);

        int array4[] = new int[]{55,88,60,100,90};
        for(int i=0 ; i<array4.length ; i++)
            System.out.print(array4[i]+ " ");
        System.out.println();

        String s = Arrays.toString(array4);
        System.out.println(s);

        System.out.println("===배열복사===");
        int[] copyArrays = {1,2,3,4,5};
        int[] copyArrays2 = {6,7,8,9,10};
        System.arraycopy(copyArrays,0,copyArrays2,1,1);
        System.out.println(Arrays.toString(copyArrays));
        System.out.println(Arrays.toString(copyArrays2));

        String[][] doubleArray = {
                {"1","2","3"},
                {"4","5","6"}
        };
        for(int i=0; i<doubleArray.length; i++){
            for (int j=0; j<doubleArray[i].length;j++){
                System.out.print(doubleArray[i][j]+" ");
            }
            System.out.println();
        }

        String[] nameArray = {"seo","gi","jin"};
        for (int i=0; i<nameArray.length;i++){
            for (int j=0; j<nameArray[i].length();j++){
                System.out.print(nameArray[i].charAt(j));
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("행 입력 : ");
        int inputRow = scanner.nextInt();
        System.out.print("열 입력 : ");
        int inputColumn = scanner.nextInt();

        System.out.println("===int 이중배열 입력값0으로 크기알아보기 Test===");
        int[][] table = new int[inputRow][inputColumn];
        System.out.println(Arrays.deepToString(table)+"방법1");
        for (int i = 0 ; i<table.length ; i++) {
            int[] inTable = table[i];
            for (int j = 0; j< inTable.length;j++) {
                System.out.print(table[i][j]);
            }
            System.out.println("방법2");
        }

        System.out.println("===Char 이중배열 입력값 넣기 Test===");

        char[][] charTable = new char[inputRow][inputColumn];
        String[] insultValue = new String[inputRow];

        for (int i=0; i<inputRow ;i++) {
            System.out.print((i+1)+"번째 "+inputColumn+"개 문자를 입력해주세요 : ");
            insultValue[i] = scanner.next();
            for (int j=0; j<inputColumn ;j++){
                charTable[i][j]= insultValue[i].charAt(j);
            }
        }
        System.out.println(Arrays.deepToString(charTable));
    }
}
