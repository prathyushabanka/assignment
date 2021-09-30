package corejavaexercises;
import java.util.Scanner;
import java.util.StringTokenizer; 
public class TokenizerClass {
	public static void main(String[] args) { 
	Scanner scan = new Scanner(System.in); 
	System.out.println("Enter the integers "); 
	String s = scan.nextLine(); 
	        StringTokenizer str = new StringTokenizer(s); 
	        int  sum=0; 
	     while (str.hasMoreTokens()) {
	         
	         int num=0;
	         num = Integer.parseInt(str.nextToken(" ")); 
	         System.out.println(num); 
	         sum += num; 
	     }   
	     System.out.println("sum of all integers is: " + sum); 
	
	} 

}
