import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

//        문제
//        숫자 카드는 정수 하나가 적혀져 있는 카드이다.
//        상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때,
//        이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.

//        입력
//        첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다.
//        둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다.
//        숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
//        셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다.
//        넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수가 주어지며,
//        이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

//        출력
//        첫째 줄에 입력으로 주어진 M개의 수에 대해서,
//        각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.

//        풀이방법
//        배열을 정렬하여 찾고자 하는 값이 있는 처음 인덱스와 마지막 인덱스를 구한다.
//        이 둘의 차이가 갖고 있는 카드의 개수가 된다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 보유한 카드 덱 초기화
        int deckSize = Integer.parseInt(br.readLine());
        int[] deck = new int[deckSize];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < deckSize; i++) {
            deck[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(deck);

        // 검사 진행
        int testCase = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < testCase; i++) {
            int target = Integer.parseInt(st.nextToken());
            int result = getHighestIdx(deck, target) - getLowestIdx(deck, target);
            sb.append(result).append(" ");
        }

        System.out.println(sb);

    }

    public static int getLowestIdx(int[] arr, int number) {
        int leftIdx = 0;
        int rightIdx = arr.length;
        while (leftIdx < rightIdx) {
            int middleIdx = (leftIdx + rightIdx) / 2;
            if (arr[middleIdx] >= number) {
                rightIdx = middleIdx;
            } else {
                leftIdx = middleIdx + 1;
            }
        }
        return leftIdx;
    }

    public static int getHighestIdx(int[] arr, int number) {
        int leftIdx = 0;
        int rightIdx = arr.length;
        while (leftIdx < rightIdx) {
            int middleIdx = (leftIdx + rightIdx) / 2;
            if (arr[middleIdx] > number) {
                rightIdx = middleIdx;
            } else {
                leftIdx = middleIdx + 1;
            }
        }
        return leftIdx;
    }

}
