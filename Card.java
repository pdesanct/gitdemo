/**
 * 
 */

/**
 * @author pdesanct
 *
 * Added comment line by bakerjd changed by pdesanct (okay)
 *
 */
public class Card {

	private int num;
	/**
	 * this is the basic card class
         * added a second comment line
	 */
	
	public Card(int n) {
		this.num = n;
	}

	public String showCard (int n) {
		String rank ="v";
		String suit = "c";
		if ((n == 1) || (n == 14) || (n == 27) || (n == 40)) {
			rank = "A";
		}
		if ((n == 2) || (n == 15) || (n == 28) || (n == 41)) {
			rank = "2";
		}
		if ((n == 3) || (n == 16) || (n == 29) || (n == 42)) {
			rank = "3";
		}
		if ((n == 4) || (n == 17) || (n == 30) || (n == 43)) {
			rank = "4";
		}
		if ((n == 5) || (n == 18) || (n == 31) || (n == 44)) {
			rank = "5";
		}
		if ((n == 6) || (n == 19) || (n == 32) || (n == 45)) {
			rank = "6";
		}
		if ((n == 7) || (n == 20) || (n == 33) || (n == 46)) {
			rank = "7";
		}
		if ((n == 8) || (n == 21) || (n == 34) || (n == 47)) {
			rank = "8";
		}
		if ((n == 9) || (n == 22) || (n == 35) || (n == 48)) {
			rank = "9";
		}
		if ((n == 10) || (n == 23) || (n == 36) || (n == 49)) {
			rank = "10";
		}
		if ((n == 11) || (n == 24) || (n == 37) || (n == 50)) {
			rank = "J";
		}
		if ((n == 12) || (n == 25) || (n == 38) || (n == 51)) {
			rank = "Q";
		}
		if ((n == 13) || (n == 26) || (n == 39) || (n == 52)) {
			rank = "K";
		}

		if (n >= 1 & n <= 13) {
			suit = "C";
		}
		if (n >= 14 & n <= 26) {
			suit = "D";
		}
		if (n >=27 & n <= 39) {
			suit = "H";
		}
		if (n >= 40 & n <= 52) {
			suit = "S";
		}
		
		return rank + suit;
	}
	
	public int scoreCard (int n) {
		int score=0;
		if ((n == 1) || (n == 14) || (n == 27) || (n == 40)) {
			score = 11;
		}
		if ((n == 2) || (n == 15) || (n == 28) || (n == 41)) {
			score = 2;
		}
		if ((n == 3) || (n == 16) || (n == 29) || (n == 42)) {
			score = 3;
		}
		if ((n == 4) || (n == 17) || (n == 30) || (n == 43)) {
			score = 4;
		}
		if ((n == 5) || (n == 18) || (n == 31) || (n == 44)) {
			score = 5;
		}
		if ((n == 6) || (n == 19) || (n == 32) || (n == 45)) {
			score = 6;
		}
		if ((n == 7) || (n == 20) || (n == 33) || (n == 46)) {
			score = 7;
		}
		if ((n == 8) || (n == 21) || (n == 34) || (n == 47)) {
			score = 8;
		}
		if ((n == 9) || (n == 22) || (n == 35) || (n == 48)) {
			score = 9;
		}
		if ((n >= 10 && n <= 13) || (n >= 23 && n <= 26) || (n >= 36 && n <= 39) || (n >= 49 && n <= 52)) {
			score = 10;
		}
		return score;
		
	}
	
	public static void main(String[] args) {
		
			for (int j=1; j<=52; j++) {
				Card myCard = new Card(j);
				System.out.println(myCard.showCard(j));
		}
	}
}
