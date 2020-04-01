/** 
 * This is suppose to be the Location class that encapsulates a point on a map. This is an abstract method
 * to Animal. 
 * @author eduna
 *
 */
public class Location {
	
	private int xCoord; // this is the x coordinate on the map 
	private int yCoord; // this is the y coordinate on the map 
	
	public Location() { 
		
	}//end empty location 
	/**
	 * the empty constructor sets the map to (0,0). 
	 * @param x
	 * @param y
	 */
	
	public Location(int x, int y) { 
		this.xCoord = x ;
		this.yCoord = y; 
				
		
	}// end prefered constructor 
	/**
	 * Passes the data into the x and y coordinates 
	 * @param x
	 * @param y
	 */
	
	public update(int x, int y) {
		
	}//end update 
	
	public int[] getCoordinates() {
		return null; 
		
	}//end getCoordinates 
/**
 * this gets the coordinates from the classes 
 */
	
	//getters and setters 
	private int getxCoord() {
		return xCoord;
	}
	private void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}
	private int getyCoord() {
		return yCoord;
	}
	private void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}
	//end getters and setters 
	
	

}//end Location 
