package corejavaexercises;
import java.util.Scanner;

public class Fullname {
	public static void main(String[] args) { 

		Scanner scan = new Scanner(System.in); 

		  

		try { 

		String firstName = "B.Prathyusha"; 

		String lastName = ""; 

		placeHolder(firstName, lastName); 

		} catch (nameException e) { 

		System.out.println(e.fullNameException()); 

		} 

		  

		} 

		  

		static void placeHolder(String firstName, String lastName) throws nameException { 

		if (firstName.isEmpty() || lastName.isEmpty()) { 

		throw new nameException(); 

		} else { 

		System.out.println("Your name is :" + firstName + " " + lastName); 

		} 

		} 

		  

		} 

		  

		class nameException extends Exception { 

		  

		public String fullNameException() { 

		return " please enter the full name"; 

		} 

		  

		} 


