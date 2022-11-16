import java.util.Arrays;

public class Test16 {
    //TODO
    /**
     * 1번 후보 --> 2표
     * 2번 후보 --> 2표
     * 3번 후보 --> 3표
     * 가장 많은 득표 수 --> 3표 이고, 후보자는 3번 후보자 입니다.
     * 과반수 이상 실패했습니다. --> 미당선
     *
     * 3명 후보자를 두고 10명의 학생이 투표
     */

    public static void main(String[] args) {
        int[] voter = new int[10]; // 투표자
        int candidate[] = {1, 2, 3}; // 후보자
        int count[] = new int[3]; // 득표 횟수
        int countMax; // 최다 득표 구하기 위한 변수 선언
        int countIndex = 0; // 득표 인덱스
        int indexCount[] = new int[3];  //최다 복수 인덱스 ex)최다 동표

        //투표자 랜덤값 넣어주기
        for (int r = 0; r < voter.length; r++) {
            voter[r] = (int) (Math.random() * 10) % 3 + 1;
        }
        // 투표값 찍어보기
        System.out.println(Arrays.toString(voter));

        //빈도수 확인하기
        out:
        for (int i = 0; i < candidate.length; i++) {
            for (int j = 0; j < voter.length; j++) {
                // voter의 인덱스 값과 candidate 의 인덱스 값이 같을때
                if (candidate[i] == voter[j]) {
                    count[i]++;
                }
            }
            System.out.print(candidate[i] + " 번 후보 -->" + count[i] + " 표 "); // 3번만 출력
            System.out.println();
        }
        //countMax 의 값을 count[0]으로 초기화
        countMax = count[0];


        // 가장 많은 득표 수 배열메소드 사용
//        System.out.println(Arrays.stream(count).max().getAsInt());
        // 가장 많은 득표 수, 가장많은 득표 후보자 구하기
        for (int k = 0; k < count.length; k++) {
            if (count[k] == Arrays.stream(count).max().getAsInt()) { // 가장 많은 득표 수 배열메소드 사용
                countMax = count[k];
                countIndex = k;
                indexCount[countIndex]++;
            }

        }
        System.out.print("가장 많은 득표 수 --> " + countMax + " 표 이고, 당선은 ");
        for (int l = 0 ; l<indexCount.length ; l++) {
            if (indexCount[l] == 1) {
                System.out.print((l+1) + " 번 후보자 ");
            }
        }
        System.out.println(" 입니다.");

        //과반수 이상 득표 하였는가?
        boolean majority = countMax > (voter.length/2);
        if (majority)
            System.out.println("과반 수 이상 득표받았습니다. --> 당선");
        else
            System.out.println("과반 수 이상 득표 못받았습니다. --> 미당선");
    }

    //FIXME
    /**
     *
     */
}
