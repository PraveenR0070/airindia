package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class Demo {
	@Test 
	public void max() {
		
		LinkedList<Integer>l=new LinkedList<Integer>();
		try {
		l.add(44);
		l.add(54);
		l.add(2);
		l.add(0);
		l.add(107);
		l.add(1544);
		System.out.println("Maximum value"+Collections.max(l));
		}
		catch (ClassCastException | NoSuchElementException e) {
			System.out.println("Exception caught"+e);
		}
		
		
	}
	@Test
	public void list() {
		
		HashSet<String>st = new HashSet<String>();
		st.add("suresh");
		st.add("mhaaga");
		st.add("nagesh");
		st.add("perr");
		st.add("sumesh");
		st.add("pool");
		st.add("pool");
		
		
		
	    System.out.println(st);
	    
	    st.remove(3);
	    System.out.println(st);
	
		
		
	}
	

}
