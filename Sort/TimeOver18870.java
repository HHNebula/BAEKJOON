
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

//		========== 입력 ==========
//		수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다.
//		이 좌표에 좌표 압축을 적용하려고 한다.

//		Xi를 좌표 압축한 결과 X'i의 값은
//		Xi > Xj를 만족하는 서로 다른 좌표의 개수와 같아야 한다.

//		X1, X2, ..., XN에 좌표 압축을 적용한 결과
//		X'1, X'2, ..., X'N를 출력해보자.

//		========== 입력 ==========
//		첫째 줄에 N이 주어진다.
//		둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.

//		========== 출력 ==========
//		첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.

//		========== 제한 ==========
//		1 ≤ N ≤ 1,000,000
//		-10의 9제곱 ≤ Xi ≤ 10의 9제곱 ( 메모리 및 시간 초과에 유의해야 함 )

		// X`1 이란 Xi 보다 작은 Xj 들이 몇개 있는지를 검사한 것
		// 좌표들 사이의 순위라 볼 수 있음
		// Xj 과 비교하는 Xj 들은 중복 을 허용하지 않음
		// 즉 1 1 2 3 3 을 압축하면 0 0 1 2 2 임

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine()); // 입력될 좌표의 개수

		int[] original = new int[count]; // 좌표값을 입력할 배열
		Set<Integer> set = new HashSet<Integer>(); // 좌표값을 입력할 Set

		// 입력부
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < count; i++) {
			original[i] = Integer.parseInt(st.nextToken()); // 좌표 배열에 저장
			set.add(original[i]); // 좌표를 Set에 저장하여 중복을 허용하지 않음
		}

		// set 을 배열로 변환
		int[] copy = new int[set.size()];
		Iterator<Integer> iter = set.iterator();
		for (int i = 0; i < copy.length; i++) {
			copy[i] = iter.next();
		}
		// 검사 - 좌표의 순위를 구하여 저장
		for (int i = 0; i < count; i++) {
			int cnt = 0;
			for (int j = 0; j < copy.length; j++) {
				if (original[i] > copy[j])
					cnt++;
			}
			original[i] = cnt;
		}

		// 출력
		for (int i = 0; i < count; i++) {
			bw.write(original[i] + "");
			if (i < count - 1)
				bw.write(" ");
		}

		bw.flush();
		bw.close();
		br.close();
		
//		10
//		-10 -221 234 231 21 2 -10 21 32 41
//		1 0 7 6 3 2 1 3 4 5
//		정답은 맞지만 시간을 초과한다.

	}

}
