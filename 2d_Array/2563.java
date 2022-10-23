import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다.
		// 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
		// 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int answer = 0; // 면적
		boolean table[][] = new boolean[101][101];

		int loopNum = Integer.parseInt(br.readLine());

		for (int i = 0; i < loopNum; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int row = x + 10; row > x; row--) {
				for (int col = y + 10; col > y; col--) {
					if (table[row][col] != true) {
						table[row][col] = true;
						answer++;
					}
				}
			}
			
		}

		System.out.println(answer);

		br.close();

	}

}
