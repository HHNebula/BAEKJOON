import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// X대학 M교수님은 프로그래밍 수업을 맡고 있다.
		// 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
		// 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.

		// 입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.

		int[] submitted = new int[31]; // 제출자

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 28; i++) {
			int num = Integer.parseInt(br.readLine());
			submitted[num] = num;
		}

		for (int i = 1; i < submitted.length; i++) {
			if ( submitted[i] == 0 ) {
				System.out.println(i);
			}
		}

	}

}
