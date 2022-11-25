import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

//		문제
//		지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다.
//		어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다. 지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.

//		체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다.
//		구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고,
//		변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다.
//		
//		따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다.
//		하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.
//
//		보드가 체스판처럼 칠해져 있다는 보장이 없어서,
//		지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다.
//		당연히 8*8 크기는 아무데서나 골라도 된다.
//		지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.

//		입력
//		첫째 줄에 N과 M이 주어진다.
//		N과 M은 8보다 크거나 같고,
//		50보다 작거나 같은 자연수이다.
//		
//		둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다.
//		B는 검은색이며, W는 흰색이다.

//		출력
//		첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.

		// 다시 칠할 횟수
		int paintNum = 64;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int hight = Integer.parseInt(st.nextToken());
		int width = Integer.parseInt(st.nextToken());
		boolean[][] chessBoard = new boolean[hight][width];

		// 보드의 색상 입력
		for (int i = 0; i < hight; i++) {
			String str = br.readLine();
			for (int j = 0; j < width; j++) {
				if (str.charAt(j) == 'W') {
					chessBoard[i][j] = true; // 하얀색이면 true로 저장
				} else {
					chessBoard[i][j] = false; // 검은색이면 false로 저장
				}
			}
		}

		// 검사
		// 8x8 이므로 -7을 하여 시작 범위를 지정함
		for (int row = 0; row < hight - 7; row++) {
			for (int col = 0; col < width - 7; col++) {

				// 시작 지점에서 +7 하여 검사할 범위를 지정함
				int rowEnd = row + 7;
				int colEnd = col + 7;

				// 검사를 시작할 첫번째 칸의 색을 받아옴
				boolean color = chessBoard[row][col];

				// 색을 다시 칠해야하는 칸의 개수
				int count = 0;

				// 검사 시작 지점과 종료 지점까지 반복
				for (int i = row; i <= rowEnd; i++) {
					for (int j = col; j <= colEnd; j++) {

						// 칸의 색이 규칙과 다른지 검사
						if (color != chessBoard[i][j]) {
							count++;
						}
						// 검사를 위해 반전
						color = !color;
					}
					// 검사를 위해 반전
					// 다음 줄의 첫 칸은 이전 줄의 마지막 칸과 같아야 하므로
					color = !color;
				}
				// 검사 결과를 비교하여 더 작은 횟수를 저장
				int result = (count < 64 - count) ? count : 64 - count;
				if (paintNum > result) {
					paintNum = result;
				}
			}
		}

		System.out.println(paintNum);

		br.close();

	}

}
