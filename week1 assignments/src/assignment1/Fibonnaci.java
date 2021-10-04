package assignment1;

public class Fibonnaci {
	  public static void main(String[] args) {

		    int n = 10, firstTerm = 1, secondTerm = 2;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; i++) {
		      System.out.print(firstTerm + ", ");

		      // compute the next term
		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
		    }
		  }
		}

