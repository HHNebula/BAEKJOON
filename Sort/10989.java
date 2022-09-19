import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[10001]; // 입력 범위 만큼 배열 크기 선언

		int caseNum = Integer.parseInt(br.readLine());
		for (int i = 0; i < caseNum; i++) {
			// 입력된 숫자를 인덱스로 하여 저장된 값을 1 증가시킴
			arr[Integer.parseInt(br.readLine())]++;
		}
		br.close(); // 자원 반납

		StringBuilder sb = new StringBuilder();
		
		// 0은 입력되지 않으니 1부터 시작함
		for (int i = 1; i < 10001; i++) {
			while (arr[i] > 0) { // 값이 0 보타 클 경우 반복
				sb.append(i).append('\n'); // 해당 인덱스를 String Builder 에 삽입
				arr[i]--; // 저장된 값을 1 감소시킴
			}
		}

		System.out.println(sb);

	}

}
