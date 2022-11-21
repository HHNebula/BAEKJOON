import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

//		============= 문제 =============
//		수를 처리하는 것은 통계학에서 상당히 중요한 일이다.
//		통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다.
//		단, N은 홀수라고 가정하자.
//
//		산술평균 : N개의 수들의 합을 N으로 나눈 값
//		중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
//		최빈값 : N개의 수들 중 가장 많이 나타나는 값
//		범위 : N개의 수들 중 최댓값과 최솟값의 차이
//		N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

//		============= 입력 =============
//		첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 
//		단, N은 홀수이다. 그 다음 N개의 줄에는 정수들이 주어진다.
//		입력되는 정수의 절댓값은 4,000을 넘지 않는다.

//		============= 출력 =============
//		첫째 줄에는 산술평균을 출력한다.
//		소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
//		둘째 줄에는 중앙값을 출력한다.
//		셋째 줄에는 최빈값을 출력한다.
//		여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
//		넷째 줄에는 범위를 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numLength = Integer.parseInt(br.readLine()); // 입력될 숫자의 개수
		int[] numbers = new int[numLength]; // 입력될 숫자를 담을 배열
		int sum = 0; // 합계를 담을 변수
		int[] comes = new int[8001]; // 최빈값 구하기용 배열
		// 절댓값이 4000이라 -4000이 들어올 수 있으므로 최대값 보다 4001 크게 선언함

		for (int i = 0; i < numLength; i++) {
			numbers[i] = Integer.parseInt(br.readLine()); // 배열 초기화
			sum += numbers[i]; // 입력과 동시에 합계를 구함
			comes[numbers[i] + 4000]++; // 등장 횟수 증가
		}

		// 산술 평균 출력 - 소수점 아래 첫 번째 자리 반올림
		System.out.println(Math.round((float) sum / numLength));

		// 중앙값 출력 - 정렬 후 가운데 인덱스를 출력
		Arrays.sort(numbers);
		System.out.println(numbers[numLength / 2]);

		// 최빈값 구하기
		// 배열 count의 인덱스는 등장한 실제 값의 +4000임
		// 배열에 담긴 값은 등장 횟수임
		// count[0] == 10 이라면 -4000이 10번 등장한 것
		int come = 0; // 최빈값의 등장 횟수를 저장할 변수
		int firstHighCome = -4001; // 최빈값 중 제일 큰 수
		int secondHighCome = -4001; // 최빈값 중 두번째로 작은 수
		boolean isOverlap = false; // 최빈값 중복 여부

		for (int i = 0; i < 8001; i++) {
			if (comes[i] > come) { // 새로운 최빈값이 등장한다면
				isOverlap = false; // 중복이 아님으로 바꿔주고
				firstHighCome = i - 4000; // 새로운 최빈값을 저장
				come = comes[i]; // 최빈값의 등장 횟수 저장
			} else if (comes[i] == come) { // 등장 횟수가 동일한 최빈값이 등장한다면
				if (!isOverlap) { // 아직 중복이 아니라면
					isOverlap = true; // 중복으로 바꿔주고
					secondHighCome = i - 4000; // 기존 값이 더 작을테니 두번째로 작은 값에 저장함
					// 이미 중복이라면 기존에 나온 수 보다 더 크므로 별도 처리하지 않음
				}
			}
		}

		// 최빈값 출력 - 중복이 없다면 최빈값 출력, 중복이라면 두 번째로 작은 최빈값 출력
		System.out.println(!isOverlap ? firstHighCome : secondHighCome);

		// 범위 출력 - 정렬된 배열에서 첫 번째와 마지막 인덱스로 구함
		System.out.println(numbers[numLength - 1] - numbers[0]);

		br.close();

	}

}
