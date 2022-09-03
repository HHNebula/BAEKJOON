import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { // 배열로 풀기

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testNum = Integer.parseInt(br.readLine());

		for (int i = 0; i < testNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int stuNum = Integer.parseInt(st.nextToken());
			int score[] = new int[stuNum];
			int total = 0;

			for (int j = 0; j < score.length; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				total += score[j];
			}

			float average = total / stuNum;
			int aboveAve = 0;

			for (int j = 0; j < score.length; j++) {
				if (score[j] > average) {
					aboveAve++;
				}
			}

			float rate = ((float)aboveAve / stuNum)*100;
			System.out.printf("%.3f%s%n", rate, "%");

		}
		
	}
}
