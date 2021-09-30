package corejavaexercises;
import java.util.Arrays;

public class SecondSmallest {
	public static void main(String[]args)
	{

	int a[] = {8,19,36,64};
	secondSmallest(a);

	}


	 

	private static void secondSmallest(int[] a) {

	Arrays.sort(a);

	System.out.println("the second smallest element "+a[1]);
	}
	}


