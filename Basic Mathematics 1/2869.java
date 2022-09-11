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
		int length = Integer.parseInt(st.nextToken()); // 목표 길이

		// 속도 제항으로 반복문을 쓰지 않고 단순 계산으로 풀이함

		// up - down = 하루에 올라가는 거리
		// 길이 / 하루에 올라가는 거리 = 소요 일
		// 단 올라가면 미끄러지지 않는다 하므로 길이에서 내려가는 수치를 뺌

		int day = (length - down) / (up - down);
		if ((length - down) % (up - down) != 0) {
			day++; // 나머지가 있으면 하루를 더해줌
		}

		System.out.println(day);

	}

}
