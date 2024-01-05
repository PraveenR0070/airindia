package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class ArrrrayList {
	@Test
	public void newone() {
	
	List <String >ar = new LinkedList<String>();
	
	ar.add("manisha");
	ar.add("Nishanth");
	ar.add("Karthik");
	ar.add("sumith");
	ar.add("benz");
	ar.add("2");
	
	for (int i=0;i<ar.size();i++) {
		String st=ar.get(i);
		System.out.println(st);
	}
	
	
	System.out.println(ar);
	ar.remove(0);
	System.out.println(ar);
	//ar.add("2");

	ar.set(3, "navaneth");
	System.out.println("afeter set"+ar);
	
	System.out.println( ar.contains("2"));
	
	System.out.println(ar.isEmpty());
	Collections.sort(ar);
	System.out.println(ar);
	Collections.reverse(ar);
	System.out.println(ar);
	System.out.println("#################################");
	}
	@Test
	public void arrlist() {
		
	ArrayList<Integer> as= new ArrayList<Integer>();
	as.add(4);
	as.add(34);
	as.add(59);
	as.add(26);
	as.add(24);
	System.out.println(as);
	Collections.sort(as);
	System.out.println(as);
    as.set(3,99);
    System.out.println(as);
    as.contains("99");
    
	
		
		
			
			
		
	}
	}

	
	
	
	
	
	



