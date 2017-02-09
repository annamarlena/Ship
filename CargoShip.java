//------------------------------------
// 1541-50
// Java Programming 1
// Homework Assignment 13
// December 14, 2015 
// Programmer: Anna Marlena 
//------------------------------------

/**
	The CargoShip class extends the Ship class.
*/

public class CargoShip extends Ship
{
	private int tonnage;	// the cargo capacity in tonnage

	// constructor

	/**
		The constructor creates a CargoShip object.
		@param n The name of the ship.
		@param y The year the ship was built.
		@param t The cargo capacity of the ship.
	*/

	public CargoShip(String n, String y, int t)
	{
		// call the superclass constructor
		super(n, y);

		// set the tonnage
		tonnage = t;
	}

	// appropriate accessor and mutator methods

	/**
		The setTonnage method
		@param t The cargo capacity of the ship, in tonnage.
	*/

	public void setTonnage(int t)
	{
		tonnage = t;
	}

	/**
		The getTonnage method
		@return t Returns the cargo capacity of the ship.
	*/

	public int getTonnage()
	{
		return tonnage;
	}

	// a toString method that overrides the toString method in the base
	// class. this toString method should display only the ship's name
	// and cargo capacity.

	/**
		The toString method
		@return str Returns a string indicating the name of the ship and the cargo
					capacity, in tonnage.
	*/

	@Override 
	public String toString()
	{
		String str = "Name: " + getName() +
					"\nCargo capacity: " + tonnage + " tons" +
					"\n----------------------------";

		return str;
	}
}
