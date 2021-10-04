package week3assignment;
	import java.util.Comparator;

	public class MovieRating implements Comparator<Movie1> {



		@Override
		public int compare(Movie1 o1, Movie1 o2) {
		int s1 = o1.getPrice();
		int s2 = o2.getPrice();
		System.out.println(s1+ " compared to " +s2);
		return (int) (o1.getPrice()-o2.getPrice()) ;
		}






		}





	


