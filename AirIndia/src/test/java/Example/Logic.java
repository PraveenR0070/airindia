package Example;

import org.testng.annotations.Test;

public class Logic {
	
	
//1

//2 3

//4 5 6

//7 8 9 10
	//opening the chrome 
@Test
	public void printvalues() {
	
	
		//int count =1;
	for (int i=1;i<=4;i++) {
		for (int j=1;j<=i;j++) {
		
		
		System.out.print(" * ");
		//count++;
		}
		System.out.println();
	}
	System.out.println("******************************");
		
	}
	
	
	public void printpiramid() {
		
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
			
			System.out.print(k +" ");
		}
		System.out.println();
		}
	}
	@Test
	public void last() {
		int count =1;
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" * ");
			}
			for (int k=1;k<=i;k++) {
				System.out.print(" ");
			
				//count++;
			}
			System.out.println();
		}
		
		
	}
	@Test
	public void next() {
		int count =1;
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++,count++) {
				//System.out.print(count );
				System.out.print(count+" " );
			
				//count++;
			}
			System.out.println();
		}
		
		
	}
	
	
	
	
	
	
	
		
		
	}
	
	
	


