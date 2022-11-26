import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

//		문제
//		알파벳으로만 이루어진 단어를 입력받아,
//		그 길이를 출력하는 프로그램을 작성하시오.

//		입력
//		첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다.
//		단어의 길이는 최대 100이다.

//		출력
//		첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		System.out.println(str.length());
		
	}

}
