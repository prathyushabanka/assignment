package assignment1;

public class FizzBuzz {
	public static int fizz()
	{
	int n= 15;
	if((n%3==0)&&(n%5==0))
	{
	System.out.println("FizzBuzz");
	}
	else if(n%3==0)
	{
	System.out.println("Fizz");
	}
	else if(n%5==0)
	{
	System.out.println("Buzz");
	}
	else{
	System.out.println(n);
	}
	return n;
	}
	public static void main (String[]args)
	{
	 FizzBuzz.fizz();
	 }
	 }




