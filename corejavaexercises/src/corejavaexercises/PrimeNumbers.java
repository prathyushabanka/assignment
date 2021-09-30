package corejavaexercises;
import java.util.Scanner; 

public class PrimeNumbers {
	public static void main(String[] args) { 

		  
 

		Scanner s = new Scanner(System.in); 

		System.out.println("Enter your Number"); 

		int n= s.nextInt(); 

		for(int i=2;i<=n;i++) 

		{ 

		  int count = 0; 

		for(int j=1;j<=i;j++) 

		{ 

		if(i % j ==0) 

		count = count+1; 

		} 

		 

		   if(count==2) 

		  { 

		System.out.println(i);  

		  } 

		} 

		s.close(); 

		} 

		} 

