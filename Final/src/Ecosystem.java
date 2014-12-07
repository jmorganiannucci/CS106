import java.io.PrintWriter;
import java.util.ArrayList;


public class Ecosystem {
	
	void addSpecies(Species s){
		arr_.add(s);
	}
	
	int findSpecies(String name){
		if(name.equals("-")){
			return -1;
		}
		
		for(int i = 0; i < arr_.size(); i++){
			Species s = (Species) arr_.get(i);
			if(s.name_.equals(name)){
				return i;
			}
		}
	
		
		
		System.out.println("Error: No existing Species named: "+name);
		System.out.println("Likely input file mistake for prey");
		System.exit(0);
		return -1;
	}

	
	void nextMonth(){
		month_++;
		for(int i = 0; i < arr_.size(); i++){
			Species s = (Species) arr_.get(i);
			s.reproduce();
			try{
				Species prey = (Species) arr_.get(findSpecies(s.prey_));
				s.eat(prey);
			}
			catch(IndexOutOfBoundsException e){
				
			}
		}	
	}
	
	void printData(PrintWriter writer){
		writer.println("===============Month: "+ month_ +"===============");
		for(int i = 0; i < arr_.size(); i++){
			Species s = (Species) arr_.get(i);
			writer.println("\t"+s.name_+" : "+s.pop_);
		}
	}
	
	
	
	//member variables
	int month_;
	ArrayList arr_ = new ArrayList<Species>();;
}