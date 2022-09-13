import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int kingOrigin = 1;
		int queenOrigin = 1;
		int rookOrigin = 2;
		int bishopOrigin = 2;
		int knightOrigin = 2;
		int pawnOrigin = 8;
		
		
		int king = scanner.nextInt();
		int queen = scanner.nextInt();
		int rook = scanner.nextInt();
		int bishop = scanner.nextInt();
		int knight = scanner.nextInt();
		int pawn = scanner.nextInt();
		
		System.out.println(kingOrigin-king);
		System.out.println(queenOrigin-queen);
		System.out.println(rookOrigin-rook);
		System.out.println(bishopOrigin-bishop);
		System.out.println(knightOrigin-knight);
		System.out.println(pawnOrigin-pawn);
		
	}

}
