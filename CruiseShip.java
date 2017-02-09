//------------------------------------
// 1541-50
// Java Programming 1
// Homework Assignment 13
// December 14, 2015 
// Programmer: Anna Marlena
//------------------------------------

/**
	The CruiseShip class extends the Ship class.
*/

public class CruiseShip extends Ship 
{
	private int passengers;		// the maximum number of passengers

	// constructor

	/**
		The constructor creates a CruiseShip object.
		@param n The name of the ship.
		@param y The year the ship was built.
		@param p The maximum number of passengers the ship can hold.
	*/

	public CruiseShip(String n, String y, int p)
	{
		// call the superclass constructor
		super(n, y);

		// set the maximum number of passengers
		passengers = p;
	}

	// appropriate accessor and mutator methods

	/**
		The setPassengers method 
		@param p The max number of passengers.
	*/

	public void setPassengers(int p)
	{
		passengers = p;
	}

	/**
		The getPassengers method 
		@return passengers The maximum number of passengers.
	*/

	public int getPassengers()
	{
		return passengers;
	}

	// a toString method that overrides the toString method in the 
	// base class. this toString method should display only the ship's
	// name and the max number of passengers

	/**
		The toString method
		@return str Returns a string displaying the ship's name and max
					number of passengers.
	*/
	@Override 
	public String toString()
	{
		String str = "Name: " + getName() + 
					"\nMaximum passengers: " + passengers +
					"\n----------------------------";

		return str;
	}
	
}
