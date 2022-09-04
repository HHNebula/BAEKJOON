import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int fixCost = Integer.parseInt(st.nextToken());
		int prodCost = Integer.parseInt(st.nextToken());
		int price = Integer.parseInt(st.nextToken());

		long salesNum = 1;

		while (true) {
			
			if (prodCost >= price ) {
				salesNum = -1;
				break;
			} else if (fixCost + (prodCost * salesNum) >= price * salesNum ) {
				salesNum++;
			} else {
				break;
			}

		}
		
		System.out.print(salesNum);

	}

}
