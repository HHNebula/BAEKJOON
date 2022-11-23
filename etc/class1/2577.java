import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

//		문제
//		세 개의 자연수 A, B, C가 주어질 때
//		A × B × C를 계산한 결과에
//		0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

//		예를 들어 A = 150, B = 266, C = 427 이라면
//		A × B × C = 150 × 266 × 427 = 17037300 이 되고,
//		계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

//		입력
//		첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다.
//		A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.

//		출력
//		첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다.
//		마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에
//		1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 숫자 3개 입력 받기
		int[] num = new int[3];
		for (int i = 0; i < 3; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}

		// 3개의 수를 곱한 다음 문자열 형식으로 저장
		String result = Integer.toString(num[0] * num[1] * num[2]);

		// 출력 횟수를 담을 배열
		int[] print = new int[10];

		// 출력 횟수 구하기
		for (int i = 0; i < result.length(); i++) {
			print[result.charAt(i) - 48]++; // 아스키 코드이므로 -48을 해줌
		}

		// 출력
		for (int i : print) {
			System.out.println(i);
		}

	}

}
