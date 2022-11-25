import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

//		문제
//		재귀적인 패턴으로 별을 찍어 보자.
//		N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때,
//		크기 N의 패턴은 N×N 정사각형 모양이다.

//		크기 3의 패턴은 가운데에 공백이 있고,
//		가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.

//		***
//		* *
//		***

//		N이 3보다 클 경우, 크기 N의 패턴은
//		공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을
//		크기 N/3의 패턴으로 둘러싼 형태이다.
//		예를 들어 크기 27의 패턴은 예제 출력 1과 같다.

//		***************************
//		* ** ** ** ** ** ** ** ** *
//		***************************
//		***   ******   ******   ***
//		* *   * ** *   * ** *   * *
//		***   ******   ******   ***
//		***************************
//		* ** ** ** ** ** ** ** ** *
//		***************************
//		*********         *********
//		* ** ** *         * ** ** *
//		*********         *********
//		***   ***         ***   ***
//		* *   * *         * *   * *
//		***   ***         ***   ***
//		*********         *********
//		* ** ** *         * ** ** *
//		*********         *********
//		***************************
//		* ** ** ** ** ** ** ** ** *
//		***************************
//		***   ******   ******   ***
//		* *   * ** *   * ** *   * *
//		***   ******   ******   ***
//		***************************
//		* ** ** ** ** ** ** ** ** *
//		***************************

//		입력
//		첫째 줄에 N이 주어진다.
//		N은 3의 거듭제곱이다.
//		즉 어떤 정수 k에 대해 N=3k이며, 이때 1 ≤ k < 8이다.

//		출력
//		첫째 줄부터 N번째 줄까지 별을 출력한다.
//		재귀적인 패턴으로 별을 찍어 보자.
//		N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때,
//		크기 N의 패턴은 N×N 정사각형 모양이다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());

		arr = new char[size][size];
		printStar(0, 0, size, false);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			for (int j=0; j < size; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	public static char[][] arr;

	public static void printStar(int pointX, int pointY, int size, boolean isEmt) {

		// 이번 순서가 공백을 출력할 순서라면
		// => 총 9칸 중 가운데 칸이라면
		// 해당 공간을 모두 공백으로 처리 후 종료
		if (isEmt) {
			for (int i = pointX; i < pointX + size; i++) {
				for (int j = pointY; j < pointY + size; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}

		if (size == 1) { // 더이상 3으로 나눌 수 없을 때
			arr[pointX][pointY] = '*'; // 별로 칠함
		} else { // 나눌 수 있다면
			int divSize = size / 3; // 3등분!

			// 총 9등분 된 칸 중 몇 번째 칸인지 저장할 변수
			int cnt = 0;
			// 1 2 3
			// 4 5 6
			// 7 8 9

			for (int i = pointX; i < pointX + size; i += divSize) {
				for (int j = pointY; j < pointY + size; j += divSize) {
					cnt++; // 현재 칸 번호
					if (cnt != 5) { // 공백으로 채울 칸이 아니라면
						printStar(i, j, divSize, false);
					} else { // 공백 칸이라면
						printStar(i, j, divSize, true);
					}
				}
			}

		}

	}

}
