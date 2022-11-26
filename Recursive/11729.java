import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

//		문제
//		세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다.
//		각 원판은 반경이 큰 순서대로 쌓여있다.
//		이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.

//		한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
//		쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
//		이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라. 
//		단, 이동 횟수는 최소가 되어야 한다.

//		입력
//		첫째 줄에 첫 번째 장대에 쌓인 원판의 개수 N (1 ≤ N ≤ 20)이 주어진다.

//		출력
//		첫째 줄에 옮긴 횟수 K를 출력한다.
//		두 번째 줄부터 수행 과정을 출력한다.
//		두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에 두고 출력하는데,
//		이는 A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.

	public static StringBuilder sb = new StringBuilder();
	public static int move = 0;

	/**
	 * 
	 * @param diskCnt     : 원판의 개수
	 * @param departure   : 출발지
	 * @param stopover    : 기착지
	 * @param destination : 도착지
	 */
	public static void hanoiTop(int diskCnt, int departure, int stopover, int destination) {

		move++;

		// 옮길 디스크가 한개라면
		if (diskCnt == 1) {
			sb.append(departure + " " + destination + "\n");
			return;
		}

		// 가장 큰 디스크를 제외한 모든 디스크를 가운데로 이동
		hanoiTop(diskCnt - 1, departure, destination, stopover);

		// 가장 큰 디스크를 도착지로 이동
		sb.append(departure + " " + destination + "\n");

		// 가운데에 있는 모든 디스크를 도착지로 이동
		hanoiTop(diskCnt - 1, stopover, departure, destination);

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int diskCnt = Integer.parseInt(br.readLine());

		hanoiTop(diskCnt, 1, 2, 3);

		br.close();

		System.out.println(move);
		System.out.println(sb);

	}

}
