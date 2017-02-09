//------------------------------------
// 1541-50
// Java Programming 1
// Homework Assignment 13
// December 14, 2015 
// Programmer: Anna Marlena
//------------------------------------

import java.util.Scanner;  // Needed for the Scanner class

/**
	The ShipDemo class demonstrates the Ship, CruiseShip and CargoShip classes.
*/

// demonstate the classes in a program that has a Ship array. 

public class ShipDemo
{
	public static void main(String[] args)
	{
		// create an array to hold 3 kinds of Ship objects
		Ship[] array = new Ship[3];

		// Assign various Ship, CruiseShip, and CargoShip 
		// objects to the array elements.
		Ship ship1 = new Ship("Lolipop", "1960");
		Ship ship2 = new CruiseShip("Disney Magic", "1999", 2400);
		Ship ship3 = new CargoShip("Black Pearl", "2013", 50000);

		array[0] = ship1;
		array[1] = ship2;
		array[2] = ship3;

		// Step through the array, calling each object's toString method.
		for (int index = 0; index< array.length; index++)
			System.out.println(array[index]);
	}
}
