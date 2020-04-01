
/**
 * This class is supose to encapsulate a generic animal and be the parent class. Also defines simIS, Location,
 * full, and rested that bear and goldenfinch use. 
*@author Elizabeth Dunaway 
*@version 1.0
*AnimalSim_EDH
**/


import com.sun.jdi.Location;
import java.util.Random;

public abstract class Animal {
	
	protected int simID;//this is the ID of the animal 
	protected Location location;// where the animal is located
	protected boolean full;//if the animal is full after eating 
	protected boolean rested; //if the animal is rested or not 
	
	public Animal() {
		simID=0;
		location = [0,0]; 
		full = false;
		rested= false; 
	
	}//end animal class 
	/**
	 * this is the empty class set to 0 or false 
	 * @param simID
	 */
	
	public Animal(int simID, location) {
		this.simID= simID;
		this.location= location;
		this.full= false ;
		this.rested= true; 
				
	}//end prefered class 
	/**
	 * this sets what the variables should do for this class
	 * @return
	 */
	
	public boolean eat() {
	Random rand= new Random(); 
	double eaten= rand.nextInt(1);
	if( eaten <1) {
		full=false; 
	}
	else 
		full=false; 
		
	}//end eat 
	/**
	 * Eat makes a new variable called eaten that is a random number between 0 and 1.
	 * If eaten is less than 1 then full is set to false. 
	 * @return
	 */
	
	public boolean sleep() { 
	Random rand= new Random();
	double awake= rand.nextDouble(1.0);
	if(awake<1) {
		rested=false;
	}
	else
		rested =true; 
		
	}//end sleep 
	/**
	 * Sleep makes a new variable called awake that is a random number between 0 and 1.
	 * If awake is less than 1 then rested is set to false. 
	 * @return
	 */

	//Start getters and setters 
	protected int getSimID() {
		return simID;
	}

	protected void setSimID(int simID) {
		this.simID = simID;
	}

	protected Location getLocation() {
		return location;
	}

	protected void setLocation(Location location) {
		this.location = location;
	}

	protected boolean isFull() {
		return full;
	}

	protected void setFull(boolean full) {
		this.full = full;
	}

	protected boolean isRested() {
		return rested;
	}

	protected void setRested(boolean rested) {
		this.rested = rested;
	}
	
	//end getters and setters 
	
	

}//end animal class 
