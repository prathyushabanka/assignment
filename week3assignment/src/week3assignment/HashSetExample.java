package week3assignment;
import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Book> set = new HashSet<Book>();
		Book b1 = new Book(101, "Let us C","Yashwant Kanetkar","BPB",8);



		Book b2 = new Book(102,"Data Structers","Reema Thareja","Forozan",4);



		Book b3 = new Book(103,"Operating Systems","Galvin","Wiley",6);
		Book b4 = new Book(103,"Operating Systems","Galvin","Wiley",6);



		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);



		for(Book b:set) {
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		}





		}


