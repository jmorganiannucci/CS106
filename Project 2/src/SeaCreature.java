import java.util.Scanner;
import java.lang.String;   
public class SeaCreature {

	public static int q1 (Scanner leScanner) {
		while(true){
		
			System.out.println("1. Where would you want to live?");
			System.out.println("A. In the mountains B. A city C. The beach D. On a farm");
			
			//int option = leScanner.nextInt();
			String answer = leScanner.nextLine(); 
			System.out.println(answer); 
		
			if (answer.equals("A")){ 
				return 1;	
			}
			if (answer.equals("B")){ 	
				return 2;	
			}
			if (answer.equals("C")){ 	
				return 3;
			}
			if (answer.equals("D")){
				return 4;	
			}
			System.out.println("Invalid answer, please enter single letter.");
		}
	}
	public static int q2 (Scanner leScanner) {
		while(true){
		
			System.out.println("2. What is your favorite color?");
			System.out.println("A. Green B. Blue C. Purple D. Red");
			
			//int option = leScanner.nextInt();
			String answer = leScanner.nextLine(); 
			System.out.println(answer); 
		
			if (answer.equals("A")){ 
				return 1;	
			}
			if (answer.equals("B")){ 	
				return 2;	
			}
			if (answer.equals("C")){ 	
				return 3;
			}
			if (answer.equals("D")){
				return 4;	
			}
			System.out.println("Invalid answer, please enter single letter.");
		}
	}
	public static int q3 (Scanner leScanner) {
		while(true){
		
			System.out.println("3. When you are at the beach do you?");
			System.out.println("A. Go wind surfing B. Lay in the sun C. Swim D. Make sandcastles");
			
			//int option = leScanner.nextInt();
			String answer = leScanner.nextLine(); 
			System.out.println(answer); 
		
			if (answer.equals("A")){ 
				return 1;	
			}
			if (answer.equals("B")){ 	
				return 2;	
			}
			if (answer.equals("C")){ 	
				return 3;
			}
			if (answer.equals("D")){
				return 4;	
			}
			System.out.println("Invalid answer, please enter single letter.");
		}
	}
	public static int q4 (Scanner leScanner) {
		while(true){
		
			System.out.println("4. What is your favorite class?");
			System.out.println("A. Creative Writing B. Math C. History D. Biology");
			
			//int option = leScanner.nextInt();
			String answer = leScanner.nextLine(); 
			System.out.println(answer); 
		
			if (answer.equals("A")){ 
				return 1;	
			}
			if (answer.equals("B")){ 	
				return 2;	
			}
			if (answer.equals("C")){ 	
				return 3;
			}
			if (answer.equals("D")){
				return 4;	
			}
			System.out.println("Invalid answer, please enter single letter.");
		}
	}
	public static int q5 (Scanner leScanner) {
		while(true){
		
			System.out.println("5. Which season do you enjoy most?");
			System.out.println("A. Fall B. Summer C. Winter D. Spring");
			
			//int option = leScanner.nextInt();
			String answer = leScanner.nextLine(); 
			System.out.println(answer); 
		
			if (answer.equals("A")){ 
				return 1;	
			}
			if (answer.equals("B")){ 	
				return 2;	
			}
			if (answer.equals("C")){ 	
				return 3;
			}
			if (answer.equals("D")){
				return 4;	
			}
			System.out.println("Invalid answer, please enter single letter.");
		}
	}
	public static int q6 (Scanner leScanner) {
		while(true){
		
			System.out.println("6. What is your favorite food?");
			System.out.println("A. Salad B. Cheeseburger C. Pasta D. Sushi");
			
			//int option = leScanner.nextInt();
			String answer = leScanner.nextLine(); 
			System.out.println(answer); 
		
			if (answer.equals("A")){ 
				return 1;	
			}
			if (answer.equals("B")){ 	
				return 2;	
			}
			if (answer.equals("C")){ 	
				return 3;
			}
			if (answer.equals("D")){
				return 4;	
			}
			System.out.println("Invalid answer, please enter single letter.");
		}
	}
	public static int q7 (Scanner leScanner) {
		while(true){
		
			System.out.println("7. What is your favorite kind of music?");
			System.out.println("A. Acoustic B. Rock C. Techno D. Jazz");
			
			//int option = leScanner.nextInt();
			String answer = leScanner.nextLine(); 
			System.out.println(answer); 
		
			if (answer.equals("A")){ 
				return 1;	
			}
			if (answer.equals("B")){ 	
				return 2;	
			}
			if (answer.equals("C")){ 	
				return 3;
			}
			if (answer.equals("D")){
				return 4;	
			}
			System.out.println("Invalid answer, please enter single letter.");
		}
	}
	public static void main (String []args) {
		
		Scanner leScanner = new Scanner(System.in);
		
		int total = 0;
	 	
		System.out.println ("What kind of sea creature are you?");
		System.out.println("Complete this quiz to find out!"); 
		System.out.println("");
		
		total += q1(leScanner);
		total += q2(leScanner); 
		total += q3(leScanner); 
		total += q4(leScanner); 
		total += q5(leScanner);
		total += q6(leScanner);

		System.out.println("This is the total: " + total); 
	

	}
	
}
