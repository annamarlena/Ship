//------------------------------------
// 1541-50
// Java Programming 1
// Homework Assignment 13
// December 14, 2015 
// Programmer: Anna Marlena
//------------------------------------

/**
	The Ship class is the superclass to the CruiseShip and CargoShip classes.
*/

public class Ship
{ 
	private String name;		// the name of the ship
	private String yearBuilt;	// the year the ship was built 

	// constructor 

	/**
		The constructor creates a Ship object.
		@param n The ship's name.
		@param y The year the ship was built.
	*/
	public Ship(String n, String y)
	{
		name = n;
		yearBuilt = y;
	}

	// approriate accessor and mutator methods

	/**
		The setName method sets the name of the ship.
		@param n The name of the ship
	*/
	public void setName(String n)
	{
		name = n;
	}

	/**
		The setYearBuilt method sets the year the ship was built
		@param y The year the ship was built, as a String
	*/
	public void setYearBuilt(String y)
	{
		yearBuilt = y;
	}

	/**
		The getName method returns the name of the Ship 
		@return name The name of the ship.
	*/
	public String getName()
	{
		return name;
	}

	/**
		The getYearBuilt method returns the year the ship was built
		@return yearBuilt The year the ship was built
	*/
	public String getYearBuilt()
	{
		return yearBuilt;
	}

	// a toString method that displays the ship's name and the year it was built

	/**
		The toString method displays the ship's name and the year it was built.
		@return str A string indicating the ship's name and the year it was built.
	*/
	public String toString()
	{
		String str = "Name: " + name + "\nYear built: " + yearBuilt +
					"\n----------------------------";

		return str;
	}
}





