import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()); // 주어진 숫자
		// num번째 분수를 구하는것이 목적

		// line 은 몇 번째 줄 인지, slot 은 해당 라인 까지의 모든 칸 수를 더함
		// 첫 줄에는 하나의 슬롯만 있음
		int line = 1, slot = 1;

		// 1번째 수는 검사 없이 즉시 출력함
		if (num == 1) {
			System.out.println(1 + "/" + 1);
		}

		while (num != 1) { // num이 1이 아닐 경우 몇번 째 줄에 위치하는지 검사함

			if (slot < num) { // slot 보다 num이 더 클 경우
				line++; // 1줄 추가
				slot += line; // 해당 줄의 슬롯 수를 더함

			} else { // slot이 num보다 크다면 line 안에 있다는 뜻

				if (line % 2 == 1) { // 홀수 번째 줄인 경우
					System.out.println((1 + (slot - num)) + "/" + (line - (slot - num)));
					break;
				} else { // 짝수 번째 줄인 경우
					System.out.println((line - (slot - num)) + "/" + (1 + (slot - num)));
					break;
				}

			}

		}

	}

}
