package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import org.testng.annotations.Test;

public class mergtwoArrays {
@Test
	public void join() {
		
		int a[]= {2,9,5,7,30};
		int b[]= {30,38,2,4,1};
		int c[]= new int [a.length+b.length];
		for(int i=0;i<a.length;i++) {
			 c[i]=a[i];
		}
			 for(int i=0;i<b.length;i++) {
				 c[i+a.length]=b[i];
			 }
			 
			 String j=Arrays.toString(c);
			 System.out.println(j);
		
		
	}
@Test
public void proirityQ() {
	
	PriorityQueue<String> q = new PriorityQueue<String>();
	q.add("a");
	q.add("jaha");
	q.add("kak");
	q.offer("nanm");
	
	q.element();
	q.peek();
	//q.remove();
	//q.poll();
	System.out.println(q);
	
	
}
}
