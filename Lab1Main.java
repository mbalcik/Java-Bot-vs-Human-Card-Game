import java.util.Scanner;
import java.security.SecureRandom;

public class Lab1Main {
	private static final int SUM=15; // for in-lab exercise

	static int cards=-1;
	static int mode=-1;
	static int starter=-1;
	
	public static void main(String[] args) {		
	    gameDemo();
	    
	    //firstfinal
	    
	    SecureRandom r = new SecureRandom(); 
	    Scanner input = new Scanner(System.in);
			System.out.print("Enter the number of cards: ");
		    cards = input.nextInt();
	    while(true) {
	    	System.out.print("Enter 0 if the computer plays in stupid mode, 1 for smart mode:");
		     mode = input.nextInt();
		    if(mode ==0 || mode==1) {
		    	break;
		    }else{
		    	System.out.println("Invalid number try again: ");	
		    	}
		    }
	    while(true) {
	    	System.out.print("Enter 0 if the human stars,  1 if computer starts:");
		     starter = input.nextInt();
		    if(starter ==0 || starter==1) {
		    	break;
		    }else {
		    	System.out.println("invalid number try again ");
		    	}
	    }
	    
	    System.out.println("There are " +cards +" cards left");
	    
	    
	    userStupid();
	    
	    computerStupid();
	    
	    userSmart();
	    
	    computerSmart();
	    
	    
	   //extraDemo();
	    
	
	
	}
	
	
	private static void userStupid(){
		Scanner input = new Scanner(System.in);
		SecureRandom r = new SecureRandom();
		if(mode==0 && starter==0) {
	    	do{
	    			    		
	    		System.out.print("Your turn. How many you want to remove: ");
	    		int removedCard =input.nextInt();
	    		while(removedCard>= cards/2 +1) {
	    			System.out.println("You cannot do that try again: ");
	    			System.out.print("Your turn. How many you want to remove: ");
		    		removedCard =input.nextInt();
	    		}
	    		cards= cards-removedCard;
	    		System.out.println("There are " +cards +" cards left");
	    		if(cards<=1) {
	    			System.out.println("You won");
	    			break;
	    		}
	    		int rcard = r.nextInt(cards/2 +1);
	    		while(rcard==0) {
	    			rcard = r.nextInt(cards/2 +1);
	    		}
	    		cards= cards-rcard;
	    		System.out.println("Computer removed " +rcard);
	    		System.out.println("There are " +cards +" cards left");
	    		if(cards<=1) {
	    			System.out.println("Computer won");
	    			break;
	    		}	    			    		
	    	}while(cards!=1); 	    	 	
	    }
		
	}
	private static void computerStupid() {
		Scanner input = new Scanner(System.in);
		SecureRandom r = new SecureRandom();
		if(mode==0 && starter==1) {
	    	do {
	    		int rcard = r.nextInt(cards/2 +1);
	    		while(rcard==0) {
	    			rcard = r.nextInt(cards/2 +1);
	    		}
    		cards= cards-rcard;
    		System.out.println("Computer removed " +rcard);
    		System.out.println("There are " +cards +" cards left");
    		if(cards<=1) {
    			System.out.println("Computer won");
    			break;
    		}
    		System.out.print("Your turn. How many you want to remove: ");
    		int removedCard =input.nextInt();
    		while(removedCard>= cards/2 +1) {
    			System.out.println("You cannot do that try again: ");
    			System.out.print("Your turn. How many you want to remove: ");
	    		removedCard =input.nextInt();
    		}
    		cards= cards-removedCard;
    		System.out.println("There are " +cards +" cards left");
    		if(cards<=1) {
    			System.out.println("You won");
    			break;
    		}	    		
	    	  }while(cards!=1);
	    }
		
	}
	
