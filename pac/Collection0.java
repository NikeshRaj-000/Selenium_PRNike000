package Com.pac;

import java.util.ArrayList;
import java.util.List;

public class Collection0 {

	public static void main(String[] args) {
		List<Object>z1=new ArrayList<>();
		z1.add("Testing");
		z1.add(123);
		z1.add("java");
		z1.add("Class a");
		z1.add("Testing completed");
		z1.add("Successful");
		z1.add('J');
		z1.add('V');
		z1.add('R');
      System.out.println(z1);
      int y = z1.size();
      System.out.println(y);
      Object obj = z1.get(2);
      System.out.println(obj);
      z1.set(2, 123);
      System.out.println(z1);
      z1.remove(5);
      System.out.println(z1);
      int indef = z1.indexOf('j');
      System.out.println(indef);
	boolean contains = z1.contains("Successful");
	System.out.println(contains);
		
		
		
		
	}

}
