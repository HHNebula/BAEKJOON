import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 배열로 풀기

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testNum = Integer.parseInt(br.readLine());
		String testResult[] = new String[testNum];
		int testScore[] = new int[testNum];

		for (int i = 0; i < testNum; i++) {
			testResult[i] = br.readLine();
			char ch[] = new char[testResult[i].length()];
			int score[] = new int[testResult[i].length()];

			for (int j = 0; j < testResult[i].length(); j++) {
				ch[j] = testResult[i].charAt(j);
				if (ch[j] != 'O') {
					score[j] = 0;
				} else if (j != 0 && ch[j] == 'O' && score[j - 1] != 0) {
					score[j] = score[j - 1] + 1;
				} else {
					score[j] = 1;
				}
			}

			int sum = 0;
			for (int j = 0; j < score.length; j++) {
				sum += score[j];
			}
			testScore[i] = sum;
		}

		for (int i = 0; i < testNum; i++) {
			System.out.println(testScore[i]);
		}

	}
}
