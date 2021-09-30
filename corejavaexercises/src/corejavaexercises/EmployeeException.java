package corejavaexercises;
import java.util.Scanner;


public class EmployeeException {
	  public static void main(String[] args) {
	        EmployeeException E1 = new EmployeeException();
	        try
	        {
	            Scanner s = new Scanner(System.in);
	            System.out.println("Enter the salary");
	            int sal = s.nextInt();
	            E1.personSal(sal);  

	 

	    }  

	 

	    catch( EmployeeExceptions e){  

	 

	    System.out.println(e.EmployeeSal());  

	 

	    }  

	 

	    }  

	 

	    public void personSal(int sal) throws  EmployeeExceptions{  

	 

	    if (sal>=3000){  

	 

	    System.out.println(" Your salary is above 3000 ");  

	 

	    }  

	 

	    else{  

	 

	    throw new  EmployeeExceptions();  

	 

	    }  

	 

	    }  

	 

	    }  

	 

	    class  EmployeeExceptions extends Exception{  

	 

	    public String EmployeeSal(){  

	 

	    return "Your Salary is lessthan 3000";  

	 

	    }  

	 

	    }

	 

	        
	    

	 


	 

