package week3assignment;

import java.util.HashMap;
import java.util.Map;

public class SampleMapDemo {
	public static void main(String[] args) {
		Map<Integer,Member>members=new HashMap<Integer,Member>();
		members.put(234,new Member("Prathyusha","prathyushabanka93@gmail.com","9490265503"));
		members.put(265,new Member("kranthi","kranthi97@gmail.com","9497856503"));
		members.put(789,new Member("Apple","apple34@gmail.com","9490265503"));
		members.put(298,new Member("Ashu","ashu87@gmail.com","9490265503"));
		System.out.println(members);
		
	}

}
