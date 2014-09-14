import java.util.Scanner; //Import scanner library for user input in program 
public class RowingCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.println("Do you want to know your time or your split average for a 2k?"); 
		System.out.println("Press 1 to calculate split average and 2 to calculate time."); //Asks user for their option 
		int option = in.nextInt(); //Read in option from user in console 
		System.out.println(option); //Print option back to user 
		
		if (option == 1){ //enter time in minutes, then seconds "==" asks if the variable is equal to some value 
			System.out.println("What is your time in minutes?");
			int minutes = in.nextInt(); //single = assigns a variable to a value 
			System.out.println("What is your time in seconds?");
			int seconds = in.nextInt();
			
			//begin calculations
			//Step 1: multiply minutes by 60 to convert into seconds then add remaining seconds  
			int totalTimeInSec = (minutes * 60) + seconds;   
			System.out.println("Total time in seconds: " +totalTimeInSec);  //to concatenate letters and variables together add +
			
			
			//Step 3: take total time and divide by 4 to determine time per 500 meters 
			int timePerFive = (totalTimeInSec/4);
			System.out.println("Time per 500 meters: " +timePerFive +" seconds" ); 
			
			
			//Step 4: need to convert time per 500 meters back into minutes and seconds 
			int splitInMins = (timePerFive /60); 
			int splitInSecs = (timePerFive %60);
			System.out.println("I present you with your split average.");
			System.out.println(splitInMins +":"+ splitInSecs);
			//print split
			

		}
		if (option == 2){ //enter split average in minutes, then seconds
			System.out.println("What is your split average in minutes?"); 
			int splitMin = in.nextInt(); 
			System.out.println("What is your split average in seconds?");
			int splitSec = in.nextInt();
			
			
			System.out.println("I present you with your time");
		}
			
		

	}
		
		
		
	}

