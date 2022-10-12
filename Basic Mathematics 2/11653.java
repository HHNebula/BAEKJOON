import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		int caseNum = scanner.nextInt();
 
		for (int i = 2; i <= Math.sqrt(caseNum); i++) {
			while (caseNum % i == 0) {
				System.out.println(i);
				caseNum /= i;
			}
		}
		if (caseNum != 1) {
			System.out.println(caseNum);
		}
	}
}
