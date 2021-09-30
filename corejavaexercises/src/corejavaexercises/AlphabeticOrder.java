package corejavaexercises;
import java.util.Arrays;
public class AlphabeticOrder{
	public static void Order(String[]a)
	{
		System.out.println("The UpperCase And LowerCase of the String Arrays is");
		
		for(int i=0;i<a.length;i++)
		{
		if(i/2==0)
		{
		System.out.println(a[i].toUpperCase());
		}
		else
		{
		System.out.println(a[i].toLowerCase());
		}
        }
		}
	
	public static void main(String[]args)
	{
		
		String a[] = {"abc","bcd","efg","edr"};
		Arrays.sort(a);
		System.out.println("the sorted array is " +Arrays.toString(a));
		Order(a);
	}
}
