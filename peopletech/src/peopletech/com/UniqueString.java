package peopletech.com;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class UniqueString {
	public static void main(String[] args) {
	String s = "prathyusha";
	char ch[] = s.toCharArray();
	Map<Character,Integer>map = new HashMap<>();
	int count =0;
	for(int i=0;i<ch.length;i++)
	{
	count = 0;
	for(int j=0;j<ch.length;j++)
	{
	if(ch[i]==ch[j])
	{
	count++;
	}
	}




	map.put(ch[i],count );
	}
	System.out.println(map);




	}



	}

