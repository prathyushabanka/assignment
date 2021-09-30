package corejavaexercises;
import java.util.Scanner;
public class PositiveString {
	public static boolean checkPositive(String s) {
		char ch[] = s.toCharArray();
		for (int i=0; i<ch.length-1; i++) {
		if(ch[i] > ch[i+1]) {
			return true;
		
		}
		}
		return false;
	}
			

		
	
        public static void main(String[]args)
        {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.next();
		s = s.toLowerCase();
		System.out.println(PositiveString.checkPositive(s));
		}
}

	




