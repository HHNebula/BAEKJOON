import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

		// 첫째 줄에 행렬의 크기 N 과 M이 주어진다.
		// 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
		// 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
		// N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[][] table = new int[9][9];
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				table[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int max = 0;
		int row = 0;
		int col = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (max < table[i][j]) {
					max = table[i][j];
					row = i;
					col = j;
				}
			}
		}

		System.out.println(max);
		System.out.println((row + 1) + " " + (col + 1));

		br.close();

	}

}
