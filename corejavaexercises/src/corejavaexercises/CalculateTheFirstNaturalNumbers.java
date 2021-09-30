package corejavaexercises;

public class CalculateTheFirstNaturalNumbers {
	public static int calculateSum(int y)
	{
	int sum =0;
	for(int i=1;i<=y;i++)
	if(i%3==0 && i%5==0)
	{
	sum = sum+i;
	System.out.println("the divisors of both 3 and 5 is " +i);
	}
	return sum;
	}

	 public static void main(String[] args) {
	System.out.println("the sum of the divisors is "+calculateSum(100));
	}

	}
