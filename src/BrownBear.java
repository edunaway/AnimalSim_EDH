
/**
 * This class is the BrownBear class. It is a subclass of Animal. It has differnt types of bears which is 
 * what the subSpecies variable does. 
 */

public class BrownBear extends Animal {
	
	private String subSpecies{"alaskan, asiatic, european, grizzly, kodiak, siberian"}; //this is a String of differnt types of bears 

	public BrownBear() {
		super(); 
		simID=0; 
		location =[0,0];
		full=false; 
		rested=true; 
		subSpecies= alaskan; 

	}//empty BrownBear 
	/** 
	 * this is the empty class that uses the super to extend from Animal class. 
	 * Sets the variables to 0. 
	 */
	
	public BrownBear(simID, Location 1, subSpecies) {
		super(); 
		this.simID = ID; 
		this.location = location; 
		this.subSpecies = subSpecies; 
		full = false; 
		rested = true; 
	}//prefered constructors 
	/**
	 * This is the preferred constructor that allows data to be passed into the constructor. 
	 */
	

}//end BrownBear
