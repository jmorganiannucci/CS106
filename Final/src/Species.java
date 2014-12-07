

public class Species {
	Species(String name, int pop, String prey, int cons, int repr){
		name_ = name;
		pop_ = pop;
		prey_ = prey;
		cons_ = cons;
		repr_ = repr;
	}
	
	String getName(){
		return name_;
	}
	
	void eat(Species prey){	//returns how many are eaten
		if(!prey.name_.equals(prey_)){
			return;
		}
		int numFedOrg = 0;		//number of predators fed
		int numEatenOrg = 0;	//number of prey eaten
		while(prey.pop_ > cons_ && numFedOrg<pop_){
			prey.die(cons_);
			numFedOrg++;
		}
		die(pop_-numFedOrg);
	}
	
	void die(int deaths){  //kill off "deaths" number of organisms
		pop_-=deaths;
		if(pop_<0){
			pop_=0;
		}
	}
	
	Boolean canReproduce(){
		if(pop_ > 0){
			return true;
		}
		return false;
	}
	
	void reproduce(){
		if(canReproduce()){
			pop_+=repr_;
		}
	}
	
	
	String name_;	//species name
	int pop_;		//population
	String prey_;	//prey
	int cons_; 		//amount of consumption
	int repr_;		//amount of reproduction
	
}
