import java.util.Scanner;
public class RowingCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.println("Do you want to know your time or your split average for a 2k?"); 
		System.out.println("Press 1 to calculate split average and 2 to calculate time."); 
		int option = in.nextInt(); 
		System.out.println(option);
		
		if (option == 1){ //enter time
			System.out.println("I present you with your split average.");
		}
		
		if (option == 2){ //enter split average
			System.out.println("I present you with your time");
		}
			
		

	}
		
		
		
	}

