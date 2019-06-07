import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		Scanner Jeffy = new Scanner(System.in);
		
		int player1Score=0, player2Score = 0;
		
		System.out.println("enter name for player 1");
		String player1 = Jeffy.nextLine();
		
		System.out.println("enter name for player 2");
		String player2 = Jeffy.nextLine();
		
		System.out.println("--------");
		System.out.println("ROUND 1");
		System.out.println("--------");
		
		
		System.out.println("what does " + player1 + " play?: (R, P, or S) ");
		String p1r1 = Jeffy.nextLine();
		
		System.out.println("what does " + player2 + " play?:(R, P, or S) ");
		String p2r1 = Jeffy.nextLine();

		if(p1r1.equals("R")&& p2r1.equals("P")) {
			
			player2Score= player2Score +1;
			
			
		}
		else if(p1r1.equals("R")&& p2r1.equals("S")) {
			player1Score= player1Score +1;
		}
		
		else if(p1r1.equals("P")&& p2r1.equals("R")) {
			player1Score= player1Score +1;
		
		}
		
		else if (p1r1.equals("P")&& p2r1.equals("S")) {
			player2Score= player2Score +1;
		}
		else if (p1r1.equals("S")&& p2r1.equals("R")) {
			player2Score= player2Score +1;
		}
		else if (p1r1.equals("S")&& p2r1.equals("P")){
			player1Score= player1Score +1;
		}
		else {
			System.out.println("draw");
			
		}
		
		System.out.println("--------");
		System.out.println("ROUND 2");
		System.out.println("--------");
		
		
		System.out.println("what does " + player1 + " play?: (R, P, or S) ");
		p1r1 = Jeffy.nextLine();
		
		System.out.println("what does " + player2 + " play?:(R, P, or S) ");
		p2r1 = Jeffy.nextLine();

		if(p1r1.equals("R")&& p2r1.equals("P")) {
			
			player2Score= player2Score +1;
			
			
		}
		else if(p1r1.equals("R")&& p2r1.equals("S")) {
			player1Score= player1Score +1;
		}
		
		else if(p1r1.equals("P")&& p2r1.equals("R")) {
			player1Score= player1Score +1;
		
		}
		
		else if (p1r1.equals("P")&& p2r1.equals("S")) {
			player2Score= player2Score +1;
		}
		else if (p1r1.equals("S")&& p2r1.equals("R")) {
			player2Score= player2Score +1;
		}
		else if (p1r1.equals("S")&& p2r1.equals("P")){
			player1Score= player1Score +1;
		}
		else {
			System.out.println("draw");
			
		}
		
		if( (player1Score < 2 && player2Score < 2) || (player1Score >= 2 && player2Score >= 2)) {
			
			
		
		System.out.println("--------");
		System.out.println("ROUND 3");
		System.out.println("--------");
		
		
		System.out.println("what does " + player1 + " play?: (R, P, or S) ");
		 p1r1 = Jeffy.nextLine();
		
		System.out.println("what does " + player2 + " play?:(R, P, or S) ");
		 p2r1 = Jeffy.nextLine();

		if(p1r1.equals("R")&& p2r1.equals("P")) {
			
			player2Score= player2Score +1;
			
			
		}
		else if(p1r1.equals("R")&& p2r1.equals("S")) {
			player1Score= player1Score +1;
		}
		
		else if(p1r1.equals("P")&& p2r1.equals("R")) {
			player1Score= player1Score +1;
		
		}
		
		else if (p1r1.equals("P")&& p2r1.equals("S")) {
			player2Score= player2Score +1;
		}
		else if (p1r1.equals("S")&& p2r1.equals("R")) {
			player2Score= player2Score +1;
		}
		else if (p1r1.equals("S")&& p2r1.equals("P")){
			player1Score= player1Score +1;
		}
		else {
			System.out.println("draw");
			
		
		}
		
		
}
		if(player1Score>player2Score) {
			System.out.println("Game Over: "+ player1 + " wins!");
		}
		else if (player2Score>player1Score) {
			System.out.println("Game Over: "+ player2 + " wins!");
		}
		else   {
			System.out.println("Game Over: Tie between "+ player1 + " and " + player2);
		}	
}
		}
	

	