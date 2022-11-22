import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		// 기존 방법이 시간초과되어 다른 방법으로 풀이함

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());

		int[] origin = new int[count]; // 원본 배열
		int[] copy = new int[count]; // 복사할 배열

		// Set 대신 Map 을 사용
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < count; i++) {
			origin[i] = Integer.parseInt(st.nextToken());
			copy[i] = origin[i];
		}

		// 복사한 배열을 정렬함
		Arrays.sort(copy);

		// 복사한 배열을 순회하며 Map 에 저장
		// 이 때 이미 저장된 값이 있으면 저장하지 않음
		int rank = 0; // 순위값
		for (int i : copy) {
			if (!map.containsKey(i)) { // 이미 순위가 저장되어있지 않다면
				map.put(i, rank); // key = 좌표값 : value = 순위
				rank++; // map에 넣고 순위값을 증가시킴
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int key : origin) { // 원본 배열의 값을 키로 하여 출력함
			int result = map.get(key); // 원본 배열 원소(key)에 대한 value(순위)를 갖고온다.
			sb.append(result + " ");
		}

		System.out.println(sb.toString());

	}
}
