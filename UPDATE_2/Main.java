package project3;

public class Main {

	 public static void main(String[] args) throws Exception {
	        KBC game = new KBC();
	        game.display();        
	        game.q1();
	        if (game.score >= 100000) {
	            game.q2();
	        }
	        if (game.score >= 200000) {
	            game.q3();
	        }
	        if (game.score >= 300000) {
	            game.q4();
	        }
	        if (game.score >= 400000) {
	            game.q5();
	        }
	        if (game.score >= 500000) {
	            game.q6();
	        }
	        if (game.score >= 1000000) {
	            game.q7();
	        }
	        game.result();
	    }

}
