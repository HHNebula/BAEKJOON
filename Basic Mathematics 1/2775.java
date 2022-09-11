import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		// 0 층부터 시작하지만 0 호는 없음
		// 0 층의 i 호는 i 명이 살고 있음
		// n 층의 b 호의 경우 n-1 층의 1호부터 b호까지의 수를 합침

		// 01 04 10 20 35 41 ...
		// 01 03 06 10 15 16 ...
		// 01 02 03 04 05 06 ...

		// 모든 층의 1호는 1임

		// 제한의 최대값으로 2차원 배열 선언 및 초기화
		int array[][] = new int[15][15];

		for (int i = 0; i < array.length; i++) {
			array[i][0] = 1; // 각 층의 1호는 1명
			array[0][i] = i+1; // 0 층의 i호는 i명 ( 0부터 시작하므로 1씩 더해줌 )
		}

		for (int floor = 1; floor < array.length; floor++) { // 1층부터 시작
			for (int room = 1; room < array.length; room++) { // 2호부터 시작 
				// 이 집의 명수 = 옆집의 명수 + 아랫집의 명수
				array[floor][room] = array[floor][room - 1] + array[floor - 1][room];
			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());

		for (int i = 0; i < caseNum; i++) {
			int floor = Integer.parseInt(br.readLine());
			int room = Integer.parseInt(br.readLine());
			System.out.println(array[floor][room - 1]);
		}

	}

}
