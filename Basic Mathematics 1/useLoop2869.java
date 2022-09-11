import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int up = Integer.parseInt(st.nextToken()); // 올라가는 길이
		int down = Integer.parseInt(st.nextToken()); // 미끄러지는 길이
		int target = Integer.parseInt(st.nextToken()); // 목표 길이
		int day = 0, location = 0; // 소요 일자, 현재 위치

		while (location < target) {
			day++; // 하루의 시작
			location += up; // 올라감
			if (location >= target) { // 목표를 달성하면
				System.out.println(day); // 결과 출력 후
				break; // 종료
			}
			location -= down; // 달성하지 못하면 내려감
		}
		

	}

}
