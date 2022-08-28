import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int caseNum = Integer.parseInt(br.readLine());

		for (int i = 0; i < caseNum; i++) {
			st = new StringTokenizer(br.readLine());
			int loopNum = Integer.parseInt(st.nextToken());
			String target = st.nextToken();
			char chArr[] = new char[loopNum * target.length()];
			int index = 0;

			for (int j = 0; j < target.length(); j++) {
				for (int t = 0; t < loopNum; t++) {
					chArr[index] = target.charAt(j);
					index++;
				}
			}
			
			for ( int j = 0; j < chArr.length; j++) {
				System.out.print(chArr[j]);
			}
			System.out.println();
		}

	}

}
