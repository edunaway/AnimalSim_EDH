
/**
 * This is the Goldfinch class that is a subclass of Animal. This class has the wingspan variable which is a number
 * between 5 and 11. 
 * @author eduna
 *
 */

public class GoldFinch extends Animal{

	private double wingSpan; //this variable is the wingspan of GoldFinch 
	
	private GoldFinch() { 
		super(); 
		simID =0;
		location =new Location(0,0);
		wingSpan = 9.0;
		full =false;
		rested=true;
		wingSpan=9.0; 
		
	}//end empty goldfinch 
	/**
	 * this is the empty constructor that sets the variables back. 
	 * @param simID
	 */
	
	private Goldfinch(int simID, Location, wingSpan) {
		super(); 
		this.simID = simID; 
		this.location = ;
		this.wingSpan= wingSpan;
		full=false; 
		rested= true; 
		
	}//end prefered goldfinch 
	/**
	 * this the prefered constructor that allows the data to be passed in. 
	 * @return
	 */
	
	//getters and setters 
	private double getWingSpan() {
		return wingSpan;
	}

	private void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}
//end getters and setters 
	
	
}

	