	private static void userSmart() {
		Scanner input = new Scanner(System.in);
		SecureRandom r = new SecureRandom();
		if(mode==1 && starter==0) {
	    	do{
	    			    		
	    		System.out.print("Your turn. How many you want to remove: ");
	    		int removedCard =input.nextInt();
	    		while(removedCard>= cards/2 +1) {
	    			System.out.println("You cannot do that try again: ");
	    			System.out.print("Your turn. How many you want to remove: ");
		    		removedCard =input.nextInt();
	    		}
	    		cards= cards-removedCard;
	    		System.out.println("There are " +cards +" cards left");
	    		if(cards<=1) {
	    			System.out.println("You won");
	    			break;
	    		}
	    		if(cards> Math.pow(2,2)-1 ||cards==Math.pow(2,2)-1) {
	    			int rcard = r.nextInt(cards/2 +1);
	    			while(rcard==0) {
		    			rcard = r.nextInt(cards/2 +1);
		    		}
		    		cards= cards-rcard;
		    		System.out.println("Computer removed " +rcard);
		    		System.out.println("There are " +cards +" cards left");
		    		    		
		    		if(cards<=1) {
		    			System.out.println("Computer won");
		    			break;
		    		}
	    		}
		    		else {
		    			int x = r.nextInt(cards/2 +1);
		    		 double r2card=Math.pow(x,2)-1;	
		    			while(r2card>=cards/2 +1) {
		    				r2card=Math.pow(x,2)-1;		    				
		    			}
		    			while(r2card==0) {
		    				r2card=Math.pow(x,2)-1;
			    		}
		    			int rcard=(int) r2card;
		    			cards= cards-rcard;
		    			System.out.println("Computer removed " +rcard);
			    		System.out.println("There are " +cards +" cards left");
			    		if(cards<=1) {
			    			System.out.println("Computer won");
			    			break;
			    		}	
		    		}	    			    			    			    		
	    	}while(cards!=1); 	    	 	
	    }
	}
	private static void computerSmart() {
		Scanner input = new Scanner(System.in);
		SecureRandom r = new SecureRandom();
		if(mode==1 && starter==1) {
	    	do {
	    		if(cards> Math.pow(2,2)-1 ||cards==Math.pow(2,2)-1) {
	    			int rcard = r.nextInt(cards/2 +1);
	    			while(rcard==0) {
		    			rcard = r.nextInt(cards/2 +1);
		    		}
		    		cards= cards-rcard;
		    		System.out.println("Computer removed " +rcard);
		    		System.out.println("There are " +cards +" cards left");
		    		    		
		    		if(cards<=1) {
		    			System.out.println("Computer won");
		    			break;
		    		}
	    		}
		    		else {
		    			int x = r.nextInt(cards/2 +1);
		    		 double r2card=Math.pow(2,x)-1;	
		    			while(r2card>=cards/2 +1) {
		    				r2card=Math.pow(2,x)-1;		    				
		    			}
		    			int rcard=(int) r2card;
		    			cards= cards-rcard;
		    			System.out.println("Computer removed " +rcard);
			    		System.out.println("There are " +cards +" cards left");
			    		if(cards<=1) {
			    			System.out.println("Computer won");
			    			break;
			    		}	
		    		}
	    		System.out.print("Your turn. How many you want to remove: ");
	    		int removedCard =input.nextInt();
	    		while(removedCard>= cards/2 +1) {
	    			System.out.println("You cannot do that try again: ");
	    			System.out.print("Your turn. How many you want to remove: ");
		    		removedCard =input.nextInt();
	    		}
	    		cards= cards-removedCard;
	    		System.out.println("There are " +cards +" cards left");
	    		if(cards<=1) {
	    			System.out.println("You won");
	    			break;
	    		}
	    		   		
	    	}while(cards!=1);
	    }
	}
	
	
	
	
	
	
	public static void gameDemo() {	
	   // uncomment below to test your Game class
	   //Game game = new Game();
	   //game.play();
	}
	
	
	public static void extraDemo() {
		// In-lab assignments.
		System.out.println("Want to try demo game (0 for no) : ");
		Scanner input = new Scanner(System.in);
		int demoStarter= input.nextInt();
		if(demoStarter==0) {
			System.out.println("Thank you for playing");
		}
		else {
			puzzleVersion2();
		}
		// add method calls to test your in-lab questions.
		
	}
	
	// add methods for in-lab questions below
	
	private static void puzzleVersion1() {
		SecureRandom r = new SecureRandom();
		while(true) {
			int secondDigit= r.nextInt(10);
			while(secondDigit==0 || secondDigit==10) {
				secondDigit= r.nextInt(10);
			}
			int thirdDigit= r.nextInt(3);
			while(thirdDigit==0 || thirdDigit==secondDigit) {
				thirdDigit= r.nextInt(3);
			}
			int firstDigit= 3*thirdDigit;
			
			int digitSum= firstDigit+secondDigit+thirdDigit;
			while(!(digitSum==SUM-9) ||!(digitSum==SUM-7) ||!(digitSum==SUM-5) ||!(digitSum==SUM-3) ||!(digitSum==SUM-1)) {
				secondDigit= r.nextInt(10);
				while(secondDigit==0 || secondDigit==10) {
					secondDigit= r.nextInt(10);
				}
				thirdDigit= r.nextInt(3);
				while(thirdDigit==0 || thirdDigit==secondDigit) {
					thirdDigit= r.nextInt(3);
				}
		        firstDigit= 3*thirdDigit;
				
			digitSum= firstDigit+secondDigit+thirdDigit;			
			}
			int fourthDigit= SUM-digitSum;
			System.out.print(firstDigit);
			System.out.print(secondDigit);
			System.out.print(thirdDigit);
			System.out.print(fourthDigit);
			break;
		}
		
	}
	private static void puzzleVersion2() {
		int first=0;
		int second=0;
		int third=0;
		int last=0;
		int count=1;
		while(true) {
			for( first=3; first<10; first+=3) {
				 third= first/3;
				for( second=1; second<10; second++) {
					for( last=1; last<10; last+=2) {
					}
					
				}
			}
			while((first+second+third+last==SUM));
			System.out.print(first);
			System.out.print(second);
			System.out.print(third);
			System.out.println(last);
			count++;
			if(count==6) {
				break;
			}
			
		}
		
	}

}
