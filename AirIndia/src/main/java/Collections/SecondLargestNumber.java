package Collections;

import org.testng.annotations.Test;

public class SecondLargestNumber {
	
	@Test
	public void logics() {
		int temp;
		int[]a= {2,4,9,20,40};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				
				}
			}
			
		}
		System.out.println("second Largest number is"+a[2]);
		
		
	}
	@Test
	public void secondSmallest() {
		int[]s= {30,6,20,37,99,10};
		int temp;
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]>s[j]) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					
				}
			}
			
		}
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		
		System.out.println("secound smallest"+s[1]);
		
		
	}
	

}
