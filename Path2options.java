package assingment;

import java.util.Scanner;

public class Path2options {

		public Path2options(){
			
		}
		public void twoOptions(){
			Scanner userInput = new Scanner(System.in);
			
			switch(userInput.nextInt()){
			case 1:
				System.out.println("you drink until you can't drinks no more");
				System.out.println("you start to feel reaaaaaallly dizzy and");
				System.out.println("begin to throw up. You embaress yourself. Good Job.");
				System.out.println("Game End.");
				break;
			case 2:
				System.out.println("you fight a random person in the inn");
				System.out.println("and you brutally slam his face into");
				System.out.println("his own beer mug. Everyone declares you a true OG");
				System.out.println("you've been arrested for public badassery.");
				System.out.println("Game End.");
				break;
			case 3:
				System.out.println("you enter the arena fully armored");
				System.out.println("the champion charges and impales you with his");
				System.out.println("broadsword. Thats unforturnate.");
				System.out.println("YOU DIED");
				System.out.println("Game End.");
				break;
			case 4:
				System.out.println("you bet on the next match between a large man and a skinny man");
				System.out.println("you bet on the large man to win");
				System.out.println("the large man trips and decapitates himself on accident");
				System.out.println("you lose 10 gil");
				System.out.println("Game End.");
				break;
			case 5:
				System.out.println("you spot a bunny and decide to strangle it with your mighty hands");
				System.out.println("the bunny animorphs into a person and slaps you");
				System.out.println("the bunny person shouts [that was a naughty thing to do! I hate you!]");
				System.out.println("the bunny person walks away.");
				System.out.println("Game End.");
				break;
			case 6:
				System.out.println("you begin to chop wood like crazy");
				System.out.println("during the chopping you slip with your axe and chop your foot off!");
				System.out.println("you die from blood loss..");
				System.out.println("Game End.");
				break;
			default:
				System.out.println("you die from insolence.");
			}
		
			userInput.close();
		}
	}
		

