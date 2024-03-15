import java.util.*;
// Feature 1 - limit the number range from 1 to 20 for both guessor and player, take number if it is valid or else ask again
// Feature 2- If multiple players said it right then keep match agin only for tied players.
class Guesser{
	int guessNum;
	int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser please guess the number between 0-20");
		guessNum = sc.nextInt();
		if(guessNum>0 && guessNum<=20) {
			return guessNum;
		}
		else {
			System.out.print("Number you entered is not in specified range.");
			return guessNum();
		}
	}
}

class Player1{
	int guessNum;
	int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 1 please guess the number between 0-20");
		guessNum = sc.nextInt();
		if(guessNum>0 && guessNum<=20) {
			return guessNum;
		}
		else {
			System.out.print("Number you entered is not in specified range.");
			return guessNum();
		}
	}
}

class Player2{
	int guessNum;
	int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 2 please guess the number between 0-20");
		guessNum = sc.nextInt();
		if(guessNum>0 && guessNum<=20) {
			return guessNum;
		}
		else {
			System.out.print("Number you entered is not in specified range.");
			return guessNum();
		}
	}
}

class Player3{
	int guessNum;
	int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 3 please guess the number between 0-20");
		guessNum = sc.nextInt();
		if(guessNum>0 && guessNum<=20) {
			return guessNum;
		}
		else {
			System.out.print("Number you entered is not in specified range.");
			return guessNum();
		}
	}
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumberFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}
	void collectNumberFromPlayer1() {
		Player1 p1 = new Player1();
		numFromPlayer1 = p1.guessNum();
	}
	void collectNumberFromPlayer2() {
		Player2 p2 = new Player2();
		numFromPlayer2 = p2.guessNum();
	}
	void collectNumberFromPlayer3() {
		Player3 p3 = new Player3();
		numFromPlayer3 = p3.guessNum();
	}
	void compare() {
		System.out.println(numFromGuesser +" " + numFromPlayer1 +" " + numFromPlayer2 +" " + numFromPlayer3);
		if(numFromGuesser == numFromPlayer1) {
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("All players won the game. So, rematch for all players");
				Umpire u = new Umpire();
				u.collectNumberFromGuesser();
				u.collectNumberFromPlayer1();
				u.collectNumberFromPlayer2();
				u.collectNumberFromPlayer3();
				u.compare();
			}
			else if(numFromGuesser == numFromPlayer2) {
				System.out.println("Player 1 and 2 won the game. So, rematch for Player 1 and player 2");
				Umpire u = new Umpire();
				u.collectNumberFromGuesser();
				u.collectNumberFromPlayer1();
				u.collectNumberFromPlayer2();
				u.compare();
			}
			else if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player 1 and 3 won the game. So, remtch for player 1 and player 3");
				Umpire u = new Umpire();
				u.collectNumberFromGuesser();
				u.collectNumberFromPlayer1();
				u.collectNumberFromPlayer3();
				u.compare();
			}
			else {
				System.out.println("Player 1 won the game");
			}
		}
		
		else if(numFromGuesser == numFromPlayer2) {
			if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 and 3 won the game. So, rematch for player 2 and 3.");
				Umpire u = new Umpire();
				u.collectNumberFromGuesser();
				u.collectNumberFromPlayer2();
				u.collectNumberFromPlayer3();
				u.compare();
			}else {
				System.out.println("Player 2 won the game");
			}
		}
		
		else if(numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 won the game");
		}
		
		else {
			System.out.println("Game lost by all players try again");
			Umpire u = new Umpire();
			u.collectNumberFromGuesser();
			u.collectNumberFromPlayer1();
			u.collectNumberFromPlayer2();
			u.collectNumberFromPlayer3();
			u.compare();
		}
		
	}
}

public class GuesserGame {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumberFromGuesser();
		u.collectNumberFromPlayer1();
		u.collectNumberFromPlayer2();
		u.collectNumberFromPlayer3();
		u.compare();
	}

}
