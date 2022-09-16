import java.util.Scanner;

public class Main { // 셀프넘버

	public static void main(String[] args) {
		// 문제풀이
		// 어떤 수 n의 각 자리가 등차수열을 이루는 지 검사
		// 수 127이 있을 경우 아래와 같이 판단한다.
		// int arr[] = new int[] { 1, 2, 7 };
		// 각 인덱스간의 차이가 일치하는지를 확인한다.
		// 위 배열은 +1 +5 이므로 수열이 아니다.
		// 더불어 1~99 까지는 모두 수열이다.
		// 케이스를 100보다 작은 경우와 100 이상인 경우로 나눈다.

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(checkHansoo(x));
		scanner.close();
	}
	// 숫자를 받아 해당 수 보다 작거나 같은 한수의 개수를 반환함
	public static int checkHansoo(int num) {
		int count = 0; // 한수의 개수

		// 숫자가 100보다 작을 경우
		if (num < 100) {
			count = num;
			// 100 미만의 모든 수는 그 자체로 한수이므로 그대로 반환
		} else { // 숫자가 100 이상일 경우
			count = 99;
			// 1 ~ 99 까지의 수는 기본적으로 한수이므로 99개를 우선 저장
			// 그 후 100부터 검사한다.
			for (int i = 100; i <= num; i++) {
				// 등차수열인지 확인을 위해 각 자리수를 저장한다.
				int hunDig = i / 100; // 100의 자리
				int tenDig = (i / 10) % 10; // 10의 자리
				int oneDig = i % 10; // 1의 자리
				if ((hunDig - tenDig) == (tenDig - oneDig)) {
					count++; // 등자수열일 경우 카운트 1 증가
				}
			}
		}
		return count; // 한수의 갯수를 반환
	}
	
}
