import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

//		문제
//		0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

//		입력
//		첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
//
//		출력
//		첫째 줄에 N!을 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		System.out.println(factorial(number));
		
	}
	
	public static int factorial(int number) {
		if(number <= 1) {
			return 1;
		} else {
			return number * factorial(number-1);
		}
	}

}
