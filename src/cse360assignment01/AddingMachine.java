package cse360assignment01;

public class AddingMachine {
		private int total;
		private String str;  
		
		  public AddingMachine () {
		    total = 0;  // not needed - included for clarity
		    str = "0";	//Variable used to keep track of all operations
		  }
		  //Returns total value
		  public int getTotal () {
		    return total;	//Returns the total value
		  }
		  //Changes the value of total by adding value
		  public void add (int value) {
			  total = total + value;	//Adds value to total
			  str = str + " + " + value;	//Adds the the string for the toString method
		  }
		  //Changes the value of total by subtracting value
		  public void subtract (int value) {
			  total = total - value;	//Subtracts the value of total by value
			  str = str + " - " + value;	//subtracts the the string for the toString method
		  }
		  //Return a value that displays all the operations
		  public String toString () {
		    return str;	//Returns str which keeps track of all operations
		  }
		  //Clears all the operations displayed
		  public void clear() {
			  str = "0";	//Resets the string to total value
			  total = 0;	//Resets total to zero
		  }
		  
		}
