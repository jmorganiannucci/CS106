import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class main {
	public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException{
		//System.out.println("Hello World!");
		
		Ecosystem eco = new Ecosystem();
		
		
		Scanner fileReader = new Scanner(new File("src/input")); //scanner for input 
		PrintWriter writer = new PrintWriter("src/output", "UTF-8");
		
		
		String skip;
		for(int i = 1; i <= 16; i++){		//skip the input file headers
			skip = fileReader.next();
			//System.out.println("Skip: " + skip);
		}
		
		
		while (fileReader.hasNext()) { //while there are tokens in the file they will be read until there are no more
			String name = fileReader.next();
			
			String ipopStr = fileReader.next();
			
			int ipop = Integer.parseInt(ipopStr);
			
			String prey = fileReader.next();
			
			String consumptionStr = fileReader.next();
			int consumption = Integer.parseInt(consumptionStr);
			
			String reproductionStr = fileReader.next();
			int reproduction = Integer.parseInt(reproductionStr);
			
			Species tmp = new Species(name, ipop, prey, consumption, reproduction);
			
			eco.addSpecies(tmp);
		}
		
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("How many months would you like to observe?");
		int months = in.nextInt();
		
		
		eco.printData(writer);
		
		for(int i = 1; i <= months; i++){
			eco.nextMonth();
			eco.printData(writer);
		}
		
		fileReader.close();
		writer.close();
	}
}
