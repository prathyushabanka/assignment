package week3assignment;
import java.util.Scanner;
import java.util.TreeSet;
public class Movie {
	
	public static void main(String[] args) {

	TreeSet<Movie1>mov=null;



	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("How would you like to Sort List");
		String sort=sc.next();



		if(sort.equalsIgnoreCase("price"))
		mov=new TreeSet<Movie1>(new MovieRating());



		else if(sort.equalsIgnoreCase("title"))
		mov=new TreeSet<Movie1>(new MovieRating());



		else if(sort.equalsIgnoreCase("name"))
		mov =new TreeSet<Movie1>();
	}
	mov.add(new Movie1(1,"ABc",10.00,134));
	mov.add(new Movie1(2,"xyz",6.00,123));
	mov.add(new Movie1(1,"klm",4.00,120));
	mov.add(new Movie1(1,"lmn",8.00,150));
	mov.add(new Movie1(1,"mno",87.00,129));



	System.out.println(mov);



	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}



	}

