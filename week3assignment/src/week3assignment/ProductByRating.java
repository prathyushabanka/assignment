package week3assignment;

import java.util.Comparator;



public class ProductByRating implements Comparator<Product> {



@Override
public int compare(Product o1, Product o2) {
String s1 = o1.getName();
String s2 = o2.getName();
System.out.println(s1+ " compared to " +s2);
return (int) (o1.getPrice()-o2.getPrice()); 
}



}


