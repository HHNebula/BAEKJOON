import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		// ==== 문제 ====
//		2차원 평면 위의 점 N개가 주어진다.
//		좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.



		// ==== 입력 ====
//		첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다.
//		둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다.
//		(-100,000 ≤ xi, yi ≤ 100,000)
//		좌표는 항상 정수이고, 위치가 같은 두 점은 없다.

		// ==== 출력 ====
//		첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine()); // 점의 개수

		// 입력을 받아 2차원 배열에 저장
		int[][] point = new int[count][2];
		for (int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			point[i][0] = Integer.parseInt(st.nextToken());
			point[i][1] = Integer.parseInt(st.nextToken());
		}

		// 람다식으로 풀기
		// Arrays.sort() 람다식으로 확장
		Arrays.sort(point, (p1, p2) -> {
			// p1 과 p2 의 x 값을 먼저 비교
			if (p1[1] == p2[1]) { // y값이 같다면
				return p1[0] - p2[0]; // x값을 비교하여 음수라면 자리를 바꿈
			} else { // y 값이 다르다면
				return p1[1] - p2[1]; // x값을 비교하여 음수라면 자리를 바꿈
			}
		});
		
		// sort 결과 출력하기
		for (int i = 0; i < count; i++) {
			System.out.println(point[i][0] + " " + point[i][1]);
		}

	}

}
