
package cse360assign3;
/**
 * Description:
 * Program will do basic math arithmatic 
 * Also allow program to commit in github
 * @author Philllip Reyes
 * @version Febuary 22 2016
 */
public class Calculator {

	private int total;
	private String history;
	/*
	 * Constructor 
	 */
	public Calculator () {
		
		total = 0;  // not needed - included for clarity
		history = "0";// will record history of programs arithmatic 
	}
	/**
	 * This is our getter for the total
	 * @return total
	 */
	public int getTotal () {
		
		return total;
	}
	
	/**
	 * this will add an integer to value also will send the 
	 * operator and value to the addHistory() method
	 * @param value
	 */
	public void add (int value) {
		
		total = total + value;
	    addHistory( "+" , value + "" );
	}
	
	/**
	 * this will subtract from value also will send the 
	 * operator and value to the addHistory() method
	 * @param value
	 */
	public void subtract (int value) {
		
		total = total - value;
		addHistory( "-", value + "" );
	}
	
	/**
	 * this will multiply integer to value also will send the 
	 * operator and value to the addHistory() method
	 * @param value
	 */
	public void multiply (int value) {
		
		total = total * value;
		addHistory( "*", value + "" );
		
	}
	
	/**
	 * this will divide integer to value and will return zero is value is equal to zero also will send the 
	 * operator and value to the addHistory() method 
	 * @param value
	 */
	public void divide (int value) {
		
		if(value == 0){
			total = 0;
		}else{
		 
			total = total / value;
		}
		addHistory( "/", value + "" );
	}
	
	/**
	 * this will return the concatenate string Also programs getter
	 * @return
	 */
	public String getHistory(){
		
		return history;
	}
	
	/**
	 * this will concatenate the operator and number to string history  
	 * @param operator
	 * @param number
	 */
	public void addHistory ( String operator, String number ) {
		
		history = history.concat( " " + operator + " " + number );
	
	}
	
}
