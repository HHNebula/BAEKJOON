import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { // 배열로 풀기

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		float subjects[] = new float[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < subjects.length; i++) {
			subjects[i] = Integer.parseInt(st.nextToken());
		}

		float max = 0;
		for (int i = 0; i < subjects.length; i++) {
			if (max < subjects[i]) max = subjects[i];
		}
		
		float total = 0;
		for (int i = 0; i < subjects.length; i++) {
			subjects[i] = subjects[i]/max*100;
			total += subjects[i];
		}
		
		System.out.println(total/subjects.length);

	}
}
