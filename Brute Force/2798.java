import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

//		문제
//		김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다.
//		그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다.
//		그런 후에 딜러는 숫자 M을 크게 외친다.
//		이제 플레이어는 제한된 시간 안에
//		N장의 카드 중에서 3장의 카드를 골라야 한다.
//		블랙잭 변형 게임이기 때문에,
//		플레이어가 고른 카드의 합은 M을 넘지 않으면서
//		M과 최대한 가깝게 만들어야 한다.
//		N장의 카드에 써져 있는 숫자가 주어졌을 때
//		M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.

//		입력
//		첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다.
//		둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
//		합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.

//		출력
//		첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다..

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int size = Integer.parseInt(st.nextToken()); // 카드의 개수
		int target = Integer.parseInt(st.nextToken()); // 목표 숫자
		int result = 0; // 고른 카드의 합계

		// 카드 덱 생성 및 초기화
		st = new StringTokenizer(br.readLine());
		int[] deck = new int[size];
		for (int i = 0; i < size; i++) {
			deck[i] = Integer.parseInt(st.nextToken());
		}

		// 3중첩 for 문으로 해결
		// 검사 - 3개의 카드를 중복없이 뽑아야 하므로 사이즈를 다르게 준다
		Loop: for (int i = 0; i < size - 2; i++) {
			for (int j = i + 1; j < size - 1; j++) {
				for (int k = j + 1; k < size; k++) {
					int sum = deck[i] + deck[j] + deck[k];
					if (sum == target) {
						result = sum;
						break Loop;
					}
					if (sum > result && target > sum) {
						result = sum;
					}
				}
			}
		}

		System.out.println(result);

	}

}
